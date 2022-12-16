package Ejercicios;

import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("introduce un numero ");
		
		num1 = teclado.nextInt();
		System.out.println("el numero introducido es "+num1);
		
		System.out.println("introduce otro numero ");
		num2 = teclado.nextInt();
		System.out.println("los numeros son: "+num1+num2);

		teclado.close();
	}

}
