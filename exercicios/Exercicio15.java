package src.com.lucas.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o valor do primeiro lado do triângulo!");
		double lado1 = scan.nextDouble();
		
		System.out.println("Entre com o valor do segundo lado do triângulo!");
		double lado2 = scan.nextDouble();
		
		System.out.println("Entre com o valor do terceiro lado do triângulo!");
		double lado3 = scan.nextDouble();
		
		if((lado1 + lado2 > lado3 || lado1 + lado3 > lado2 || lado2 + lado3 > lado1)&& (lado1 == lado2 && lado1 ==lado3) ) {
			System.out.println("Isto é um trinâgulo!");
			System.out.println("Temos um triângulo equilátero!");
		}else if ((lado1 + lado2 > lado3 || lado1 + lado3 > lado2 || lado2 + lado3 > lado1)&& (lado1 == lado2 ^ lado1 == lado3 ^ lado2 == lado3 ) ) {
			System.out.println("Isto é um trinâgulo!");
			System.out.println("Temos um triângulo isósceles!");
		}else if ((lado1 + lado2 > lado3 || lado1 + lado3 > lado2 || lado2 + lado3 > lado1)&& (lado1 != lado2 && lado1 != lado3 && lado2 != lado3 ) ) {
			System.out.println("Isto é um trinâgulo!");
			System.out.println("Temos um triângulo Escaleno!");
		}else {
			System.out.println("Isto é não um trinâgulo!");
		}

	}

}
