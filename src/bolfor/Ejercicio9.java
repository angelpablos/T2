package bolfor;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Inicializamos variables
		int num;
		boolean esPrimo = true;
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el numero
		System.out.println("Escribe el numero: ");
		num = sc.nextInt();
		
		// Calculamos si es primo
		for (int i = 2; i < num; i++ ) {
			if (num % i == 0) {
				esPrimo = false;
				break;
			}
		}
		
		// Escribimos el resultado
		System.out.println(esPrimo ? "Es primo" : "No es primo");
		
		
		// Cerramos escaner
		sc.close();

	}

}
