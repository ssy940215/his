package com.neusoft.his.entity;

public class HerbalTempDetailed {
    private int ID;
    private int HerbalTempID;
    private int HerbalID;
    private String Dosage;
    private String Unit;
    private String Footnote;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getHerbalTempID() {
		return HerbalTempID;
	}
	public void setHerbalTempID(int herbalTempID) {
		HerbalTempID = herbalTempID;
	}
	public int getHerbalID() {
		return HerbalID;
	}
	public void setHerbalID(int herbalID) {
		HerbalID = herbalID;
	}
	public String getDosage() {
		return Dosage;
	}
	public void setDosage(String dosage) {
		Dosage = dosage;
	}
	public String getUnit() {
		return Unit;
	}
	public void setUnit(String unit) {
		Unit = unit;
	}
	public String getFootnote() {
		return Footnote;
	}
	public void setFootnote(String footnote) {
		Footnote = footnote;
	}
	public HerbalTempDetailed() {
		super();
	}
	public HerbalTempDetailed(int iD, int herbalTempID, int herbalID, String dosage, String unit, String footnote) {
		super();
		ID = iD;
		HerbalTempID = herbalTempID;
		HerbalID = herbalID;
		Dosage = dosage;
		Unit = unit;
		Footnote = footnote;
	}
    
}
