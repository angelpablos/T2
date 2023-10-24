package dowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Inicializamos variables
		int minGuess = 1, maxGuess = 101;
		String respuesta = "";
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		// Pedimos el intento
		do {
			int random = r.nextInt(minGuess, maxGuess);
			
			System.out.println("El ordenador dice el numero " + random);
			
			respuesta = sc.next();
			if (respuesta.equalsIgnoreCase("menor")) {
				maxGuess = random;
			} else if (respuesta.equalsIgnoreCase("mayor")) {
				minGuess = random;
			}
		} 
		while(!respuesta.equalsIgnoreCase("adivinaste"));
		
		// Al salir imprimos que ha adivinado
		System.out.println("El ordenador ha adivinado el numero");
		
		// Cerramos el escaner
		sc.close();

	}

}
