package com.example.Patient_Backend.dao;

import com.example.Patient_Backend.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientDao extends CrudRepository<Patient,Integer> {
}
