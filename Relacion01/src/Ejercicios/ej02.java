package Ejercicios;

import java.util.Scanner;

public class ej02 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente 
		//   
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		int edad;
		float peso;
		
		System.out.println("introduce tus datos");
		System.out.println("Nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Edad ");
		edad = teclado.nextInt();
		System.out.println("Peso ");
		peso = teclado.nextFloat();
		
		System.out.printf("te llamas %s tiene %d años y tu peso es %f kg\n", nombre, edad, peso);

		System.out.println("te llamas "+nombre+" tienes "+edad+"años y tu peso es "+ peso+"kg");
		
		teclado.close();
	}

}
