package bolfor;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Inicializamos variables
		int suma = 0;
		
		// Calculamos los 10 primeros numeros impares
		for (int i = 1; i < 20; i += 2) {
			suma += i;
		}
		
		// Escribimos la suma
		System.out.println("La suma es " + suma);
	}

}
