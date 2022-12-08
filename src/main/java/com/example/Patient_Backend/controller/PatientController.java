package com.example.Patient_Backend.controller;

import com.example.Patient_Backend.dao.PatientDao;
import com.example.Patient_Backend.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientDao dao;

    @GetMapping("/")
    public String HomePage(){
        return "welcome to home page of patient";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddPatient(@RequestBody Patient p){
        System.out.println(p.getPatientId());
        System.out.println(p.getPatientName().toString());
        System.out.println(p.getDateOfAppo().toString());
        System.out.println(p.getMobNo().toString());
        System.out.println(p.getDoctorName().toString());
        dao.save(p);
        return "Patient added successfully";
    }
    @GetMapping("/view")
    public List<Patient> ViewPatient(){
        return(List<Patient>) dao.findAll();
    }

}
