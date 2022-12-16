package Ejercicios;

import java.util.Scanner;

public class ej08 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner(System.in);
		
		double radio;
		double volumen;

		
		
		System.out.println("radio de la esfera ");
		radio = teclado.nextDouble();

		volumen = (4.0/3) * (Math.PI * Math.pow(radio, 3));
		
		System.out.println("el volumen de la esfera es  "+ volumen);
		
		
		teclado.close();

	}

}
