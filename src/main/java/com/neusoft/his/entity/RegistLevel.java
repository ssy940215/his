package com.neusoft.his.entity;

public class RegistLevel {
    private int ID;
    private String RegistCode;
    private String RegistName;
    private int SequenceNo;
    private double RegistFee;
    private int RegistQuota;
    private int DelMark;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getRegistCode() {
		return RegistCode;
	}
	public void setRegistCode(String registCode) {
		RegistCode = registCode;
	}
	public String getRegistName() {
		return RegistName;
	}
	public void setRegistName(String registName) {
		RegistName = registName;
	}
	public int getSequenceNo() {
		return SequenceNo;
	}
	public void setSequenceNo(int sequenceNo) {
		SequenceNo = sequenceNo;
	}
	public double getRegistFee() {
		return RegistFee;
	}
	public void setRegistFee(double registFee) {
		RegistFee = registFee;
	}
	public int getRegistQuota() {
		return RegistQuota;
	}
	public void setRegistQuota(int registQuota) {
		RegistQuota = registQuota;
	}
	public int getDelMark() {
		return DelMark;
	}
	public void setDelMark(int delMark) {
		DelMark = delMark;
	}
	public RegistLevel() {
		super();
	}
	public RegistLevel(int iD, String registCode, String registName, int sequenceNo, double registFee, int registQuota,
			int delMark) {
		super();
		ID = iD;
		RegistCode = registCode;
		RegistName = registName;
		SequenceNo = sequenceNo;
		RegistFee = registFee;
		RegistQuota = registQuota;
		DelMark = delMark;
	}
    
}
