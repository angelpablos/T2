package dowhile;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Inicializamos variables
		String jugador1, jugador2;
		String confirmacion;
		
		boolean valido1 = false;
		boolean valido2 = false;
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Iniciamos bucle principal del juego
		do {
			// Reiniciamos variables
			valido1 = false;
			valido2 = false;
			
			jugador1 = "";
			jugador2 = "";
			
			// Leemos el primer jugador, haciendo un bucle por si la respuesta no es correcta
			System.out.println("Opciones validas: (PIEDRA) (PAPEL) (TIJERA)");
			do {
				System.out.println("¿Que juega el primer jugador?");
				jugador1 = sc.next();
				
				if (jugador1.equals("PIEDRA") || jugador1.equals("PAPEL") || jugador1.equals("TIJERA"))
					valido1 = true;
			} while (!valido1);
			
			// Leemos el segundo jugador, haciendo un bucle por si la respuesta no es correcta
			do {
				System.out.println("¿Que juega el segundo jugador?");
				jugador2 = sc.next();
				
				if (jugador2.equals("PIEDRA") || jugador2.equals("PAPEL") || jugador2.equals("TIJERA"))
					valido2 = true;
			} while (!valido2);
			
			// Calculamos resultado
			if (jugador1.equals(jugador2)) {
				System.out.println("EMPATE");
			} else if (jugador1.equals("PIEDRA") && jugador2.equals("TIJERA") || jugador1.equals("TIJERA") && jugador2.equals("PAPEL") || jugador1.equals("PAPEL") && jugador2.equals("PIEDRA"))
				System.out.println("Gana el jugador 1");
			else
				System.out.println("Gana el jugador 2");
			
			// Preguntamos si se quiere volver a jugar
			System.out.println("Deseas seguir jugando? (S) para si");
			confirmacion = sc.next();
		} while (confirmacion.equals("S"));
		
		System.out.println("Ha terminado el juego");
		
		// Cerramos escaner
		sc.close();
	}

}
