package com.neusoft.his.entity;

public class ConstantItem {
    private int ID;
    private int ConstantTypeID;
    private String ConstantCode;
    private String ConstantName;
    private int DelMark;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getConstantTypeID() {
		return ConstantTypeID;
	}
	public void setConstantTypeID(int constantTypeID) {
		ConstantTypeID = constantTypeID;
	}
	public String getConstantCode() {
		return ConstantCode;
	}
	public void setConstantCode(String constantCode) {
		ConstantCode = constantCode;
	}
	public String getConstantName() {
		return ConstantName;
	}
	public void setConstantName(String constantName) {
		ConstantName = constantName;
	}
	public int getDelMark() {
		return DelMark;
	}
	public void setDelMark(int delMark) {
		DelMark = delMark;
	}
	public ConstantItem() {
		super();
	}
	public ConstantItem(int iD, int constantTypeID, String constantCode, String constantName, int delMark) {
		super();
		ID = iD;
		ConstantTypeID = constantTypeID;
		ConstantCode = constantCode;
		ConstantName = constantName;
		DelMark = delMark;
	}
    
}
