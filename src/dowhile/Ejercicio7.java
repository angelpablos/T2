package dowhile;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Inicializamos variables
		int num1, num2;
		String opcion;
		boolean salir = false;
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		do {
			// Pedimos el numero
			System.out.println("Introduce el primer numero: ");
			num1 = sc.nextInt();
			
			// Pedimos el segundo numero
			System.out.println("Introduce el segundo numero: ");
			num2 = sc.nextInt();
			
			// Mostramos las opciones
			System.out.println("A: SUMAR LOS NÚMEROS");
			System.out.println("B: RESTAR LOS NÚMEROS");
			System.out.println("C: MULTIPLICAR LOS NÚMEROS");
			System.out.println("D: DIVIDIR LOS NÚMEROS");
			System.out.println("E: SALIR");
			
			// Pedimos la opcion
			System.out.println("ELIGE UNA OPCION:");
			opcion = sc.next();
			
			// Escribimos el resultado
			switch (opcion) {
				case "A": {
					System.out.println("Resultado: " + (num1 + num2));
					break;
				}
				case "B": {
					System.out.println("Resultado: " + (num1 - num2));
					break;
				}
				case "C": {
					System.out.println("Resultado: " + (num1 * num2));
					break;
				}
				case "D": {
					System.out.println("Resultado: " + (num1 / num2));
					break;
				}
				case "E": {
					salir = true;
					break;
				}
				default: {
					System.out.println("No has elegido una operacion");
					break;
				}
			}
		} while (!salir);
		
		System.out.println("Has saido del programa");
		
		// Cerramos escaner
		sc.close();
	}

}
