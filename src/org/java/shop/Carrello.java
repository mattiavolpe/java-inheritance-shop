package org.java.shop;

import java.util.Scanner;

public class Carrello {
	public static void main(String[] args) {
		String productType = "0";
		Scanner sc = new Scanner(System.in);
		
		do {
			do {
				System.out.println(
						"Select the type of product to insert:\n"
						+ "[1] Smartphone\n"
						+ "[2] TV\n"
						+ "[3] Headphone\n"
						+ "[0] EXIT"
				);
				
				productType = sc.nextLine();
			} while (!(productType.equals("0") || productType.equals("1") || productType.equals("2") || productType.equals("3")));
			
			if (productType.equals("0")) {
				sc.close();
				return;
			}
			
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
	 				break;
			}
		} while (!productType.equals("0"));
		
		sc.close();
		
	}
}
