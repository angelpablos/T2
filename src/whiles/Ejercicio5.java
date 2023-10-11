package whiles;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Inicializamos variables
		int suma = 0, cuenta = 1;
		int sumaNegativos = 0, contNegativos = 0, sumaPositivos = 0, contCeros = 0;
		int num;
		
		// Inicializamos escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el numero
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		
		// Entramos en el bucle y hacemos las correspondientes operaciones
		while (cuenta < 10) {
			if (num == 0) {
				contCeros++;
			} else if (num < 0) {
				sumaNegativos += num;
				contNegativos++;
			} else if (num > 0) {
				sumaPositivos += num;
			}
			
			System.out.println("Introduce un numero: ");
			num = sc.nextInt();
			
			cuenta++;
		}
		
		// Salimos del bucle
		System.out.println("Has salido del bucle");
		
		// Escribimos los resultados
		System.out.println("La suma de los positivos introducidos es: " + sumaPositivos);
		System.out.println("La media de los negativos es: " + (sumaNegativos / contNegativos));
		System.out.println("Has introducido " + contCeros + " ceros");

		// Cerramos el escaner
		sc.close();
	}

}
