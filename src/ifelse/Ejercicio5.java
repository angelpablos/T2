package ifelse;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Inicializamos variables
		int num1, num2, num3;
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el numero
		System.out.println("Introduce el primer numero: ");
		num1 = sc.nextInt();
		
		// Pedimos el segundo numero
		System.out.println("Introduce el segundo numero: ");
		num2 = sc.nextInt();
		
		// Pedimos el tercer numero
		System.out.println("Introduce el tercer numero: ");
		num3 = sc.nextInt();
		
		// Escribimos el orden
       if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.println(num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println(num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.println(num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println(num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 >= num2) {
                System.out.println(num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println(num3 + ", " + num2 + ", " + num1);
            }
        }
		// Cerramos el escaner
		sc.close();
	}

}
