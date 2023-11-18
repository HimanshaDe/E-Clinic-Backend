package com.medicalsystem.eclinic.controller;

import com.medicalsystem.eclinic.dto.request.HomeInfoDTO;
import com.medicalsystem.eclinic.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/home")
@CrossOrigin
public class HomeController {


    @Autowired
    private HomeService homeService;

    public HomeController() {
    }

    @GetMapping
    public HomeInfoDTO GetCount(){
        return  homeService.getCounter();


    }

}
