package ifelse;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Inicializamos variables
		int num;
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el numero
		System.out.println("Introduce un numero de 0 a 99999: ");
		num = sc.nextInt();
		
		// Escribimos cuantas cifras tiene
		if (num >= 0 && num <= 9) {
            System.out.println("El número tiene 1 cifra.");
        } else if (num >= 10 && num <= 99) {
            System.out.println("El número tiene 2 cifras.");
        } else if (num >= 100 && num <= 999) {
            System.out.println("El número tiene 3 cifras.");
        } else if (num >= 1000 && num <= 9999) {
            System.out.println("El número tiene 4 cifras.");
        } else if (num >= 10000 && num <= 99999) {
            System.out.println("El número tiene 5 cifras.");
        } else {
            System.out.println("El número no entra en el rango");
        }
		
		// Cerramos el escaner
		sc.close();
	}

}
