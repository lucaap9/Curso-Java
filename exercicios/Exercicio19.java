package src.com.lucas.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero!");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo n�mero!");
		int num2 = scan.nextInt();
		
		System.out.println("Qual opera��o voc� deseja realizar?(-,+,*,/) ");
		String opera��o = scan.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch (opera��o) {
		case "+" : resultado = num1 + num2;break;
		case "-" : resultado = num1 - num2;break;
		case "*" : resultado = num1 * num2;break;
		case "/" : resultado = num1 / num2;break;
		default: System.out.println("Opera��o inv�lida!");
		valida = false;
		}
		if (valida) {
			
			System.out.println("Resultado: " + resultado);
			
			if (resultado >= 0) {
				System.out.println("Resultado positivo");
			}else {
				System.out.println("Resultado negativo");
			}
			if (resultado % 2 == 0) {
				System.out.println("Resultado par");
				
			}else {
				System.out.println("Resultado �mpar");
			}
			
		}

	}

}
