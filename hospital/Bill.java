package com.hospital;

/**
 * Created by Anjalii on 22-09-2024.
 */
public class Bill {
    private String billID;
    private Patient patient;
    private double consultationFee;
    private double medicineFee;
    private double labTestsFee;
    private double totalAmount;

    public Bill(String billID, Patient patient, double consultationFee, double medicineFee, double labTestsFee) {
        this.billID = billID;
        this.patient = patient;
        this.consultationFee = consultationFee;
        this.medicineFee = medicineFee;
        this.labTestsFee = labTestsFee;
        this.totalAmount = consultationFee + medicineFee + labTestsFee;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    // Other methods and setters


}
