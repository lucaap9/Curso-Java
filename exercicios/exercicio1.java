package src.com.lucas.cursojava.exercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero!");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo n�mero!");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("O maior n�mero �: " + num1);
		} else if (num2 > num1) {
			System.out.println("O maior n�mero �: " + num2);
		} else { 
			System.out.println("N�meros iguais!");
		}

	}

}
