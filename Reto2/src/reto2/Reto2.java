package reto2;

import java.util.Scanner;

import Reto2.Funciones;

public class Reto2 {

	public static void main(String[] args) {
		Scanner scan = New Scanner(System.in);
		do {
			// Funcion imprimir para poner lineas por consola
			System.out.println("----");
			System.out.println("Elige la operacion");
			System.out.println("----");
			System.out.println("1. Longitud");
			System.out.println("2. Peso");
			System.out.println("3. Temperatura");
			System.out.println("4. Volumen");
			System.out.println("0. Salir");

			// Validacion del numero introducido
			do {

				int opcion = Funciones.dimeEntero("			System.out.println(\"----\");\r\n"
						+ "			System.out.println(\"Elige la operacion\");\r\n"
						+ "			System.out.println(\"----\");\r\n"
						+ "			System.out.println(\"1. Longitud\");\r\n"
						+ "			System.out.println(\"2. Peso\");\r\n"
						+ "			System.out.println(\"3. Temperatura\");\r\n"
						+ "			System.out.println(\"4. Volumen\");\r\n"
						+ "			System.out.println(\"0. Salir\");" , scan);
			} while (true);

	


	}
}
}
