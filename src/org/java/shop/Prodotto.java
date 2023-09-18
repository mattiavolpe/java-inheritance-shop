package org.java.shop;

public class Prodotto {
	private String code;
	private String name;
	private String brand;
	private float price;
	private byte vat;
	
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
	
	public byte vat() {
		return vat;
	}
	
	public void setVat(byte vat) {
		this.vat = vat;
	}
}
