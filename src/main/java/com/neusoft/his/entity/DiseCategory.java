package com.neusoft.his.entity;

public class DiseCategory {
    private int ID;
    private String DicaCode;
    private String DicaName;
    private int SequenceNo;
    private int DicaType;
    private int DelMark;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getDicaCode() {
		return DicaCode;
	}
	public void setDicaCode(String dicaCode) {
		DicaCode = dicaCode;
	}
	public String getDicaName() {
		return DicaName;
	}
	public void setDicaName(String dicaName) {
		DicaName = dicaName;
	}
	public int getSequenceNo() {
		return SequenceNo;
	}
	public void setSequenceNo(int sequenceNo) {
		SequenceNo = sequenceNo;
	}
	public int getDicaType() {
		return DicaType;
	}
	public void setDicaType(int dicaType) {
		DicaType = dicaType;
	}
	public int getDelMark() {
		return DelMark;
	}
	public void setDelMark(int delMark) {
		DelMark = delMark;
	}
	public DiseCategory() {
		super();
	}
	public DiseCategory(int iD, String dicaCode, String dicaName, int sequenceNo, int dicaType, int delMark) {
		super();
		ID = iD;
		DicaCode = dicaCode;
		DicaName = dicaName;
		SequenceNo = sequenceNo;
		DicaType = dicaType;
		DelMark = delMark;
	}
    
}
