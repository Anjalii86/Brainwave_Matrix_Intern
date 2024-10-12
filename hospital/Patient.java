package com.hospital;

/**
 * Created by Anjalii on 22-09-2024.
 */
public class Patient {
    private String patientID;
    private String name;
    private int age;
    private String gender;
    private String contactNumber;
    private String address;
    private String medicalHistory;

    public Patient(String patientID, String name, int age, String gender, String contactNumber, String address, String medicalHistory) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
        this.address = address;
        this.medicalHistory = medicalHistory;
    }

    // Getters and setters
    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }
    // Other getter and setter methods
}



