package whiles;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Inicializamos variable
		int num;
		
		// Inicializamos escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el numero
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		// Entramos en el bucle que compara si es par
		while (num != 0) {
			System.out.println("El numero es: " + (num % 2 == 0 ? "par" : "impar"));
			System.out.println("Introduce un numero: ");
			num = sc.nextInt();
		}
		
		// Salimos del bucle
		System.out.println("Has salido del bucle");

		// Cerramos el escaner
		sc.close();
	}
}
