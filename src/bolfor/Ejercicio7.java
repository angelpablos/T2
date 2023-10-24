package bolfor;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Inicializamos variables
		int factorial = 1;
		int num;
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el numero
		System.out.println("Escribe el numero del que calcular el factorial: ");
		num = sc.nextInt();
		
		// Calculamos factorial
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		
		// Escribimos el factorial
		System.out.println("Tu factorial es: " + factorial);
		
		// Cerramos escaner
		sc.close();


	}

}
