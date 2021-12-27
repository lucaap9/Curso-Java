package src.com.lucas.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor de A!");
		int a  = scan.nextInt();
		
		if (a == 0) {
			System.out.println("Não é equação de segundo grau!");
		} else {
			System.out.println("Entre com o valor de B!");
			int b  = scan.nextInt();
			
			System.out.println("Entre com o valor de C!");
			int c  = scan.nextInt();
			
			double delta = (b*b) - (4 * a * c);
			if (delta < 0) {
				System.out.println("Delta negativo!");
			} else {
				double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
				double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
				
				System.out.println("Delta = " + delta);
				
				System.out.println("X' = " + x1);
				System.out.println("X'' = " + x2);
			}
				
		} 

	}

}
