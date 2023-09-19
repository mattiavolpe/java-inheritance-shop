package org.java.shop;

public class Prodotto {
	private String code;
	private String name;
	private String brand;
	private float price;
	private byte vat;
	
	public Prodotto(String code, String name, String brand, float price, byte vat) {
		this.code = code;
		setName(name);
		setBrand(brand);
		setPrice(price);
		setVat(vat);
	}
	
	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public byte getVat() {
		return vat;
	}
	
	public void setVat(byte vat) {
		this.vat = vat;
	}
	
	public String getFullPrice() {
		float price = getPrice();
		float vatValue = price * getVat() / 100;
		return String.format("%.02f", (getPrice() + vatValue));
	}
	
	@Override
	public String toString() {
		return "Product code: " + getCode() + "\nProduct name: " + getName() + "\nProduct brand: " + getBrand() + "\nProduct basic price: " + String.format("%.02f", getPrice()) + "€\nVAT percentage: " + getVat() + "%\nFull price: " + getFullPrice() + "€";
	}
}
