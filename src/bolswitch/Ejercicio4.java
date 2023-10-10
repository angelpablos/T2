package bolswitch;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		// Inicializamos variables
		int tirada1, tirada2;

		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos la primera tirada
		System.out.println("Introduce la primera tirada: ");
		tirada1 = sc.nextInt();
		
		// Mostramos el resultado
		switch(tirada1) {
			case 1: {
				System.out.println("UNO");
				break;
			}
			case 2: {
				System.out.println("DOS");
				break;
			}
			case 3: {
				System.out.println("TRES");
				break;
			}
			case 4: {
				System.out.println("CUATRO");
				break;
			}
			case 5: {
				System.out.println("CINCO");
				break;
			}
			case 6: {
				System.out.println("SEIS");
				break;
			}
		}
		
		// Pedimos la segunda tirada
		System.out.println("Introduce la segunda tirada: ");
		tirada2 = sc.nextInt();
		
		// Mostramos el resultado
		switch(tirada2) {
			case 1: {
				System.out.println("UNO");
				break;
			}
			case 2: {
				System.out.println("DOS");
				break;
			}
			case 3: {
				System.out.println("TRES");
				break;
			}
			case 4: {
				System.out.println("CUATRO");
				break;
			}
			case 5: {
				System.out.println("CINCO");
				break;
			}
			case 6: {
				System.out.println("SEIS");
				break;
			}
		}
		
		// Mostramos la suma
		System.out.println("Suma de las dos tiradas: " + (tirada1 + tirada2));
		
		// Cerramos el escaner
		sc.close();
	}
}
