package dowhile;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Inicializamos variables
		int guess;
		int num = (int) Math.floor(Math.random() * 100);
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el intento
		do {
			System.out.println("Intenta introducir el numero: ");
			guess = sc.nextInt();
			
			if (guess > num)
				System.out.println("MAYOR");
			else if (guess < num)
				System.out.println("MENOR");
		} 
		while(guess != num);
		
		// Al salir imprimos que ha adivinado
		System.out.println("Has adivinado el numero");
		
		// Cerramos el escaner
		sc.close();

	}

}
