package Ejercicios;

import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner(System.in);

		int numero;
		
		
		System.out.println("dinos el numero ");
		numero = teclado.nextInt();
		System.out.println("el numero era: "+numero+" asi que por separado es:");
		
		int num1 = numero / 10000;
		System.out.println(num1);
		num1 = numero / 1000;
		System.out.println(num1);
		num1 = numero / 100;
		System.out.println(num1);
		num1 = numero / 10;
		System.out.println(num1);
		num1 = numero / 1;
		System.out.println(num1);


		


		teclado.close();
	}

}
