package ifelse;

import java.util.Scanner;

public class Ejercicio4 {

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
		
		
		// Escribimos el orden
		if (num1 < num2) {
			System.out.println(num1 + ", " + num2);
		} else {
			System.out.println(num2 + ", " + num1);
		}
		
		// Cerramos el escaner
		sc.close();
	}

}
