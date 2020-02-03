package com.neusoft.his.entity;

public class HerbalTemplate {
    private int ID;
    private String Name;
    private int DoctorID;
    private String CreationTime;
    private String PrescriptioType;
    private int PayNumber;
    private String DrugsUsage;
    private String Therapy;
    private String Detailed;
    private String Advice;
    private String Scope;
    private int DelMark;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getDoctorID() {
		return DoctorID;
	}
	public void setDoctorID(int doctorID) {
		DoctorID = doctorID;
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
	public String getScope() {
		return Scope;
	}
	public void setScope(String scope) {
		Scope = scope;
	}
	public int getDelMark() {
		return DelMark;
	}
	public void setDelMark(int delMark) {
		DelMark = delMark;
	}
	public HerbalTemplate() {
		super();
	}
	public HerbalTemplate(int iD, String name, int doctorID, String creationTime, String prescriptioType, int payNumber,
			String drugsUsage, String therapy, String detailed, String advice, String scope, int delMark) {
		super();
		ID = iD;
		Name = name;
		DoctorID = doctorID;
		CreationTime = creationTime;
		PrescriptioType = prescriptioType;
		PayNumber = payNumber;
		DrugsUsage = drugsUsage;
		Therapy = therapy;
		Detailed = detailed;
		Advice = advice;
		Scope = scope;
		DelMark = delMark;
	}
    
}
