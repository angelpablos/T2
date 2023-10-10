package bolswitch;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Inicializamos variables
		int nota, rango;
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el numero
		System.out.println("Introduce tu nota: ");
		nota = sc.nextInt();
		
		// Damos valor a los diferentes rangos entre los que la nota se puede encontrar
		if (nota >= 0 && nota < 5) {
            rango = 1;
        } else if (nota >= 5 && nota < 6) {
            rango = 2;
        } else if (nota >= 6 && nota < 7) {
            rango = 3;
        } else if (nota >= 7 && nota < 9) {
            rango = 4;
        } else if (nota >= 9 && nota <= 10) {
            rango = 5;
        } else
        	rango = 0;
		
		// Con el rango creado, evaluamos el switch, ya que no permite expresiones logicas, y mostramos el resultado
		switch (rango) {
	        case 1:
	            System.out.println("INSUFICIENTE");
	            break;
	        case 2:
	            System.out.println("SUFICIENTE");
	            break;
	        case 3:
	            System.out.println("BIEN");
	            break;
	        case 4:
	            System.out.println("NOTABLE");
	            break;
	        case 5:
	            System.out.println("SOBRESALIENTE");
	            break;
	        case 0:
	        	System.out.println("Tu nota no entra en los valores");
	        	break;
	    }
		
		// Cerramos el escaner
		sc.close();
	}

}
