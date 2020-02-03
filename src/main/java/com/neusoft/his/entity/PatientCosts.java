package com.neusoft.his.entity;

public class PatientCosts {
    private int ID;
    private int RegistID;
    private int InvoiceID;
    private int ItemID;
    private int ItemType;
    private String Name;
    private double Price;
    private double Amount;
    private int DeptID;
    private String Createtime;
    private int CreateOperID;
    private String PayTime;
    private int RegisterID;
    private int FeeType;
    private int BackID;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getRegistID() {
		return RegistID;
	}
	public void setRegistID(int registID) {
		RegistID = registID;
	}
	public int getInvoiceID() {
		return InvoiceID;
	}
	public void setInvoiceID(int invoiceID) {
		InvoiceID = invoiceID;
	}
	public int getItemID() {
		return ItemID;
	}
	public void setItemID(int itemID) {
		ItemID = itemID;
	}
	public int getItemType() {
		return ItemType;
	}
	public void setItemType(int itemType) {
		ItemType = itemType;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	public int getDeptID() {
		return DeptID;
	}
	public void setDeptID(int deptID) {
		DeptID = deptID;
	}
	public String getCreatetime() {
		return Createtime;
	}
	public void setCreatetime(String createtime) {
		Createtime = createtime;
	}
	public int getCreateOperID() {
		return CreateOperID;
	}
	public void setCreateOperID(int createOperID) {
		CreateOperID = createOperID;
	}
	public String getPayTime() {
		return PayTime;
	}
	public void setPayTime(String payTime) {
		PayTime = payTime;
	}
	public int getRegisterID() {
		return RegisterID;
	}
	public void setRegisterID(int registerID) {
		RegisterID = registerID;
	}
	public int getFeeType() {
		return FeeType;
	}
	public void setFeeType(int feeType) {
		FeeType = feeType;
	}
	public int getBackID() {
		return BackID;
	}
	public void setBackID(int backID) {
		BackID = backID;
	}
	public PatientCosts() {
		super();
	}
	public PatientCosts(int iD, int registID, int invoiceID, int itemID, int itemType, String name, double price,
			double amount, int deptID, String createtime, int createOperID, String payTime, int registerID, int feeType,
			int backID) {
		super();
		ID = iD;
		RegistID = registID;
		InvoiceID = invoiceID;
		ItemID = itemID;
		ItemType = itemType;
		Name = name;
		Price = price;
		Amount = amount;
		DeptID = deptID;
		Createtime = createtime;
		CreateOperID = createOperID;
		PayTime = payTime;
		RegisterID = registerID;
		FeeType = feeType;
		BackID = backID;
	}
    
}
