package src.com.lucas.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o salário!");
		double salario = scan.nextDouble();
		
		if (salario <= 280) {
			double aumento = (salario / 100) * 20;
			double salario2 = (salario + aumento);
			int percentual = 20;
			System.out.println("Salario inicial: " + "R$" + salario + " percentual: " + percentual + "%" + " Valor do aumento: " + "R$" + aumento + " Novo salário: " + "R$" + salario2);
		} else if (salario > 280 && salario <= 700) {
			double aumento = (salario / 100) * 15;
			double salario2 = (salario + aumento);
			int percentual = 15;
			System.out.println("Salario inicial: " + "R$" + salario + " percentual: " + percentual + "%" + " Valor do aumento: " + "R$" + aumento + " Novo salário: " + "R$" + salario2);
		} else if (salario > 700 && salario < 1500) {
			double aumento = (salario / 100) * 10;
			double salario2 = (salario + aumento);
			int percentual = 10;
			System.out.println("Salario inicial: " + "R$" + salario + " percentual: " + percentual + "%" + " Valor do aumento: " + "R$" + aumento + " Novo salário: " + "R$" + salario2);
		} else if (salario >= 1500) {
			double aumento = (salario / 100) * 5;
			double salario2 = (salario + aumento);
			int percentual = 5;
			System.out.println("Salario inicial: " + "R$" + salario + " percentual: " + percentual + "%" + " Valor do aumento: " + "R$" + aumento + " Novo salário: " + "R$" + salario2);
		} else {
			System.out.println("Valor inexistente!");
		}
	}

}
