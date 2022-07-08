package ejercicio1;

import java.util.Scanner;

public class EjercicioUnoApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario qué figura quiere calcular
		System.out.println("¿De qué figura quieres calcular su área? (Escríbelo a continuación)");
		System.out.println("- Circulo\n" + "- Triángulo\n" + "- Cuadrado");
		String figura = sc.next();

		if (figura.equalsIgnoreCase("Circulo")) { // Si el usuario desea calcular el área del circulo
			
			System.out.println("Introduce el radio del círculo: ");
			double radio = sc.nextDouble();
			System.out.println("Área del círculo = " + areaCirculo(radio)); // Llamamos al método pasándole radio por parámetro 
			
		} else if (figura.equalsIgnoreCase("Triangulo") || figura.equalsIgnoreCase("Triángulo")) { // Si el usuario desea calcular el área del triángulo
			
			System.out.println("Introduce la base del triángulo: ");
			double base = sc.nextDouble();
			System.out.println("Introduce la altura del triángulo: ");
			double altura = sc.nextDouble();
			System.out.println("Área del triángulo = " + areaTriangulo(base, altura)); // Llamamos al método pasándole base y altura por parámetro
			
		} else if (figura.equalsIgnoreCase("Cuadrado")) { // Si el usuario desea calcular el área del cuadrado
			
			System.out.println("Introduce un lado del cuadrado: ");
			double lado = sc.nextDouble();
			System.out.println("Área del cuadrado = " + areaCuadrado(lado)); // Llamamos al método pasándole un lado por parámetro
			
		} else {
			System.out.println("¡La figura introducida no es válida!");
		}
		sc.close();
	}

	// Método que nos devuelve el área de un círculo pasándole su radio por
	// parámetro
	public static double areaCirculo(double radio) {
		double radioPow = Math.pow(radio, 2);
		final double PI = Math.PI;
		return radioPow * PI;
	}

	// Método que nos devuelve el área de un triángulo pasándole base y altura
	// por parámetro
	public static double areaTriangulo(double base, double altura) {
		double resultado = (base * altura) / 2;
		return resultado;
	}

	// Método que nos devuelve el área de un cuadrado pasándole uno de
	// sus lados por parámetro
	public static double areaCuadrado(double lado) {
		double resultado = lado * lado;
		return resultado;
	}

}
