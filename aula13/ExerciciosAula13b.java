package src.com.lucas.cursojava.aula13;

import java.util.Scanner;

public class ExerciciosAula13b {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Digite o valor de um dos lados do quadrado!");
		int lado = scan.nextInt();
		int area = lado * lado;
		
		System.out.println("A área do seu quadrado é: " + area);
		
		int dobro = area * 2;
		System.out.println("O dobro da área do seu quadrado é: " + dobro);
		
		System.out.println("Digite o valor da sua hora trabalhada e quantas horas trabalha por mês!");
		double vHora = scan.nextDouble();
		int hTrab = scan.nextInt();
		
		double salario = vHora * hTrab;
		System.out.println("O seu salário mensal é: " + "R$" + salario);

	}


}
