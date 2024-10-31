package reto2;

import java.util.Scanner;

public class Reto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
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

			opcion = Funciones.dimeEntero("", sc);

		} while (opcion != 0);
	}
}
