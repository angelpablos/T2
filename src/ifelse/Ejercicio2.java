package ifelse;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Inicializamos variables
		int num1, num2;
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el numero
		System.out.println("Introduce el primer numero: ");
		num1 = sc.nextInt();
		
		// Pedimos el segundo numero
		System.out.println("Introduce el segundo numero: ");
		num2 = sc.nextInt();
		
		// Escribimos si son iguales
		if (num1 == num2) {
			System.out.println("Los numeros son iguales");
		} else {
			System.out.println("Los numeros no son iguales");
		}
		
		// Cerramos el escaner
		sc.close();
	}

}
