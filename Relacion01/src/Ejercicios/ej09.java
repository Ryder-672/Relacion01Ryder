package Ejercicios;

import java.util.Scanner;

public class ej09 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
Scanner teclado = new Scanner(System.in);
		
		double cateto1;
		double cateto2;
		double cateto3;
		double semiperimetro; 
		
		
		System.out.println("introduce los lados del triangulo");
		cateto1 = teclado.nextDouble();
		cateto2 = teclado.nextDouble();
		cateto3 = teclado.nextDouble();
		
		semiperimetro = (cateto1+cateto2+cateto3)/2;
		
		double area = Math.sqrt(semiperimetro * (semiperimetro - cateto1) * (semiperimetro - cateto2) * (semiperimetro - cateto3) );

		
		System.out.println("el area del triangulo es  "+ area );
		
		
		teclado.close();
	}

}
