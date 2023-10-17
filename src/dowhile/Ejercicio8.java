package dowhile;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Inicializamos variables
		int tirada1, tirada2;
		
		boolean valido1 = false, valido2 = false;

		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		// Informamos de los valores validos
		System.out.println("Valores validos del 1 al 6");
		
		// Pedimos la primera tirada y comprobamos si es valida
		do {
			System.out.println("Introduce la primera tirada: ");
			tirada1 = sc.nextInt();
			
			// Mostramos el resultado
			switch(tirada1) {
				case 1: {
					System.out.println("UNO");
					valido1 = true;
					break;
				}
				case 2: {
					System.out.println("DOS");
					valido1 = true;
					break;
				}
				case 3: {
					System.out.println("TRES");
					valido1 = true;
					break;
				}
				case 4: {
					System.out.println("CUATRO");
					valido1 = true;
					break;
				}
				case 5: {
					System.out.println("CINCO");
					valido1 = true;
					break;
				}
				case 6: {
					System.out.println("SEIS");
					valido1 = true;
					break;
				}
			}
		} while (!valido1);
		
		// Pedimos la segunda tirada y comprobamos si es valida
		do {
			System.out.println("Introduce la segunda tirada: ");
			tirada2 = sc.nextInt();
			
			// Mostramos el resultado
			switch(tirada2) {
				case 1: {
					System.out.println("UNO");
					valido2 = true;
					break;
				}
				case 2: {
					System.out.println("DOS");
					valido2 = true;
					break;
				}
				case 3: {
					System.out.println("TRES");
					valido2 = true;
					break;
				}
				case 4: {
					System.out.println("CUATRO");
					valido2 = true;
					break;
				}
				case 5: {
					System.out.println("CINCO");
					valido2 = true;
					break;
				}
				case 6: {
					System.out.println("SEIS");
					valido2 = true;
					break;
				}
			}
		} while (!valido2);
		
		// Mostramos la suma
		System.out.println("Suma de las dos tiradas: " + (tirada1 + tirada2));
		
		// Cerramos el escaner
		sc.close();

	}

}
