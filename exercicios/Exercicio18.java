package src.com.lucas.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero!");
		int numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero + " � um n�mero par!");
		}else {
			System.out.println(numero + " � um n�mero �mpar!");
		}

	}

}
