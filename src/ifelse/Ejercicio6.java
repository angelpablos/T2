package ifelse;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Inicializamos variables
		int a, b, c;
		double x1, x2;
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos los coeficientes
		System.out.println("Introduce la a: ");
		a = sc.nextInt();
		
		System.out.println("Introduce la b: ");
		b = sc.nextInt();
		
		System.out.println("Introduce la c: ");
		c = sc.nextInt();
		
		// Calculamos primer valor de x
		x1 = (-b + Math.sqrt((b * b) - 4 * a * c)) / 2*a;
		
		// Calculamos segundo valor de x
		x2 = (-b - Math.sqrt((b * b) - 4 * a * c)) / 2*a;
		
		// Escribimos el resultado
		if (Double.isNaN(x1) && Double.isNaN(x2)) {
			System.out.println("Ninguna de las soluciones existen");
		} else if (Double.isNaN(x1)) {
			System.out.println("La primera solucion no existe");
		} else if (Double.isNaN(x2)) {
			System.out.println("La segunda solucion no existe");
		} else {
			System.out.println("x1: " + x1 + " x2: " + x2);
		}
		
		// Cerramos el escaner
		sc.close();
	}

}
