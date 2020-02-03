package com.neusoft.his.entity;

public class Invoice {
    private int ID;
    private String InvoiceNum;
    private double Money;
    private int State;
    private String CreationTime;
    private int UserID;
    private int RegistID;
    private int FeeType;
    private String Back;
    private int DailyState;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getInvoiceNum() {
		return InvoiceNum;
	}
	public void setInvoiceNum(String invoiceNum) {
		InvoiceNum = invoiceNum;
	}
	public double getMoney() {
		return Money;
	}
	public void setMoney(double money) {
		Money = money;
	}
	public int getState() {
		return State;
	}
	public void setState(int state) {
		State = state;
	}
	public String getCreationTime() {
		return CreationTime;
	}
	public void setCreationTime(String creationTime) {
		CreationTime = creationTime;
	}
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public int getRegistID() {
		return RegistID;
	}
	public void setRegistID(int registID) {
		RegistID = registID;
	}
	public int getFeeType() {
		return FeeType;
	}
	public void setFeeType(int feeType) {
		FeeType = feeType;
	}
	public String getBack() {
		return Back;
	}
	public void setBack(String back) {
		Back = back;
	}
	public int getDailyState() {
		return DailyState;
	}
	public void setDailyState(int dailyState) {
		DailyState = dailyState;
	}
	public Invoice() {
		super();
	}
	public Invoice(int iD, String invoiceNum, double money, int state, String creationTime, int userID, int registID,
			int feeType, String back, int dailyState) {
		super();
		ID = iD;
		InvoiceNum = invoiceNum;
		Money = money;
		State = state;
		CreationTime = creationTime;
		UserID = userID;
		RegistID = registID;
		FeeType = feeType;
		Back = back;
		DailyState = dailyState;
	}
    
}
