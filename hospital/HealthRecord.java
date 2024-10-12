package com.hospital;

/**
 * Created by Anjalii on 22-09-2024.
 */
public class HealthRecord {
    private String recordID;
    private Patient patient;
    private String doctorNotes;
    private String diagnosis;
    private String prescribedMedication;
    private String treatment;

    public HealthRecord(String recordID, Patient patient, String doctorNotes, String diagnosis, String prescribedMedication, String treatment) {
        this.recordID = recordID;
        this.patient = patient;
        this.doctorNotes = doctorNotes;
        this.diagnosis = diagnosis;
        this.prescribedMedication = prescribedMedication;
        this.treatment = treatment;
    }

    // Getters and setters
}


