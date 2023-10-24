package bolfor;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Inicializamos variables
		boolean suspenso = false;
		
		// Creamos escaner
		Scanner sc = new Scanner(System.in);
		
		// Preguntamos las 5 notas
		for (int i = 0; i < 5; i++) {
			System.out.println("Dime la nota: ");
			int nota = sc.nextInt();
			
			if (nota < 5) suspenso = true;
		}
		
		// Escribimos el resultado
		System.out.println(suspenso ? "Hay algun suspenso" : "No hay ningun suspenso");

	}

}
