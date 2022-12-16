package Ejercicios;

import java.util.Scanner;

public class ej06 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner(System.in);
		
		float vel;
		
		System.out.println("introduce una velocidad ");
		vel = teclado.nextFloat();
		
		System.out.println("en metros por segundos es: "+(vel * 0.2778));
		teclado.close();
	}

}
