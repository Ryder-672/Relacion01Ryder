package Ejercicios;

import java.util.Scanner;

public class ej07 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner(System.in);
		
		double cateto1;
		double cateto2;
		double hipotenusa;
		
		
		System.out.println("introduce los catetos ");
		cateto1 = teclado.nextDouble();
		cateto2 = teclado.nextDouble();

		hipotenusa = Math.sqrt( Math.pow(cateto1,2) + Math.pow(cateto2,2));
		
		System.out.println("la hipotenusa es  "+ hipotenusa);
		
		
		teclado.close();
	}

}
