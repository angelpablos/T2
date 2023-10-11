package whiles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Inicializamos variables
		int numeroSecreto = (int) Math.floor(Math.random() * 100);
		int guess;
		
		// Inicializamos escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el numero
		System.out.println("Introduce el numero: ");
		guess = sc.nextInt();
		
		// Comprobamos que sea mayor o menos y volvemos a preguntar
		while (guess != -1 && guess != numeroSecreto) {
			if (guess > numeroSecreto)
				System.out.println("Mayor");
			else if (guess < numeroSecreto)
				System.out.println("Menor");
			
			System.out.println("Introduce el numero: ");
			guess = sc.nextInt();
		}
		
		// Salimos del bucle
		System.out.println(guess == -1 ? "Te has rendido" : "Has adivinado el numero");
		
		// Cerramos el escaner
		sc.close();
	}

}
