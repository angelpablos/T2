package bolfor;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Inicializamos variables
		int num;
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el numero
		System.out.println("Introduce el numero");
		num = sc.nextInt();
		
		// Mostramos los numeros
		for (int i = 0; i <= num; i++) {
			System.out.println(i);
		}
		
		// Cerramos escaner
		sc.close();

	}

}
