package com.medicalsystem.eclinic.service.nlp;

import edu.stanford.nlp.ie.NERClassifierCombiner;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.DefaultPaths;
import edu.stanford.nlp.pipeline.NERCombinerAnnotator;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.CoreMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Properties;

@Service
@Slf4j
public class AutomaticDiseaseDetectService {

    public static final String NER_MISCCLASS = DefaultPaths.DEFAULT_NER_CONLL_MODEL;
    private StanfordCoreNLP pipeline;
    private NERClassifierCombiner nerClassifierCombiner;

    public AutomaticDiseaseDetectService() {

    }

    private void build(){
        ClassPathResource pathResource = new ClassPathResource("./ner-modals/ner-model.ser.gz");
        Properties nerProps = new Properties();
        nerProps.setProperty("ner.applyNumericClassifiers",
                "true");
        nerProps.setProperty("ner.useSUTime",
                "true");
        nerProps.setProperty("ner.model",
                pathResource.getPath() + "," + NER_MISCCLASS);


        nerClassifierCombiner = NERClassifierCombiner.createNERClassifierCombiner("ner",
                nerProps);
        NERCombinerAnnotator nerAnnotator = new NERCombinerAnnotator(nerClassifierCombiner,
                false);

        Properties props = new Properties();

        props.setProperty("annotators",
                "tokenize,ssplit,pos,lemma,ner,entitymentions");

        pipeline = new StanfordCoreNLP(props);
        pipeline.addAnnotator(nerAnnotator);
    }

    public List<Entity> getDetectedEntries(String rawText){

        if(Objects.isNull(pipeline)){
            build();
        }

        Annotation document = new Annotation(rawText);
        pipeline.annotate(document);

        List<Entity> entityList = new ArrayList<>();
        List<CoreMap> sentences = document.get(CoreAnnotations.SentencesAnnotation.class);
        for (CoreMap sentence : sentences) {
            log.info("Sentence : " + sentence.toString());
            // get confidences for tokens
            log.info("NER " + nerClassifierCombiner.classifyWithInlineXML(sentence.toString()));
            for (CoreMap tokens : sentence.get(CoreAnnotations.MentionsAnnotation.class)) {
                final String NER = tokens.get(CoreAnnotations.NamedEntityTagAnnotation.class);
                final String NER_VALUE = tokens.get(CoreAnnotations.TextAnnotation.class);
                final Double confidence = tokens.get(CoreAnnotations.NamedEntityTagProbsAnnotation.class).get(NER);
                final Entity entity = Entity.builder().name(NER).value(NER_VALUE).confidence(confidence).build();
                if(Objects.nonNull(entity.getConfidence()) && confidence > 0.8){
                    entityList.add(entity);
                }
            }
        }
        return entityList;
    }
}
