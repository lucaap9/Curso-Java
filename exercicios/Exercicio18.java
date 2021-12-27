package src.com.lucas.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número!");
		int numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero + " É um número par!");
		}else {
			System.out.println(numero + " É um número ímpar!");
		}

	}

}
