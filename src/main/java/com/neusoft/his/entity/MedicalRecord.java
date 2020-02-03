package com.neusoft.his.entity;

public class MedicalRecord {
    private int ID;
    private String CaseNumber;
    private int RegistID;
    private String Readme;
    private String Present;
    private String PresentTreat;
    private String History;
    private String Allergy;
    private String Physique;
    private String Proposal;
    private String Careful;
    private String CheckResult;
    private String Diagnosis;
    private String Handling;
    private int CaseState;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getCaseNumber() {
		return CaseNumber;
	}
	public void setCaseNumber(String caseNumber) {
		CaseNumber = caseNumber;
	}
	public int getRegistID() {
		return RegistID;
	}
	public void setRegistID(int registID) {
		RegistID = registID;
	}
	public String getReadme() {
		return Readme;
	}
	public void setReadme(String readme) {
		Readme = readme;
	}
	public String getPresent() {
		return Present;
	}
	public void setPresent(String present) {
		Present = present;
	}
	public String getPresentTreat() {
		return PresentTreat;
	}
	public void setPresentTreat(String presentTreat) {
		PresentTreat = presentTreat;
	}
	public String getHistory() {
		return History;
	}
	public void setHistory(String history) {
		History = history;
	}
	public String getAllergy() {
		return Allergy;
	}
	public void setAllergy(String allergy) {
		Allergy = allergy;
	}
	public String getPhysique() {
		return Physique;
	}
	public void setPhysique(String physique) {
		Physique = physique;
	}
	public String getProposal() {
		return Proposal;
	}
	public void setProposal(String proposal) {
		Proposal = proposal;
	}
	public String getCareful() {
		return Careful;
	}
	public void setCareful(String careful) {
		Careful = careful;
	}
	public String getCheckResult() {
		return CheckResult;
	}
	public void setCheckResult(String checkResult) {
		CheckResult = checkResult;
	}
	public String getDiagnosis() {
		return Diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		Diagnosis = diagnosis;
	}
	public String getHandling() {
		return Handling;
	}
	public void setHandling(String handling) {
		Handling = handling;
	}
	public int getCaseState() {
		return CaseState;
	}
	public void setCaseState(int caseState) {
		CaseState = caseState;
	}
	public MedicalRecord() {
		super();
	}
	public MedicalRecord(int iD, String caseNumber, int registID, String readme, String present, String presentTreat,
			String history, String allergy, String physique, String proposal, String careful, String checkResult,
			String diagnosis, String handling, int caseState) {
		super();
		ID = iD;
		CaseNumber = caseNumber;
		RegistID = registID;
		Readme = readme;
		Present = present;
		PresentTreat = presentTreat;
		History = history;
		Allergy = allergy;
		Physique = physique;
		Proposal = proposal;
		Careful = careful;
		CheckResult = checkResult;
		Diagnosis = diagnosis;
		Handling = handling;
		CaseState = caseState;
	}
    
}
