package reto2;

import java.util.Scanner;

public class Funciones {


	public static boolean esInt(String s) {

		try {
			int num = Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean esDouble(String s) {
		try {
			double num = Double.parseDouble(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static int dimeEntero(String texto, Scanner sc) {
		do {
			try {
				System.out.println(texto);
				String s = sc.nextLine();
				int num = Integer.parseInt(s);
				return num;
			} catch (Exception ex) {
				System.out.println("Introduce un numero correcto");
			}
		} while (true);

	}
	public static double dimeDouble(String texto, Scanner sc) {
		do {
			try {
				System.out.println(texto);
				String s = sc.nextLine();
				double num2 = Double.parseDouble(s);
				return num2;
			} catch (Exception ex) {
				System.out.println("Introduce un numero decimal correcto");
			}
		} while (true);

	}

}
