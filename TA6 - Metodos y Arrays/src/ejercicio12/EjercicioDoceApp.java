package ejercicio12;

import java.util.Scanner;

public class EjercicioDoceApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que introduzca el tamaño del array
		System.out.println("Introduce un tamaño para el array: ");
		int tamArray = sc.nextInt();
		
		int arrayUsuario[] = generarArrayAleatorio(tamArray, 1, 300); // Generamos un array aleatorio con números entre 1 y 300
		
		// Pedimos al usuario que introduzca un dígito para mostrarlos valores del
		// array que acaben con este valor
		System.out.println("Introduce un dígito. Mostraremos los valores del array que acaben con este valor: ");
		int digito = sc.nextInt();
		
		while(digito < 0 || digito > 9) { // Mientras el dígito sea un valor negativo o mayor que 9
			System.out.println("Número no valido. Introduce un dígito. Mostraremos los valores del array que acaben con este valor: ");
			digito = sc.nextInt(); // Volvemos a pedírselo al usuario
		}
		
		// Guardamos en el nuevo array los valores que terminen con el dígito en cuestión (si existen)
		int arrayNuevo[] = valoresVectorConDigitoFinal(arrayUsuario, digito); 
		imprimirVector(arrayNuevo); // Imprimimos los números terminados con el dígito pasado por consola

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
	
	// Método en el que recibimos un vector por parámetro y mostramos los
	// valores que terminen con el dígito pasado por parámetro
	public static int[] valoresVectorConDigitoFinal(int[] vector, int digito) {
		
		int arrayUsuario[] = new int[vector.length]; // Creamos un nuevo array
		int j = 0; // Índice J para el nuevo array
		
		System.out.println("Números acabados en " + digito + ": ");
		for(int i = 0; i < vector.length; i++) {
			if(ultimoDigitoNumero(vector[i]) == digito) { // Si el ultimo digito de la posición i del vector coincide
				arrayUsuario[j] = vector[i]; // Asignamos a la posición j del arrayUsuario el valor de vector[i]
				j++; // Incrementamos en 1 el índice
			}
		}
		
		return arrayUsuario;
		
	}
	
	// Método en el que recibimos un vector por parámetro y lo mostramos
	// mediante un bucle FOR
	public static void imprimirVector(int[] vector) {
		
		for(int i = 0; i < vector.length; i++) {
			if(vector[i] != 0) { // Si el valor de la posición i es diferente de 0
				System.out.println("Valor de la posición " + i + " del array = " + vector[i]);
			}
		}
	}
	
	// Método que nos devuelve el último dígito de un número
	public static int ultimoDigitoNumero(int num) {
		int resultado = num % 10; // Realizamos el módulo para obtener el último dígito
		return resultado;
	}

}
