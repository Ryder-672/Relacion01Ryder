package Ejercicios;

import java.util.Scanner;

public class ej15 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Programa para pasar a grados Kelvin");
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduce los grados centigrados");
		int centigrados = teclado.nextInt();
		double kelvin = centigrados + 273.15;
		
		System.out.printf("%d grados centogrados son %.2f grados kelvin", 
				centigrados,kelvin);
		
		teclado.close();
	}

}
