package Ejercicios;

import java.util.Scanner;

public class ej03 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("introduce un numero");
		numero = teclado.nextInt();
		
		System.out.println("el doble del numero es "+(numero * 2));
		System.out.println("el triple del numero es "+ (numero * 3));
		
		
		
		teclado.close();
	}

}
