package com.neusoft.his.entity;

public class Register {
    private int ID;
    private String CaseNumber;
    private String RealName;
    private int Gender;
    private String IDnumber;
    private String BirthDate;
    private int Age;
    private String AgeType;
    private String HomeAddress;
    private String VisitDate;
    private String Noon;
    private int DeptID;
    private int UserID;
    private int RegistLeID;
    private int SettleID;
    private String IsBook;
    private String RegistTime;
    private int RegisterID;
    private int VisitState;
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
	public String getRealName() {
		return RealName;
	}
	public void setRealName(String realName) {
		RealName = realName;
	}
	public int getGender() {
		return Gender;
	}
	public void setGender(int gender) {
		Gender = gender;
	}
	public String getIDnumber() {
		return IDnumber;
	}
	public void setIDnumber(String iDnumber) {
		IDnumber = iDnumber;
	}
	public String getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(String birthDate) {
		BirthDate = birthDate;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getAgeType() {
		return AgeType;
	}
	public void setAgeType(String ageType) {
		AgeType = ageType;
	}
	public String getHomeAddress() {
		return HomeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		HomeAddress = homeAddress;
	}
	public String getVisitDate() {
		return VisitDate;
	}
	public void setVisitDate(String visitDate) {
		VisitDate = visitDate;
	}
	public String getNoon() {
		return Noon;
	}
	public void setNoon(String noon) {
		Noon = noon;
	}
	public int getDeptID() {
		return DeptID;
	}
	public void setDeptID(int deptID) {
		DeptID = deptID;
	}
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public int getRegistLeID() {
		return RegistLeID;
	}
	public void setRegistLeID(int registLeID) {
		RegistLeID = registLeID;
	}
	public int getSettleID() {
		return SettleID;
	}
	public void setSettleID(int settleID) {
		SettleID = settleID;
	}
	public String getIsBook() {
		return IsBook;
	}
	public void setIsBook(String isBook) {
		IsBook = isBook;
	}
	public String getRegistTime() {
		return RegistTime;
	}
	public void setRegistTime(String registTime) {
		RegistTime = registTime;
	}
	public int getRegisterID() {
		return RegisterID;
	}
	public void setRegisterID(int registerID) {
		RegisterID = registerID;
	}
	public int getVisitState() {
		return VisitState;
	}
	public void setVisitState(int visitState) {
		VisitState = visitState;
	}
	public Register() {
		super();
	}
	public Register(int iD, String caseNumber, String realName, int gender, String iDnumber, String birthDate, int age,
			String ageType, String homeAddress, String visitDate, String noon, int deptID, int userID, int registLeID,
			int settleID, String isBook, String registTime, int registerID, int visitState) {
		super();
		ID = iD;
		CaseNumber = caseNumber;
		RealName = realName;
		Gender = gender;
		IDnumber = iDnumber;
		BirthDate = birthDate;
		Age = age;
		AgeType = ageType;
		HomeAddress = homeAddress;
		VisitDate = visitDate;
		Noon = noon;
		DeptID = deptID;
		UserID = userID;
		RegistLeID = registLeID;
		SettleID = settleID;
		IsBook = isBook;
		RegistTime = registTime;
		RegisterID = registerID;
		VisitState = visitState;
	}
    
}
