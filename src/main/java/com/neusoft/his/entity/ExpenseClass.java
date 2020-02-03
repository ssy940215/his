package com.neusoft.his.entity;

public class ExpenseClass {
    private int ID;
    private String ExpCode;
    private String ExpName;
    private int DelMark;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getExpCode() {
		return ExpCode;
	}
	public void setExpCode(String expCode) {
		ExpCode = expCode;
	}
	public String getExpName() {
		return ExpName;
	}
	public void setExpName(String expName) {
		ExpName = expName;
	}
	public int getDelMark() {
		return DelMark;
	}
	public void setDelMark(int delMark) {
		DelMark = delMark;
	}
	public ExpenseClass() {
		super();
	}
	public ExpenseClass(int iD, String expCode, String expName, int delMark) {
		super();
		ID = iD;
		ExpCode = expCode;
		ExpName = expName;
		DelMark = delMark;
	}
    
}
