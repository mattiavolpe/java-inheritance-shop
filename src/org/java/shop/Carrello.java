package org.java.shop;

import java.util.Scanner;

public class Carrello {
	public static void main(String[] args) {		
		String productType = null;
		Prodotto[] products = new Prodotto[1];
		
		float cartTotal = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			do {
				System.out.println(
						"Select the type of product to insert:\n\n"
						+ "[1] Smartphone\n"
						+ "[2] TV\n"
						+ "[3] Headphone\n"
						+ "----------\n"
						+ "[0] EXIT"
				);
				
				productType = sc.nextLine();
			} while (!(productType.equals("0") || productType.equals("1") || productType.equals("2") || productType.equals("3")));
			
			if (!productType.equals("0")) {
				Prodotto currentItem = null;
				
				System.out.print("Type the product code: ");
				String code = sc.nextLine();
				
				System.out.print("Type the product name: ");
				String name = sc.nextLine();
				
				System.out.print("Type the product brand: ");
				String brand = sc.nextLine();
				
				System.out.print("Type the basic price: ");
				String price = sc.nextLine();
				
				System.out.print("Type the VAT percentage: ");
				String vat = sc.nextLine();
				
				switch (productType) {
			 		case "1":
			 			System.out.print("Type the IMEI: ");
			 			String imei = sc.nextLine();
			 			System.out.print("Type the memory amount in GB: ");
			 			String memory = sc.nextLine();
			 			System.out.println("\n\n");
			 			Smartphone smartphone = new Smartphone(code, name, brand, Float.parseFloat(price), Byte.parseByte(vat), imei, Short.parseShort(memory));
			 			currentItem = smartphone;
			 			break;
			 		case "2":
			 			System.out.print("Type the inches: ");
			 			String inches = sc.nextLine();
			 			String isSmartAnswer = null;
			 			do {
			 				System.out.print("Is the TV smart? [y] yes --- [n] no: ");
			 				isSmartAnswer = sc.nextLine().toLowerCase();
			 			} while (!(isSmartAnswer.equals("y") || isSmartAnswer.equals("n")));
			 			boolean isSmart = isSmartAnswer.equals("y") ? true : false;
			 			System.out.println("\n\n");
			 			Televisore tv = new Televisore(code, name, brand, Float.parseFloat(price), Byte.parseByte(vat), Short.parseShort(inches), isSmart);
			 			currentItem = tv;
			 			break;
		 			default:
		 				System.out.print("Type the color: ");
			 			String color = sc.nextLine();
			 			String isWirelessAnswer = null;
			 			do {
			 				System.out.print("Is the headphone wireless? [y] yes --- [n] no: ");
			 				isWirelessAnswer = sc.nextLine().toLowerCase();
			 			} while (!(isWirelessAnswer.equals("y") || isWirelessAnswer.equals("n")));
			 			boolean isWireless = isWirelessAnswer.equals("y") ? true : false;
			 			System.out.println("\n\n");
			 			Cuffia headphone = new Cuffia(code, name, brand, Float.parseFloat(price), Byte.parseByte(vat), color, isWireless);
			 			currentItem = headphone;
		 				break;
				}
				
				if (products[0] == null) {
					products[0] = currentItem;
				} else {
					Prodotto[] tempProducts = new Prodotto[products.length];
					
					for (int i = 0; i < products.length; i++) {
						tempProducts[i] = products[i];
					}
					
					products = new Prodotto[tempProducts.length + 1];
					
					for (int i = 0; i < tempProducts.length; i++) {
						products[i] = tempProducts[i];
					}
					
					products[products.length - 1] = currentItem;
				}
				
				cartTotal += Float.parseFloat(products[products.length - 1].getFullPrice().replace(',', '.'));
			}
		} while (!productType.equals("0"));
		
		for (int i = 0; i < products.length; i++) {
			System.out.println("\n\nProduct #" + (i + 1) + "\n");
			System.out.println(products[i]);
		}
		
		System.out.println("\n\nCart total: " + String.format("%.02f", cartTotal) + "€");
		
		sc.close();
	}
}
