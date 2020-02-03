package com.neusoft.his.entity;

public class CheckApply {
    private int ID;
    private int MedicalID;
    private int RegistID;
    private int ItemID;
    private String Name;
    private String Objective;
    private String Position;
    private int IsUrgent;
    private int Num;
    private String CreationTime;
    private int DoctorID;
    private int CheckOperID;
    private int ResultOperID;
    private String CheckTime;
    private String Result;
    private String ResultTime;
    private int State;
    private int RecordType;
    
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
	public int getItemID() {
		return ItemID;
	}
	public void setItemID(int itemID) {
		ItemID = itemID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getObjective() {
		return Objective;
	}
	public void setObjective(String objective) {
		Objective = objective;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public int getIsUrgent() {
		return IsUrgent;
	}
	public void setIsUrgent(int isUrgent) {
		IsUrgent = isUrgent;
	}
	public int getNum() {
		return Num;
	}
	public void setNum(int num) {
		Num = num;
	}
	public String getCreationTime() {
		return CreationTime;
	}
	public void setCreationTime(String creationTime) {
		CreationTime = creationTime;
	}
	public int getDoctorID() {
		return DoctorID;
	}
	public void setDoctorID(int doctorID) {
		DoctorID = doctorID;
	}
	public int getCheckOperID() {
		return CheckOperID;
	}
	public void setCheckOperID(int checkOperID) {
		CheckOperID = checkOperID;
	}
	public int getResultOperID() {
		return ResultOperID;
	}
	public void setResultOperID(int resultOperID) {
		ResultOperID = resultOperID;
	}
	public String getCheckTime() {
		return CheckTime;
	}
	public void setCheckTime(String checkTime) {
		CheckTime = checkTime;
	}
	public String getResult() {
		return Result;
	}
	public void setResult(String result) {
		Result = result;
	}
	public String getResultTime() {
		return ResultTime;
	}
	public void setResultTime(String resultTime) {
		ResultTime = resultTime;
	}
	public int getState() {
		return State;
	}
	public void setState(int state) {
		State = state;
	}
	public int getRecordType() {
		return RecordType;
	}
	public void setRecordType(int recordType) {
		RecordType = recordType;
	}
	public CheckApply() {
		super();
	}
	public CheckApply(int iD, int medicalID, int registID, int itemID, String name, String objective, String position,
			int isUrgent, int num, String creationTime, int doctorID, int checkOperID, int resultOperID,
			String checkTime, String result, String resultTime, int state, int recordType) {
		super();
		ID = iD;
		MedicalID = medicalID;
		RegistID = registID;
		ItemID = itemID;
		Name = name;
		Objective = objective;
		Position = position;
		IsUrgent = isUrgent;
		Num = num;
		CreationTime = creationTime;
		DoctorID = doctorID;
		CheckOperID = checkOperID;
		ResultOperID = resultOperID;
		CheckTime = checkTime;
		Result = result;
		ResultTime = resultTime;
		State = state;
		RecordType = recordType;
	}

}
