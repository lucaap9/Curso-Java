package src.com.lucas.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o valor do primeiro lado do tri�ngulo!");
		double lado1 = scan.nextDouble();
		
		System.out.println("Entre com o valor do segundo lado do tri�ngulo!");
		double lado2 = scan.nextDouble();
		
		System.out.println("Entre com o valor do terceiro lado do tri�ngulo!");
		double lado3 = scan.nextDouble();
		
		if((lado1 + lado2 > lado3 || lado1 + lado3 > lado2 || lado2 + lado3 > lado1)&& (lado1 == lado2 && lado1 ==lado3) ) {
			System.out.println("Isto � um trin�gulo!");
			System.out.println("Temos um tri�ngulo equil�tero!");
		}else if ((lado1 + lado2 > lado3 || lado1 + lado3 > lado2 || lado2 + lado3 > lado1)&& (lado1 == lado2 ^ lado1 == lado3 ^ lado2 == lado3 ) ) {
			System.out.println("Isto � um trin�gulo!");
			System.out.println("Temos um tri�ngulo is�sceles!");
		}else if ((lado1 + lado2 > lado3 || lado1 + lado3 > lado2 || lado2 + lado3 > lado1)&& (lado1 != lado2 && lado1 != lado3 && lado2 != lado3 ) ) {
			System.out.println("Isto � um trin�gulo!");
			System.out.println("Temos um tri�ngulo Escaleno!");
		}else {
			System.out.println("Isto � n�o um trin�gulo!");
		}

	}

}
