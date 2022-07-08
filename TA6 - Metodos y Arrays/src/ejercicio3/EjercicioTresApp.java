package ejercicio3;

import java.util.Scanner;

public class EjercicioTresApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que introduzca un número
		System.out.println("Introduce un número: (Te indicaremos si es primo o no)");
		int num = sc.nextInt();

		if (esPrimo(num)) { // Si el número es primo
			System.out.println("El número " + num + " es primo");
		} else { // Si no lo es
			System.out.println("¡El número " + num + " no es primo!");
		}
		sc.close();
	}

	// Método que recibe por parámetro un número y nos devuelve un booleano que nos indica si es primo o no
	public static boolean esPrimo(int numero) {

		/* Mientras i sea menor al número pasado por parámetro dividido entre 2, iteraremos en el FOR. 
		Si el resto de número entre i es igual a 0, significa que el número pasado por parámetro no es primo. 
		Si sale del FOR sin entrar en el condicional, significará que el número es primo. */
		
		if(numero == 4 || numero == 0 || numero == 1) {
			return false;
		}
		
		for (int i = 2; i < numero / 2; i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}

}
