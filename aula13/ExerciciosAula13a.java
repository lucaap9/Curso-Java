package src.com.lucas.cursojava.aula13;

import java.util.Scanner;

public class ExerciciosAula13a {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Digite sua altura em metros!");
		
		double altura = scan.nextDouble();
		double resultado = altura * 100;
		
		System.out.println("Sua altura em centimetros é: " + resultado);
		
		System.out.println("Digite o raio do círculo");
		
		double raio = scan.nextDouble();
		double area = Math.PI * (raio * raio);
		
		System.out.println("A área do círculo é: " + area + "cm²");

	}

}
