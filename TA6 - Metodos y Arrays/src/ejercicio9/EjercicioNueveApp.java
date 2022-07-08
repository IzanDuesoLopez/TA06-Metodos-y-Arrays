package ejercicio9;

import java.util.Scanner;

public class EjercicioNueveApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario un tamaño para el array, un valor minimo y máximo
		System.out.println("Introduce un tamaño para el array: ");
		int tamArray = sc.nextInt();
		System.out.println("Introduce un valor minimo: ");
		int min = sc.nextInt();
		System.out.println("Introduce un valor máximo: ");
		int max = sc.nextInt();
		
		// llamamos al método generarArrayAleatorio pasándole por parámetro un tamaño para el array
		// y el intervalo de números para generar los valores aleatorios
		int arrayAutoGenerado[] = generarArrayAleatorio(tamArray, min, max);
		imprimirVector(arrayAutoGenerado); // Mostramos por consola el array y la suma de sus valores
		sc.close();
	}

	// Método que recibe por parámetro un tamaño para el array, un número mínimo y máximo
	// con los que generara los números aleatorios. Finalmente devolvemos el array.
	public static int[] generarArrayAleatorio(int tamArray, int minimo, int maximo) {

		int arrayUsuario[] = new int[tamArray]; // Declaramos el array con el tamaño recibido por parámetro

		for (int i = 0; i < arrayUsuario.length; i++) {
			arrayUsuario[i] = (int) ((Math.random() * (maximo - minimo)) + minimo); // Asignamos a cada posición del array un valor aleatorio dentro del intervalo
		}

		return arrayUsuario; // Devolvemos el array
	}

	// Método en el que recibimos un vector por parámetro y lo mostramos
	// mediante un bucle FOR. También mostramos la suma total del array.
	public static void imprimirVector(int[] vector) {

		int suma = 0;
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Valor de la posición " + i + " del array = " + vector[i]); // Mostramos por consola el array
			suma += vector[i]; // Vamos sumando a la variable suma el valor de la posición i
		}
		
		System.out.println("Suma total de los valores del array = " + suma); // Mostramos por consola la suma
	}

}
