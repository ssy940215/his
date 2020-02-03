package com.neusoft.his.entity;

public class MedicalDisease {
    private int ID;
    private int MedicalID;
    private int RegistID;
    private int DiseaseID;
    private int DiagnoseType;
    private String GetSiskDate;
    private int DiagnoseCate;
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
	public int getDiseaseID() {
		return DiseaseID;
	}
	public void setDiseaseID(int diseaseID) {
		DiseaseID = diseaseID;
	}
	public int getDiagnoseType() {
		return DiagnoseType;
	}
	public void setDiagnoseType(int diagnoseType) {
		DiagnoseType = diagnoseType;
	}
	public String getGetSiskDate() {
		return GetSiskDate;
	}
	public void setGetSiskDate(String getSiskDate) {
		GetSiskDate = getSiskDate;
	}
	public int getDiagnoseCate() {
		return DiagnoseCate;
	}
	public void setDiagnoseCate(int diagnoseCate) {
		DiagnoseCate = diagnoseCate;
	}
	public MedicalDisease() {
		super();
	}
	public MedicalDisease(int iD, int medicalID, int registID, int diseaseID, int diagnoseType, String getSiskDate,
			int diagnoseCate) {
		super();
		ID = iD;
		MedicalID = medicalID;
		RegistID = registID;
		DiseaseID = diseaseID;
		DiagnoseType = diagnoseType;
		GetSiskDate = getSiskDate;
		DiagnoseCate = diagnoseCate;
	}
    
}
