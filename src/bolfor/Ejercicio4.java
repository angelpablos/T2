package bolfor;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Inicializamos variables
		int num;
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el numero
		System.out.println("Introduce el numero hasta el que contar: ");
		num = sc.nextInt();
		
		// Mostramos los multiplos de 3 menores al numero
		for (int i = 3; i <= num; i += 3) {
			System.out.println(i);
		}
		
		// Cerramos escaner
		sc.close();

	}

}
