package whiles;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Inicializamos variables
		int masAlto = 0;
		int altura;
		
		// Inicializamos escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos la altura
		System.out.println("Introduce la altura (cm): ");
		altura = sc.nextInt();
		
		// Vamos pidiendo la altura y si es la mas alta la asignamos a la variable masAlto
		while (altura != -1) {
			if (altura > masAlto)
				masAlto = altura;

			System.out.println("Introduce la altura (cm): ");
			altura = sc.nextInt();
		}
		
		// Salimos del bucle
		System.out.println("Has salido del bucle, el mas alto mide " + masAlto + " cm");
		
		// Cerramos el escaner
		sc.close();
	}

}
