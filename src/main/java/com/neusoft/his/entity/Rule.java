package com.neusoft.his.entity;

public class Rule {
    private int ID;
    private String RuleName;
    private int DeptID;
    private int UserID;
    private String Week;
    private int DelMark;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getRuleName() {
		return RuleName;
	}
	public void setRuleName(String ruleName) {
		RuleName = ruleName;
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
	public String getWeek() {
		return Week;
	}
	public void setWeek(String week) {
		Week = week;
	}
	public int getDelMark() {
		return DelMark;
	}
	public void setDelMark(int delMark) {
		DelMark = delMark;
	}
	public Rule() {
		super();
	}
	public Rule(int iD, String ruleName, int deptID, int userID, String week, int delMark) {
		super();
		ID = iD;
		RuleName = ruleName;
		DeptID = deptID;
		UserID = userID;
		Week = week;
		DelMark = delMark;
	}
    
}
