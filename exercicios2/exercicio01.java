package src.com.lucas.cursojava.exercicios2;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
		System.out.println("Entre com uma nota de 1 a 10! ");
		double nota = scan.nextInt();
		
		if (nota <= 10 && nota >= 0 ) {
			notaValida = true;
			System.out.println("Sua nota �: " + nota);
		}else {
			System.out.println("Nota inv�lida, digite novamente! ");
		}
		} while(!notaValida);
	}

}
