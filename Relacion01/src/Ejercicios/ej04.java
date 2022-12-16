package Ejercicios;

import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("introduce un numero");
		numero = teclado.nextInt();
		
		System.out.println("el doble del numero es "+(32 + ( 9 * numero / 5)));
		
		teclado.close();
	}

}
