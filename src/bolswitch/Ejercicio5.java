package bolswitch;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Inicializamos variables
		String carnet;

		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el carnet
		System.out.println("Introduce tu permiso: ");
		carnet = sc.next();
		
		// Mostramos el resultado
		switch(carnet) {
			case "E": {
				System.out.println("Remolques");
				break;
			}
			case "D": {
				System.out.println("Autobuses");
				break;
			}
			case "C1-C5": {
				System.out.println("Autobuses");
				break;
			}
			case "A": {
				System.out.println("Motocicletas");
				break;
			}
			case "B1-B2": {
				System.out.println("Automoviles");
				break;
			}
			default: {
				System.out.println("Categoría no contemplada");
				break;
			}
		}
	}

}
