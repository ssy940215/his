package com.neusoft.his.entity;

public class HerbalPrescription {
    private int ID;
    private int MedicalID;
    private int RegistID;
    private int UserID;
    private String PrescriptionName;
    private String CreationTime;
    private String PrescriptioType;
    private int PayNumber;
    private String Frequency;
    private String DrugsUsage;
    private String Therapy;
    private String Detailed;
    private String Advice;
    private int State;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getMedicalID() {
		return MedicalID;
	}
	public void setMedicalID(int medicalID) {
		MedicalID = medicalID;
	}
	public int getRegistID() {
		return RegistID;
	}
	public void setRegistID(int registID) {
		RegistID = registID;
	}
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getPrescriptionName() {
		return PrescriptionName;
	}
	public void setPrescriptionName(String prescriptionName) {
		PrescriptionName = prescriptionName;
	}
	public String getCreationTime() {
		return CreationTime;
	}
	public void setCreationTime(String creationTime) {
		CreationTime = creationTime;
	}
	public String getPrescriptioType() {
		return PrescriptioType;
	}
	public void setPrescriptioType(String prescriptioType) {
		PrescriptioType = prescriptioType;
	}
	public int getPayNumber() {
		return PayNumber;
	}
	public void setPayNumber(int payNumber) {
		PayNumber = payNumber;
	}
	public String getFrequency() {
		return Frequency;
	}
	public void setFrequency(String frequency) {
		Frequency = frequency;
	}
	public String getDrugsUsage() {
		return DrugsUsage;
	}
	public void setDrugsUsage(String drugsUsage) {
		DrugsUsage = drugsUsage;
	}
	public String getTherapy() {
		return Therapy;
	}
	public void setTherapy(String therapy) {
		Therapy = therapy;
	}
	public String getDetailed() {
		return Detailed;
	}
	public void setDetailed(String detailed) {
		Detailed = detailed;
	}
	public String getAdvice() {
		return Advice;
	}
	public void setAdvice(String advice) {
		Advice = advice;
	}
	public int getState() {
		return State;
	}
	public void setState(int state) {
		State = state;
	}
	public HerbalPrescription() {
		super();
	}
	public HerbalPrescription(int iD, int medicalID, int registID, int userID, String prescriptionName,
			String creationTime, String prescriptioType, int payNumber, String frequency, String drugsUsage,
			String therapy, String detailed, String advice, int state) {
		super();
		ID = iD;
		MedicalID = medicalID;
		RegistID = registID;
		UserID = userID;
		PrescriptionName = prescriptionName;
		CreationTime = creationTime;
		PrescriptioType = prescriptioType;
		PayNumber = payNumber;
		Frequency = frequency;
		DrugsUsage = drugsUsage;
		Therapy = therapy;
		Detailed = detailed;
		Advice = advice;
		State = state;
	}
    
}
