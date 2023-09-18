package org.java.shop;

public class Smartphone extends Prodotto {
	private String imei;
	private short memory;
	
	public Smartphone(String code, String name, String brand, float price, byte vat, String imei, short memory) {
		super(code, name, brand, price, vat);
		setImei(imei);
		setMemory(memory);
	}
	
	public String getImei() {
		return imei;
	}
	
	public void setImei(String imei) {
		this.imei = imei;
	}
	
	public short getMemory() {
		return memory;
	}
	
	public void setMemory(short memory) {
		this.memory = memory;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nProduct IMEI: " + getImei() + "\nProduct memory: " + getMemory() + "GB";
	}
}
