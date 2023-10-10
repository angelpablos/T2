package ifelse;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Inicializamos variables
		double num;
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el numero
		System.out.println("Introduce un numero: ");
		num = sc.nextDouble();
		
		// Escribimos si es casi cero
		if (num == 0) {
			System.out.println("Es cero");
		} else if (num > -1 && num < 1) {
			System.out.println("Es casi cero");
		} else {
			System.out.println("No es casi cero");
		}
		
		// Cerramos el escaner
		sc.close();
	}

}
