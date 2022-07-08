package ejercicio2;

import java.util.Iterator;
import java.util.Scanner;

public class EjercicioDosApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la cantidad de números aleatorios qué deseas generar: ");
		int cantidadNums = sc.nextInt();
		System.out.println("Introduce entre qué números deseas generarlos:\n" + "Primer número: ");
		int primerNum = sc.nextInt();
		System.out.println("Segundo número: ");
		int segundoNum = sc.nextInt();

		// Utilizamos un for para mostrar por pantalla la cantidad de números que el usuario ha indicado
		for (int i = 1; i <= cantidadNums; i++) { 
			// Llamamos al método para generar un número aleatorio entre el intervalo introducido por consola
			System.out.println("Número aleatorio " + i + " = " + generarNumAleatorio(primerNum, segundoNum));
		}
		
		sc.close();
	}

	// Método que devuelve un número aleatorio dentro de un intervalo pasado
	// por parámetro
	public static int generarNumAleatorio(int primero, int segundo) {
		// Utilizamos math.random con el intervalo de números pasados por parámetro
		// para generar un número aleatorio
		int numeroAleatorio = (int) ((Math.random() * (segundo - primero)) + primero);
		return numeroAleatorio;
	}

}
