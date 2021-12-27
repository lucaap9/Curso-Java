package src.com.lucas.cursojava.exercicios2;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean nomeIgual = false;
		
		do {
		System.out.println("Entre com um nome:");
		String nome = scan.next();
		
		System.out.println("Entre com uma senha:");
		String senha = scan.next();
		
		if (nome.equalsIgnoreCase(senha)) {
			System.out.println("Erro! Sua senha não pode ser igual ao seu nome.");
			System.out.println("Refaça o login!");
		} else {
			System.out.println("Login efetuado!");
			nomeIgual = true;
		}
		} while (!nomeIgual);
	}

}
