package Ejercicios;

import java.util.Scanner;

public class ej10 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner(System.in);
		
		double precio;
		double dinero;
		double cambio;
		
		
		System.out.println("Precio: ");
		precio = teclado.nextDouble();
		System.out.println("Dinero: ");
		dinero = teclado.nextDouble();
		
		cambio = dinero - precio;
		System.out.println("el cambio a devolver es "+ cambio);
		int euros = (int) cambio;
		int centimos = (int)((cambio - euros)*100);
		
		int m2e = euros/2;
		int m1e = euros%2;
		
		int m50c = centimos/50;
		int resto = centimos%50;
		
		int m20c = centimos/20;
		resto = centimos%20;
		
		int m10c = centimos/10;
		resto = centimos%10;
		
		int m05c = centimos/5;
		resto = centimos%5;
		
		int m02c = centimos/2;
		int m01c = centimos%2;
		
		System.out.println("monedas de 2 euros " +m2e);
		System.out.println("monedas de 1 euros " +m1e);
		System.out.println("monedas de 50 centimos " +m50c);
		System.out.println("monedas de 20 centimos " +m20c);
		System.out.println("monedas de 10 centimos " +m10c);
		System.out.println("monedas de 5 centimos " +m05c);
		System.out.println("monedas de 2 centimos " +m02c);
		System.out.println("monedas de 1 centimos " +m01c);

		
		
		
		teclado.close();

		
	}

}
