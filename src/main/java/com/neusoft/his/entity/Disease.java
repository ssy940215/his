package com.neusoft.his.entity;

public class Disease {
    private int ID;
    private String DiseaseCode;
    private String DiseaseName;
    private String DiseaseICD;
    private int DiseCategoryID;
    private int DelMark;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getDiseaseCode() {
		return DiseaseCode;
	}
	public void setDiseaseCode(String diseaseCode) {
		DiseaseCode = diseaseCode;
	}
	public String getDiseaseName() {
		return DiseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		DiseaseName = diseaseName;
	}
	public String getDiseaseICD() {
		return DiseaseICD;
	}
	public void setDiseaseICD(String diseaseICD) {
		DiseaseICD = diseaseICD;
	}
	public int getDiseCategoryID() {
		return DiseCategoryID;
	}
	public void setDiseCategoryID(int diseCategoryID) {
		DiseCategoryID = diseCategoryID;
	}
	public int getDelMark() {
		return DelMark;
	}
	public void setDelMark(int delMark) {
		DelMark = delMark;
	}
	public Disease() {
		super();
	}
	public Disease(int iD, String diseaseCode, String diseaseName, String diseaseICD, int diseCategoryID, int delMark) {
		super();
		ID = iD;
		DiseaseCode = diseaseCode;
		DiseaseName = diseaseName;
		DiseaseICD = diseaseICD;
		DiseCategoryID = diseCategoryID;
		DelMark = delMark;
	}
    
}
