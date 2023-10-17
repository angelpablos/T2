package dowhile;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Inicializamos variables
		int num = 1;
		
		// Imprimimos los numeros
		do {
			if (num % 2 == 0)
				System.out.println(num);
			num++;
		} 
		while(num <= 200);
	}
}
