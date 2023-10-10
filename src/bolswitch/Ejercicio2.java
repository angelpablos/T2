package bolswitch;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Inicializamos variable
		int dia;
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el dia
		System.out.println("Introduce el dia en numero (del 1 al 7): ");
		dia = sc.nextInt();
		
		// Mostramos el dia
		switch (dia) {
	        case 1:
	            System.out.println("Lunes");
	            break;
	        case 2:
	            System.out.println("Martes");
	            break;
	        case 3:
	            System.out.println("Miercoles");
	            break;
	        case 4:
	            System.out.println("Jueves");
	            break;
	        case 5:
	            System.out.println("Viernes");
	            break;
	        case 6:
	            System.out.println("Sabado");
	            break;
	        case 7:
	            System.out.println("Domingo");
	            break;
	    }
		
		// Cerramos el escaner
		sc.close();
	}

}
