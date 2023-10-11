package whiles;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Inicializamos variables
		int numerosIntroducidos = 0;
		int num;
		
		// Inicializamos escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el primer numero
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		// Añadimos el numero a la cuenta mientras el numero sea positivo y pedimos el numero
		while (num >= 0) {
			numerosIntroducidos++;
			
			System.out.println("Introduce un numero: ");
			num = sc.nextInt();
		}
		
		// Salimos del bucle
		System.out.println("Has salido del bucle, has contado " + numerosIntroducidos + " numeros");

		// Cerramos el escaner
		sc.close();
	}

}
