package bolfor;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Inicializamos variables
		int suma = 0;
		
		// Abrimos escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos numeros en un bucle, y hacemos la suma
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un numero para añadir: ");
			int num = sc.nextInt();
			suma += num;
		}
		
		// Escribimos la media
		System.out.println("La media es: " + (suma / 10));
		
		// Cerramos escaner
		sc.close();
	}

}
