package com.hospital;

/**
 * Created by Anjalii on 22-09-2024.
 */
public class Appointment {
    private String appointmentID;
    private Patient patient;
    private String doctorName;
    private String department;
    private String appointmentDate;
    private String appointmentTime;

    public Appointment(String appointmentID, Patient patient, String doctorName, String department, String appointmentDate, String appointmentTime) {
        this.appointmentID = appointmentID;
        this.patient = patient;
        this.doctorName = doctorName;
        this.department = department;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
    }

    // Getters and setters
}


