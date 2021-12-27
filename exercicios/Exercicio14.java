package src.com.lucas.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com a primeira nota!");
		double nota1 = scan.nextDouble();
		
		System.out.println("Entre com a segunda nota!");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		if(media >= 9) {
		System.out.println("Média final: " + media);
		System.out.println("Media de aproveitamento: A");
		System.out.println("Você foi aprovado!");
		}else if(media < 9 && media >= 7.5) {
			System.out.println("Média final: " + media);
			System.out.println("Media de aproveitamento: B");
			System.out.println("Você foi aprovado!");
		}else if(media < 7.5 && media >= 6) {
			System.out.println("Média final: " + media);
			System.out.println("Media de aproveitamento: C");
			System.out.println("Você foi aprovado!");
		}else if(media < 6 && media >= 4) {
			System.out.println("Média final: " + media);
			System.out.println("Media de aproveitamento: D");
			System.out.println("Você foi reprovado!");
		}else if(media < 4 && media >= 0) {
			System.out.println("Média final: " + media);
			System.out.println("Media de aproveitamento: E");
			System.out.println("Você foi reprovado!");
		} else {
			System.out.println("Media inválida!");
		}
	}

}
