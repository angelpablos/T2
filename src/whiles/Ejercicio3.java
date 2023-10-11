package whiles;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Inicializamos variables
		int suma = 0;
		int numerosIntroducidos = 0;
		int num;
		
		// Inicializamos escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el primer numero
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		// Añadimos el numero a la cuenta y sumamos mientras el numero sea positivo y pedimos el numero
		while (num >= 0) {
			numerosIntroducidos++;
			suma += num;
			
			System.out.println("Introduce un numero: ");
			num = sc.nextInt();
		}
		
		// Salimos del bucle
		System.out.println("Has salido del bucle, la media es " + (suma / numerosIntroducidos));

		// Cerramos el escaner
		sc.close();
	}

}
