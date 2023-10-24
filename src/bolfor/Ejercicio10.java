package bolfor;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Inicializamos variables
		int a;
		int b;
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos los numeros
		System.out.println("Escribe el numero A (menor que B): ");
		a = sc.nextInt();
		
		System.out.println("Escribe el numero B (mayor que A): ");
		b = sc.nextInt();
		
		// Mostramos los numeros
		for (int i = a + 1; i < b; i++) {
			System.out.println(i);
		}
		
		// Cerramos escaner
		sc.close();

	}

}
