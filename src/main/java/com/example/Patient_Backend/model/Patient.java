package com.example.Patient_Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patientdb")
public class Patient {
    @Id
    @GeneratedValue
    private int id;
    private int patientId;
    private String patientName;
    private String dateOfAppo;
    private String image;
    private String mobNo;
    private String doctorName;

    public Patient() {
    }

    public Patient(int id, int patientId, String patientName, String dateOfAppo, String image, String mobNo, String doctorName) {
        this.id = id;
        this.patientId = patientId;
        this.patientName = patientName;
        this.dateOfAppo = dateOfAppo;
        this.image = image;
        this.mobNo = mobNo;
        this.doctorName = doctorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDateOfAppo() {
        return dateOfAppo;
    }

    public void setDateOfAppo(String dateOfAppo) {
        this.dateOfAppo = dateOfAppo;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
}
