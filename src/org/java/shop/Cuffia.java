package org.java.shop;

public class Cuffia extends Prodotto {
	private String color;
	private boolean isWireless;

	public Cuffia(String code, String name, String brand, float price, byte vat, String color, boolean isWireless) {
		super(code, name, brand, price, vat);
		setColor(color);
		setIsWireless(isWireless);
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isWireless() {
		return isWireless;
	}
	
	public void setIsWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}

}
