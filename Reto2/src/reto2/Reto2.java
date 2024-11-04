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
			System.out.println("1. Longitud\n2. Peso\n3. Temperatura\n4. Volumen\n0. Salir");
			// Validacion del numero introducido

			opcion = Funciones.dimeEntero("", sc);
			
			// Switch 
			switch(opcion) {
			  case 1:
			    int opcionlongitud = Funciones1.subMenu("Longitud", "Millas a Kilometros", "Kilometros a millas", sc);
			    if(opcionlongitud == 1){
			    	double longitud = Funciones.dimeDouble("Dime millas", sc);
			    	System.out.println("El resultado es " + Funciones1.conversionDeMillasKm(longitud));
			    }
			    break;
	
			}
			

		} while (opcion != 0);
	}
}
