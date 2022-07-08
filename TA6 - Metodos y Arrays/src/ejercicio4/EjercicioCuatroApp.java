package ejercicio4;

import java.util.Scanner;

public class EjercicioCuatroApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario un número para calcularle el factorial
		System.out.println("Introduce un número para calcular el factorial: ");
		int num = sc.nextInt();
		System.out.println("Número factorial de " + num + " = " + calculaFactorial(num)); // Mostramos por consola el número factorial
		sc.close();
	}

	// Método que nos devuelve el número factorial del número pasado por parámetro
	public static int calculaFactorial(int numero) {
		int resultado = 1; // Inicializamos el resultado a 1

		// mientras i sea mayor que 0, restaremos 1 a i
		for (int i = numero; i > 0; i--) {
			resultado = resultado * i; // En cada iteración multiplicamos resultado * i
		}

		return resultado;
	}

}
