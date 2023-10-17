package dowhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Inicializamos variables
		int i = 1;
		int num;
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el numero
		System.out.println("Introduce el numero: ");
		num = sc.nextInt();
		
		// Imprimimos los numeros
		do {
			System.out.println(num + " x " + i + " = " + num * i);
			i++;
		} 
		while(i <= 10);
		
		// Cerramos el escaner
		sc.close();

	}

}
