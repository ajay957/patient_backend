package com.example.Patient_Backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @GetMapping("/")
    public String HomePage(){
        return "welcome to home page of patient";
    }
    @PostMapping("/add")
    public String AddPatient(){
        return "Patient added successfully";
    }
    @GetMapping("/view")
    public String ViewPatient(){
        return "welcome to view patient page";
    }

}
