package org.java.shop;

public class Televisore extends Prodotto {
	private short inches;
	private boolean isSmart;
	
	public Televisore(String code, String name, String brand, float price, byte vat, short inches, boolean isSmart) {
		super(code, name, brand, price, vat);
		setInches(inches);
		setIsSmart(isSmart);
	}
	
	public short getInches() {
		return inches;
	}
	
	public void setInches(short inches) {
		this.inches = inches;
	}
	
	public boolean isSmart() {
		return isSmart;
	}
	
	public void setIsSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nProduct inches: " + getInches() + "\"\nSmart: " + (isSmart ? "Yes" : "No");
	}
}
