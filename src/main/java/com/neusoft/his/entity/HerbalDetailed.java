package com.neusoft.his.entity;

public class HerbalDetailed {
    private int ID;
    private int HerbalPresID;
    private int HerbalID;
    private String Dosage;
    private double Price;
    private String Footnote;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getHerbalPresID() {
		return HerbalPresID;
	}
	public void setHerbalPresID(int herbalPresID) {
		HerbalPresID = herbalPresID;
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
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getFootnote() {
		return Footnote;
	}
	public void setFootnote(String footnote) {
		Footnote = footnote;
	}
	public HerbalDetailed() {
		super();
	}
	public HerbalDetailed(int iD, int herbalPresID, int herbalID, String dosage, double price, String footnote) {
		super();
		ID = iD;
		HerbalPresID = herbalPresID;
		HerbalID = herbalID;
		Dosage = dosage;
		Price = price;
		Footnote = footnote;
	}
    
}
