package com.neusoft.his.entity;

public class SettleCategory {
    private int ID;
    private String SettleCode;
    private String SettleName;
    private int SequenceNo;
    private int DelMark;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getSettleCode() {
		return SettleCode;
	}
	public void setSettleCode(String settleCode) {
		SettleCode = settleCode;
	}
	public String getSettleName() {
		return SettleName;
	}
	public void setSettleName(String settleName) {
		SettleName = settleName;
	}
	public int getSequenceNo() {
		return SequenceNo;
	}
	public void setSequenceNo(int sequenceNo) {
		SequenceNo = sequenceNo;
	}
	public int getDelMark() {
		return DelMark;
	}
	public void setDelMark(int delMark) {
		DelMark = delMark;
	}
	public SettleCategory() {
		super();
	}
	public SettleCategory(int iD, String settleCode, String settleName, int sequenceNo, int delMark) {
		super();
		ID = iD;
		SettleCode = settleCode;
		SettleName = settleName;
		SequenceNo = sequenceNo;
		DelMark = delMark;
	}
    
}
