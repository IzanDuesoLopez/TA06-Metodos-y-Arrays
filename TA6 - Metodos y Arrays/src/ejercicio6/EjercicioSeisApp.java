package ejercicio6;

import java.util.Scanner;

public class EjercicioSeisApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número entero positivo: "); // Pedimos el número al usuario
		int num = sc.nextInt();
		
		while (num < 0) { // Si es un número negativo
			System.out.println("Número no válido. Introduce un número entero positivo: "); // Volvemos a pedir el número al usuario
			num = sc.nextInt();
		}
		
		System.out.println("Número de cifras: " + numeroDeCifras(num)); // Mostramos por consola el número de cifras llamando al método
		sc.close();
	}
	
	// Método que nos devuelve el número de cifras de un
	// número entero positivo
	public static int numeroDeCifras(int numero) {
		
		int contadorCifras = 0; // Inicializamos el contador de cifras a 0
		
		while(numero != 0) { // Mientras el número sea diferente de 0
			numero = numero / 10; // Dividimos entre 10 el número
			contadorCifras++; // Aumentamos en 1 el contador de cifras
		}
		
		return contadorCifras;
		
	}

}
