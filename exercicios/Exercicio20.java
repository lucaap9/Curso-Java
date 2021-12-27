package src.com.lucas.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou pra vítima?");
		String resposta1 = scan.next();
		
		System.out.println("Esteve no local do crime?");
		String resposta2 = scan.next();
		
		System.out.println("Mora perto da vítima?");
		String resposta3 = scan.next();

		System.out.println("Já trabalhou com a vítima?");
		String resposta4 = scan.next();
		
		System.out.println("Devia para a vítima?");
		String resposta5 = scan.next();
		
		int cont = 0;
		
		if (resposta1.equalsIgnoreCase("Sim")) {
			cont++;
		}if (resposta2.equalsIgnoreCase("Sim")) {
			cont++;
		}if (resposta3.equalsIgnoreCase("Sim")) {
			cont++;
		}if (resposta4.equalsIgnoreCase("Sim")) {
			cont++;
		}if (resposta5.equalsIgnoreCase("Sim")) {
			cont++;
		}
		if (cont == 2) {
			System.out.println("Suspeito!");
		} else if (cont == 3 || cont == 4) {
			System.out.println("Cúmplice!");
		} else if (cont == 5) {
			System.out.println("Assassino!");
		} else  {
			System.out.println("Inocente!");
		}

	}

}
