package whiles;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Inicializamos variables
		int suma = 0, contEdades = 0, mayores = 0;
		int edad;

		// Inicializamos escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos la edad del alumno
		System.out.println("Introduce la edad del alumno: ");
		edad = sc.nextInt();
		
		// Entramos en el bucle que compara si es par
		while (edad > 0) {
			if (edad >= 18)
				mayores++;
			
			suma += edad;
			contEdades++;
			
			System.out.println("Introduce la edad del alumno: ");
			edad = sc.nextInt();
		}
		
		// Salimos del bucle
		System.out.println("Has salido del bucle");
		
		// Escribimos los resultados
		System.out.println("La suma de las edades es: " + suma);
		System.out.println("La media es: " + (suma / contEdades));
		System.out.println("El numero de alumnos es: " + contEdades);
		System.out.println(mayores + " alumnos son mayores de edad");
		
		// Cerramos el escaner
		sc.close();
	}

}
