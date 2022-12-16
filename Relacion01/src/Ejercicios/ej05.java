package Ejercicios;

import java.util.Scanner;

public class ej05 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("introduce el radio de la circunferencia");
		numero = teclado.nextInt();
		
		System.out.println("Longitud de la circunferencia "+(2*numero * 3.14));
		System.out.println("Area de la circunferencia "+(3.14 * numero*numero));
		

		
		teclado.close();
	
	}

}
