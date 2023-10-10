package ifelse;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Inicializamos variables
		double nota;
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el numero
		System.out.println("Introduce tu nota: ");
		nota = sc.nextDouble();
		
		// Escribimos la nota
		if (nota >= 0 && nota < 5) {
			System.out.println("INSUFICIENTE");
		} else if (nota >= 5 && nota < 6) {
			System.out.println("SUFICIENTE");
		} else if (nota >= 6 && nota < 7) {
			System.out.println("BIEN");
		} else if (nota >= 7 && nota < 9) {
			System.out.println("NOTABLE");
		} else if (nota >= 9 && nota <= 10) {
			System.out.println("SOBRESALIENTE");
		}
		
		// Cerramos el escaner
		sc.close();
	}

}
