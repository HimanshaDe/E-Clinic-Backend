package com.medicalsystem.eclinic.controller;

import com.medicalsystem.eclinic.service.nlp.Train;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/nlp")
@CrossOrigin
public class NLPService {


    @PostMapping
    public void trainModals(){
//        Train.run();
    }
}
