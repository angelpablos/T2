package whiles;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Inicializamos variables
		int suma = 0;
		int num;
		
		// Inicializamos escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el primer numero
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		// Sumamos mientras el numero sea positivo y pedimos el numero
		while (num >= 0) {
			suma += num;
			System.out.println("Introduce un numero: ");
			num = sc.nextInt();
		}
		
		// Salimos del bucle
		System.out.println("Has salido del bucle, la suma es: " + suma);
		
		// Cerramos el escaner
		sc.close();

	}

}
