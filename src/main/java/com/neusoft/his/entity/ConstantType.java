package com.neusoft.his.entity;

public class ConstantType {
    private int ID;
    private String ConstantTypeCode;
    private String ConstantTypeName;
    private int DelMark;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getConstantTypeCode() {
		return ConstantTypeCode;
	}
	public void setConstantTypeCode(String constantTypeCode) {
		ConstantTypeCode = constantTypeCode;
	}
	public String getConstantTypeName() {
		return ConstantTypeName;
	}
	public void setConstantTypeName(String constantTypeName) {
		ConstantTypeName = constantTypeName;
	}
	public int getDelMark() {
		return DelMark;
	}
	public void setDelMark(int delMark) {
		DelMark = delMark;
	}
	public ConstantType() {
		super();
	}
	public ConstantType(int iD, String constantTypeCode, String constantTypeName, int delMark) {
		super();
		ID = iD;
		ConstantTypeCode = constantTypeCode;
		ConstantTypeName = constantTypeName;
		DelMark = delMark;
	}
    
}
