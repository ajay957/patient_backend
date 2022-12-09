package com.example.Patient_Backend.dao;

import com.example.Patient_Backend.model.Patient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientDao extends CrudRepository<Patient,Integer> {

    @Query(value = "SELECT `id`, `date_of_appo`, `doctor_name`, `mob_no`, `patient_id`, `patient_name`, `image` FROM `patientdb` WHERE `patient_name` like %:patient_name%",nativeQuery = true)
    List<Patient> SearchPatient(@Param("patient_name") String patient_name);
}
