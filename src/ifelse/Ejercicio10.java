package ifelse;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Inicializamos variables
		int a, b, c;
		double x1, x2;
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos los numeros
		System.out.println("Introduce el primer numero: ");
		a = sc.nextInt();
		
		System.out.println("Introduce el segundo numero: ");
		b = sc.nextInt();
		
		System.out.println("Introduce el tercer numero: ");
		c = sc.nextInt();
		
		// Mostramos el resultado
		if (a + b == c || a + c == b || b + a == c || b + c == a || c + a == b || c + b == a) {
			System.out.println("La suma de dos numeros da el otro");
		} else {
			System.out.println("La suma de dos numeros no da el otro");
		}
		
		// Cerramos el escaner
		sc.close();
	}

}
