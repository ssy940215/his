package com.neusoft.his.entity;

public class Prescription {
    private int ID;
    private int MedicalID;
    private int RegistID;
    private int UserID;
    private String PrescriptionName;
    private String PrescriptionTime;
    private int PrescriptionState;
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
	public String getPrescriptionTime() {
		return PrescriptionTime;
	}
	public void setPrescriptionTime(String prescriptionTime) {
		PrescriptionTime = prescriptionTime;
	}
	public int getPrescriptionState() {
		return PrescriptionState;
	}
	public void setPrescriptionState(int prescriptionState) {
		PrescriptionState = prescriptionState;
	}
	public Prescription() {
		super();
	}
	public Prescription(int iD, int medicalID, int registID, int userID, String prescriptionName,
			String prescriptionTime, int prescriptionState) {
		super();
		ID = iD;
		MedicalID = medicalID;
		RegistID = registID;
		UserID = userID;
		PrescriptionName = prescriptionName;
		PrescriptionTime = prescriptionTime;
		PrescriptionState = prescriptionState;
	}
    
}
