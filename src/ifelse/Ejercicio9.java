package ifelse;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Inicializamos variables
		String jugador1, jugador2;
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		// Leemos el primer jugador
		System.out.println("¿Que juega el primer jugador?");
		jugador1 = sc.nextLine();
		
		// Leemos el segundo jugador
		System.out.println("¿Que juega el segundo jugador?");
		jugador2 = sc.nextLine();
		
		// Calculamos resultado
		if (jugador1.equals(jugador2)) {
			System.out.println("EMPATE");
		} else if (jugador1.equals("PIEDRA")) {
			if (jugador2.equals("PAPEL")) {
				System.out.println("Gana el jugador 2");
			} else if (jugador2.equals("TIJERA")) {
				System.out.println("Gana el jugador 1");
			}
		} else if (jugador1.equals("PAPEL")) {
			if (jugador2 .equals("TIJERA")) {
				System.out.println("Gana el jugador 2");
			} else if (jugador2.equals("PIEDRA")) {
				System.out.println("Gana el jugador 1");
			}
		} else if (jugador1.equals("TIJERA")) {
			if (jugador2.equals("PIEDRA")) {
				System.out.println("Gana el jugador 2");
			} else if (jugador2.equals("PAPEL")) {
				System.out.println("Gana el jugador 1");
			}
		}

		// Cerramos el escaner
		sc.close();
	}

}
