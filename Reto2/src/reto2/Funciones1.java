package reto2;

import java.util.Scanner;

public class Funciones1 {

	public static int subMenu(String tipoConversion,String texto1, String texto2,Scanner sc) {
		do {
			System.out.println("Selecciona la conversion de "+tipoConversion);
			System.out.println(texto1);
			System.out.println(texto2);
			int num=Funciones.dimeEntero("",sc);
			if(num==1)
				return num;
			else if(num==2)
				return num;
			else if(num==0)
				return 0;
			else
				System.out.println("Debe ser una de las opciones indicadas");
		} while (true);
	}
}
