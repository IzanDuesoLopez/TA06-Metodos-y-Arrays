package ejercicio8;

import java.util.Scanner;

public class EjercicioOchoApp {

	public static void main(String[] args) {

		int numeros[] = rellenarValores(); // Rellenamos el array con el método que hemos creado, en el cual pedimos al usuario 10 números
		imprimirVector(numeros); // Llamamos al método imprimir para mostrar los elementos del array por consola
		
	}

	// Método en el cual creamos un array de 10 posiciones y lo llenamos de números solicitados
	// por consola al usuario
	public static int[] rellenarValores() {
		Scanner sc = new Scanner(System.in);

		int vector[] = new int[10]; // Declaramos un vector de 10 posiciones

		for (int i = 0; i < vector.length; i++) { // Pedimos los valores para cada posición al usuario
			System.out.println("Introduce el valor de la posición " + i);
			vector[i] = sc.nextInt();
		}
		
		sc.close();
		return vector;
	}
	
	// Método en el que recibimos un vector por parámetro y lo mostramos
	// mediante un bucle FOR
	public static void imprimirVector(int[] vector) {
		
		for(int i = 0; i < vector.length; i++) {
			System.out.println("Valor de la posición " + i + " del array = " + vector[i]);
		}
	}

}
