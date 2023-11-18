package com.medicalsystem.eclinic.service.nlp;

import edu.stanford.nlp.ie.crf.CRFClassifier;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.sequences.SeqClassifierFlags;
import edu.stanford.nlp.util.StringUtils;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.util.Properties;

public class Train {

    public static void main(String[] args) {
        train();

    }

    private static void train(){
      try {
          String nlpPropertyFilePath = new File("src/main/resources/nlp.properties").getPath();
          Properties props = StringUtils.propFileToProperties(nlpPropertyFilePath);
          SeqClassifierFlags flags = new SeqClassifierFlags(props);
          CRFClassifier<CoreLabel> crf = new CRFClassifier<>(flags);
          crf.train();
          crf.serializeClassifier("src/main/resources/ner-modals/ner-model.ser.gz");
      }catch (Exception e){
          e.printStackTrace();
      }
    }
}
