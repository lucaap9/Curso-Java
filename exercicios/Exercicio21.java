package src.com.lucas.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de litros vendidos!");
		double litros = scan.nextDouble();
		
		System.out.println("Entre com o tipo de combustível!");
		String tipo = scan.next();
		
		double precoGas = 2.5;
		double precoAlc = 1.9;
		int percDesc = 0;
		double total = 0;
		double totalDesc = 0;
		
		if (tipo.equalsIgnoreCase("alcool")) {
			if (litros <= 20) {
				percDesc = 3;
			} else {
				percDesc = 5;
			}
			total = litros * precoAlc;
		}
			if (tipo.equalsIgnoreCase("gasolina")) {
				if (litros <= 20) {
					percDesc = 4;
				} else {
					percDesc = 6;
				}
				total = litros * precoGas;
		}
		totalDesc = (total / 100) * percDesc;
		
		double precoAPagar = total - totalDesc;
		
		System.out.println("O valor a ser pago é: " + precoAPagar);

	}

}
