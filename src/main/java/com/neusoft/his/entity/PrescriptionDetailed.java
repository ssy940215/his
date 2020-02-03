package com.neusoft.his.entity;

public class PrescriptionDetailed {
    private int ID;
    private int PrescriptionID;
    private int DrugsID;
    private String DrugsUsage;
    private String Dosage;
    private String Frequency;
    private double Amount;
    private int State;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getPrescriptionID() {
		return PrescriptionID;
	}
	public void setPrescriptionID(int prescriptionID) {
		PrescriptionID = prescriptionID;
	}
	public int getDrugsID() {
		return DrugsID;
	}
	public void setDrugsID(int drugsID) {
		DrugsID = drugsID;
	}
	public String getDrugsUsage() {
		return DrugsUsage;
	}
	public void setDrugsUsage(String drugsUsage) {
		DrugsUsage = drugsUsage;
	}
	public String getDosage() {
		return Dosage;
	}
	public void setDosage(String dosage) {
		Dosage = dosage;
	}
	public String getFrequency() {
		return Frequency;
	}
	public void setFrequency(String frequency) {
		Frequency = frequency;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	public int getState() {
		return State;
	}
	public void setState(int state) {
		State = state;
	}
	public PrescriptionDetailed() {
		super();
	}
	public PrescriptionDetailed(int iD, int prescriptionID, int drugsID, String drugsUsage, String dosage,
			String frequency, double amount, int state) {
		super();
		ID = iD;
		PrescriptionID = prescriptionID;
		DrugsID = drugsID;
		DrugsUsage = drugsUsage;
		Dosage = dosage;
		Frequency = frequency;
		Amount = amount;
		State = state;
	}
    
}
