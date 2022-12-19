package Ejercicios;

import java.util.Scanner;

public class ej13 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un número de 5 cfras");
		int num = teclado.nextInt();
		
		System.out.printf("%d\n%d\n%d\n%d\n%d\n", num%10, num%100, num%1000,
				num%10000, num);
		
		teclado.close();
	}

}
