package src.com.lucas.cursojava.aula13;

import java.util.Scanner;

public class ExerciciosAula13b {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Digite o valor de um dos lados do quadrado!");
		int lado = scan.nextInt();
		int area = lado * lado;
		
		System.out.println("A �rea do seu quadrado �: " + area);
		
		int dobro = area * 2;
		System.out.println("O dobro da �rea do seu quadrado �: " + dobro);
		
		System.out.println("Digite o valor da sua hora trabalhada e quantas horas trabalha por m�s!");
		double vHora = scan.nextDouble();
		int hTrab = scan.nextInt();
		
		double salario = vHora * hTrab;
		System.out.println("O seu sal�rio mensal �: " + "R$" + salario);

	}


}
