package Ejercicios;

import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner(System.in);

		int numero;
		
		
		System.out.println("dinos el numero ");
		numero = teclado.nextInt();
		int num1 = numero / 100;
		int resto = numero % 100;
		int num2 = resto / 10;
		int num3 = resto % 10;
		
		System.out.println("el numero era: "+numero+" asi que por separado es: "+num1+" "+num2+" "+ num3);

		teclado.close();

	}

}
