package Ejercicios;

import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número de 5 cifras");
		int num = teclado.nextInt();
		
		System.out.printf("%d\n%d\n%d\n%d\n%d\n", num/10000, num/1000, num/100,
				num/10, num/1);
		teclado.close();
	}

}
