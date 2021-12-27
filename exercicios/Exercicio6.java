package src.com.lucas.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o primeiro número!");
		int numero1 = scan.nextInt();
		
		System.out.println("Entre com o segundo número!");
		int numero2 = scan.nextInt();

		System.out.println("Entre com o segundo número!");
		int numero3 = scan.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O maior número é: " + numero1);
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("O maior número é: " + numero2);
		} else if (numero3 > numero1 && numero3 > numero2) {
			System.out.println("O maior número é: " + numero3);
		}

	}

}
