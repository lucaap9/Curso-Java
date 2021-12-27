package src.com.lucas.cursojava.aula13;

import java.util.Scanner;

public class ExerciciosAula13f {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da sua hora trabalhada e quantas horas trabalha por mês!");
		double vHora = scan.nextDouble();
		int hTrab = scan.nextInt();
		
		double salarioBruto = vHora * hTrab;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("O seu salário bruto é: " + "R$" + salarioBruto);
		System.out.println("O desconto do inss é: " + "R$" + inss);
		System.out.println("O desconto do sindicato é: " + "R$" + sindicato);
		System.out.println("O desconto do imposto de renda é: " + "R$" + ir);
		System.out.println("O total de descontos é: " + "R$" + totalDescontos);
		System.out.println("O seu salário líquido é: " + "R$" + salarioLiquido);


	}

}
