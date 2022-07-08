package ejercicio5;

import java.util.Scanner;

public class EjercicioCincoApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Pedimos por consola un número al usuario
		System.out.println("Introduce un número en base decimal para pasarlo a binario: ");
		int num = sc.nextInt();
		System.out.println(decimalABinario(num)); // Mostramos por pantalla el resultado que nos devuelve el método
		sc.close();
	}

	// Método que recibe un número como parámetro en base decimal, y nos lo devuelve
	// en binario
	public static String decimalABinario(int numero) {

		String resultado = ""; // Inicializamos la string resultado

		while (numero >= 1) { // Mientras el número sea mayor o igual a 1
			resultado += String.valueOf(numero % 2); // Concatenamos al resultado el resto de dividir número entre 2
			numero /= 2; // Ahora dividimos el número entre 2
		}

		// Como la string está del revés, utilizaremos un stringbuilder para poder utilizar el método .reverse para darle
		// la vuelta a la string
		StringBuilder numeroBinario = new StringBuilder();
		numeroBinario.append(resultado); // Concatenamos a la StringBuilder la string con el resultado
		numeroBinario.reverse(); // Le damos la vuelta

		resultado = numeroBinario.toString(); // Transformamos la stringbuilder a string, y la guardamos en la string con el resultado
		return resultado;

	}

}
