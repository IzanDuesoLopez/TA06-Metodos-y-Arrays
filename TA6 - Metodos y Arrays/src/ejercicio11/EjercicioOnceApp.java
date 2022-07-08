package ejercicio11;

import java.util.Scanner;

public class EjercicioOnceApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un tamaño para los dos arrays: ");
		int tamArray = sc.nextInt();
		System.out.println("Introduce un valor mínimo para los arrays: ");
		int min = sc.nextInt();
		System.out.println("Introduce un valor máximo para los arrays: ");
		int max = sc.nextInt();

		int arrayUno[] = generarArrayAleatorio(tamArray, min, max); // Array rellenado con números aleatorios
		int arrayDos[] = arrayUno; // Array que apunta al array anterior
		arrayUno = generarArrayAleatorio(tamArray, min, max); // Reasignamos los valores del segundo array con valores aleatorios
		int arrayTres[] = multiplicarDosArrays(arrayUno, arrayDos); // En el tercer array guardamos la multiplicación de cada posición entre el array 1 y 2
										
		// Imprimimos los tres arrays con el método imprimirVector
		System.out.println("Array Uno: ");
		imprimirVector(arrayUno);
		System.out.println("Array Dos: ");
		imprimirVector(arrayDos);
		System.out.println("Array Tres: ");
		imprimirVector(arrayTres);
		
		sc.close();
	}

	// Método que recibe por parámetro un tamaño para el array, un número mínimo y
	// máximo con los que generara los números aleatorios. Finalmente devolvemos el array.
	public static int[] generarArrayAleatorio(int tamArray, int minimo, int maximo) {

		int arrayUsuario[] = new int[tamArray]; // Declaramos el array con el tamaño recibido por parámetro

		for (int i = 0; i < arrayUsuario.length; i++) {
			arrayUsuario[i] = (int) ((Math.random() * (maximo - minimo)) + minimo); // Asignamos a cada posición del
																					// array un valor aleatorio dentro
																					// del intervalo
		}

		return arrayUsuario; // Devolvemos el array
	}
	
	// Método que recibe dos arrays por parámetro, crea un tercero y en cada una de
	// sus posiciones multiplica la posición 0 del arrayUno con la del arrayDos
	// en el nuevo array. Finalmente, lo devolvemos en el return.
	public static int[] multiplicarDosArrays(int arrayUno[], int arrayDos[]) {
		
		int arrayTres[] = new int[arrayUno.length];
		
		for(int i = 0; i < arrayUno.length; i++) {
			arrayTres[i] = arrayUno[i] * arrayDos[i];
		}
		return arrayTres;
	}
	
	// Método en el que recibimos un vector por parámetro y lo mostramos
	// mediante un bucle FOR
	public static void imprimirVector(int[] vector) {
			
		for(int i = 0; i < vector.length; i++) {
			System.out.println("Valor de la posición " + i + " del array = " + vector[i]);
		}
	}

}
