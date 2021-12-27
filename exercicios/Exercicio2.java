package src.com.lucas.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um valor!");
		double valor = scan.nextDouble();
		
		if (valor > 0) {
			System.out.println("Valor positivo!");
		} else if (valor < 0) {
			System.out.println("Valor negativo!");
		} else {
			System.out.println("Seu valor é 0");
		}

	}

}
