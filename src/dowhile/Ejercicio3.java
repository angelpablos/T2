package dowhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Inicializamos variables
		int num = 1;
		int suma = 0;
		int max;
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el numero
		System.out.println("Introduce el numero maximo: ");
		max = sc.nextInt();
		
		// Imprimimos los numeros
		do {
			suma += num;
			num++;
		} 
		while(num <= max);
		
		// Imprimimos resultado
		System.out.println("La suma es: " + suma);
		
		// Cerramos el escaner
		sc.close();

	}

}
