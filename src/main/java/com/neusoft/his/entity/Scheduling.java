package com.neusoft.his.entity;

public class Scheduling {
    private int ID;
    private String SchedDate;
    private int DeptID;
    private int UserID;
    private String Noon;
    private int RuleID;
    private int DelMark;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getSchedDate() {
		return SchedDate;
	}
	public void setSchedDate(String schedDate) {
		SchedDate = schedDate;
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
	public String getNoon() {
		return Noon;
	}
	public void setNoon(String noon) {
		Noon = noon;
	}
	public int getRuleID() {
		return RuleID;
	}
	public void setRuleID(int ruleID) {
		RuleID = ruleID;
	}
	public int getDelMark() {
		return DelMark;
	}
	public void setDelMark(int delMark) {
		DelMark = delMark;
	}
	public Scheduling() {
		super();
	}
	public Scheduling(int iD, String schedDate, int deptID, int userID, String noon, int ruleID, int delMark) {
		super();
		ID = iD;
		SchedDate = schedDate;
		DeptID = deptID;
		UserID = userID;
		Noon = noon;
		RuleID = ruleID;
		DelMark = delMark;
	}
    
}
