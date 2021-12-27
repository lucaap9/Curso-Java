package src.com.lucas.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com uma letra (F ou M)!");
		String letra = scan.next();
		
		if (letra.equalsIgnoreCase("F")) {
			System.out.println("F - feminino");
			
		}else if (letra.equalsIgnoreCase("M")) {
			System.out.println("M - masculino");
		} else {
			System.out.println("Sexo inválido!");
		}
		
	}

}
