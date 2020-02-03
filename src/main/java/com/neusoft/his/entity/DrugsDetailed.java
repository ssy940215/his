package com.neusoft.his.entity;

public class DrugsDetailed {
    private int ID;
    private int DrugsTempID;
    private int DrugsID;
    private String DrugsUsage;
    private String Dosage;
    private String Frequency;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getDrugsTempID() {
		return DrugsTempID;
	}
	public void setDrugsTempID(int drugsTempID) {
		DrugsTempID = drugsTempID;
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
	public DrugsDetailed() {
		super();
	}
	public DrugsDetailed(int iD, int drugsTempID, int drugsID, String drugsUsage, String dosage, String frequency) {
		super();
		ID = iD;
		DrugsTempID = drugsTempID;
		DrugsID = drugsID;
		DrugsUsage = drugsUsage;
		Dosage = dosage;
		Frequency = frequency;
	}
    
}
