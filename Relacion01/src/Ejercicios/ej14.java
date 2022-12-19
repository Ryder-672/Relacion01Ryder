package Ejercicios;

import java.util.Scanner;

public class ej14 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculo de tu número de la suerte");
		System.out.println("Introduce el dia de nacimiento:");
		int dia = teclado.nextInt();
		System.out.println("Introduce el mes de nacimiento:");
		int mes = teclado.nextInt();
		System.out.println("Introduce el año de nacimiento:");
		int anio = teclado.nextInt();
		
		int suma = dia+mes+anio;
		int numSuerte = suma /1000;
		int resto = suma % 1000;
		numSuerte = numSuerte + resto /100;
		resto = resto % 100;
		numSuerte = numSuerte + resto /10;
		numSuerte = numSuerte + resto%10;
		
		System.out.printf("Tu número de la suerte es %d ", numSuerte);
		
		teclado.close();
	}

}
