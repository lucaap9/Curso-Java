package src.com.lucas.cursojava.aula13;

import java.util.Scanner;

public class ExerciciosAula13a {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Digite sua altura em metros!");
		
		double altura = scan.nextDouble();
		double resultado = altura * 100;
		
		System.out.println("Sua altura em centimetros �: " + resultado);
		
		System.out.println("Digite o raio do c�rculo");
		
		double raio = scan.nextDouble();
		double area = Math.PI * (raio * raio);
		
		System.out.println("A �rea do c�rculo �: " + area + "cm�");

	}

}
