package com.neusoft.his.entity;

public class Fmeditem {
    private int ID;
    private String ItemCode;
    private String ItemName;
    private String Format;
    private double Price;
    private int ExpClassID;
    private int DeptID;
    private String MnemonicCode;
    private String CreationDate;
    private String LastUpdateDate;
    private int RecordType;
    private int DelMark;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getItemCode() {
		return ItemCode;
	}
	public void setItemCode(String itemCode) {
		ItemCode = itemCode;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public String getFormat() {
		return Format;
	}
	public void setFormat(String format) {
		Format = format;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getExpClassID() {
		return ExpClassID;
	}
	public void setExpClassID(int expClassID) {
		ExpClassID = expClassID;
	}
	public int getDeptID() {
		return DeptID;
	}
	public void setDeptID(int deptID) {
		DeptID = deptID;
	}
	public String getMnemonicCode() {
		return MnemonicCode;
	}
	public void setMnemonicCode(String mnemonicCode) {
		MnemonicCode = mnemonicCode;
	}
	public String getCreationDate() {
		return CreationDate;
	}
	public void setCreationDate(String creationDate) {
		CreationDate = creationDate;
	}
	public String getLastUpdateDate() {
		return LastUpdateDate;
	}
	public void setLastUpdateDate(String lastUpdateDate) {
		LastUpdateDate = lastUpdateDate;
	}
	public int getRecordType() {
		return RecordType;
	}
	public void setRecordType(int recordType) {
		RecordType = recordType;
	}
	public int getDelMark() {
		return DelMark;
	}
	public void setDelMark(int delMark) {
		DelMark = delMark;
	}
	public Fmeditem() {
		super();
	}
	public Fmeditem(int iD, String itemCode, String itemName, String format, double price, int expClassID, int deptID,
			String mnemonicCode, String creationDate, String lastUpdateDate, int recordType, int delMark) {
		super();
		ID = iD;
		ItemCode = itemCode;
		ItemName = itemName;
		Format = format;
		Price = price;
		ExpClassID = expClassID;
		DeptID = deptID;
		MnemonicCode = mnemonicCode;
		CreationDate = creationDate;
		LastUpdateDate = lastUpdateDate;
		RecordType = recordType;
		DelMark = delMark;
	}
    
}
