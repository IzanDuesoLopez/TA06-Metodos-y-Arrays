package ejercicio10;

import java.util.Scanner;

public class EjercicioDiezApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Pedimos al usuario el tamaño del array, un número máximo y mínimo para hacer el intervalo
		// de números aleatorios primos
		System.out.println("Introduce un tamaño para el array: ");
		int tamArray = sc.nextInt();
		System.out.println("Introduce un número mínimo: ");
		int min = sc.nextInt();
		System.out.println("Introduce un número máximo: ");
		int max = sc.nextInt();
		
		int arrayUser[] = generarArrayAleatorio(tamArray, min, max); // Generamos el array aleatorio
		imprimirVector(arrayUser); // Imprimimos el array
		
		if(numeroMasGrande(arrayUser) == -1) { // En el caso de que no se hayan podido generar números aleatorios primos
			System.out.println("¡No se han podido generar números aleatorios primos!");
		}else {
			System.out.println("El número mas grande de todos es: " + numeroMasGrande(arrayUser)); // Mostramos cuál es el número más grande
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
		
		// Método que recibe por parámetro un tamaño para el array, un número mínimo y máximo
		// con los que generara los números aleatorios. Comprobaremos si el número es primo, si lo
		// es lo pondremos en el array, si no lo es, el valor de esa posición será un -1.
		public static int[] generarArrayAleatorio(int tamArray, int minimo, int maximo) {

			int arrayUsuario[] = new int[tamArray]; // Declaramos el array con el tamaño recibido por parámetro
			int numTemp = 0;
			
			for (int i = 0; i < arrayUsuario.length; i++) {
				numTemp = (int) ((Math.random() * (maximo - minimo)) + minimo);
				if(esPrimo(numTemp)) {
					arrayUsuario[i] = numTemp; // Asignamos a cada posición del array un valor aleatorio dentro del intervalo
				}else {
					// He decidido implementar esta solución, ya que si el usuario introduce un intervalo sin números
					// primos y por ejemplo utilizamos un bucle while para asegurarnos de que todos los valores sean
					// números primos, estaríamos entrando en un bucle infinito. Por este motivo he optado por 
					// esta solución.
					arrayUsuario[i] = -1; 
				}
			}

			return arrayUsuario; // Devolvemos el array
		}
		
		// Método en el que recibimos un vector por parámetro y lo mostramos
		// mediante un bucle FOR
		public static void imprimirVector(int[] vector) {
			
			for(int i = 0; i < vector.length; i++) {
				if(vector[i] == -1) { // Si el valor de la posición i del vector es = a -1
					System.out.println("Valor de la posición " + i + " del array = No se ha generado un número aleatorio primo");
				}else {
					System.out.println("Valor de la posición " + i + " del array = " + vector[i]);
				}
				
			}
		}
		
		// Método que recibe un array tipo integer y nos devuelve cuál 
		// es el número más grande
		public static int numeroMasGrande(int[] vector) {
			
			int numMax = vector[0]; // Diremos que el número más grande es el primero del array
			
			for(int i = 1; i < vector.length; i++) {
				if(vector[i] > numMax) { // Sí encontramos un número más largo en la iteración del array
					numMax = vector[i]; // Diremos que el número más grande es igual a este
				}
			}
			
			return numMax;
		}

}
