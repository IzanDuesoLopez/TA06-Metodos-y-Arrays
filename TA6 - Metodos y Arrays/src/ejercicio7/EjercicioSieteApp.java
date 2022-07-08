package ejercicio7;

import java.util.Scanner;

public class EjercicioSieteApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca por consola la cantidad de euros a convertir
		// y la moneda a la que desea convertir
		System.out.println("Introduce la cantidad de euros a convertir: ");
		int euros = sc.nextInt();
		System.out.println("Introduce la moneda a la que deseas convertir los euros: \n - Dolares\n - Yenes\n - Libras");
		String moneda = sc.next();
		sc.close();
		
		convertirEuros(euros, moneda); // Llamamos al método que transforma e imprime los euros pasados a la moneda pasada por parámetro
	}
	
	// Método que transforma e imprime una cantidad de euros en otra moneda pasada por parámetro
	public static void convertirEuros(int euros, String moneda) {
		double resultado;
		
		if(moneda.equalsIgnoreCase("Dolares")) { // Comprobamos en cada condicional si la cadena que ha introducido el usuario coincide con alguna moneda
			
			resultado = euros * 1.28611; // En cada caso multiplicaremos la cantidad de euros por el valor de 1 euro pasado a la moneda en cuestión
			System.out.println(euros + "€ son " + resultado + "$ dolares"); // Finalmente, mostraremos por pantalla en cada caso la cantidad de euros y su transformación
			
		} else if (moneda.equalsIgnoreCase("Yenes")) {
			
			resultado = euros * 129.852;
			System.out.println(euros + "€ son " + resultado + " yenes");
			
		} else if (moneda.equalsIgnoreCase("Libras")) {
			
			resultado = euros * 0.86;
			System.out.println(euros + "€ son " + resultado + " libras");
			
		} else { // En el caso de que la cadena introducida no coincida con las que estamos controlando
			System.out.println("¡Valores introducidos incorrectos!");
		}
		
	}

}
