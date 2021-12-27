package src.com.lucas.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da sua hora trabalhada e quantas horas trabalha por mês!");
		double vHora = scan.nextDouble();
		int hTrab = scan.nextInt();
		
		double salarioBruto = vHora * hTrab;
		double sindicato = (salarioBruto / 100) * 3;
		if (salarioBruto <= 900){ 
			double ir = (salarioBruto / 100) * 0;
			double fgts = (salarioBruto / 100) * 11;
			double totalDescontos = sindicato + ir;
			double salarioLiquido = salarioBruto - totalDescontos;
			
			System.out.println("O seu salário bruto é: " + "R$" + salarioBruto);
			System.out.println("O desconto do sindicato é: " + "R$" + sindicato);
			System.out.println("FGTS depositado pela empresa: " + "R$" + fgts);
			System.out.println("O desconto do imposto de renda é: " + "R$" + ir);
			System.out.println("O total de descontos é: " + "R$" + totalDescontos);
			System.out.println("O seu salário líquido é: " + "R$" + salarioLiquido);
			
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
		double ir = (salarioBruto / 100) * 5;
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = sindicato + ir;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("O seu salário bruto é: " + "R$" + salarioBruto);
		System.out.println("O desconto do sindicato é: " + "R$" + sindicato);
		System.out.println("FGTS depositado pela empresa: " + "R$" + fgts);
		System.out.println("O desconto do imposto de renda é: " + "R$" + ir);
		System.out.println("O total de descontos é: " + "R$" + totalDescontos);
		System.out.println("O seu salário líquido é: " + "R$" + salarioLiquido);

		}else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			double ir = (salarioBruto / 100) * 10;
			double fgts = (salarioBruto / 100) * 11;
			double totalDescontos = sindicato + ir;
			double salarioLiquido = salarioBruto - totalDescontos;
			
			System.out.println("O seu salário bruto é: " + "R$" + salarioBruto);
			System.out.println("O desconto do sindicato é: " + "R$" + sindicato);
			System.out.println("FGTS depositado pela empresa: " + "R$" + fgts);
			System.out.println("O desconto do imposto de renda é: " + "R$" + ir);
			System.out.println("O total de descontos é: " + "R$" + totalDescontos);
			System.out.println("O seu salário líquido é: " + "R$" + salarioLiquido);
		}else if (salarioBruto > 2500) {
			double ir = (salarioBruto / 100) * 20;
			double fgts = (salarioBruto / 100) * 11;
			double totalDescontos = sindicato + ir;
			double salarioLiquido = salarioBruto - totalDescontos;
			
			System.out.println("O seu salário bruto é: " + "R$" + salarioBruto);
			System.out.println("O desconto do sindicato é: " + "R$" + sindicato);
			System.out.println("FGTS depositado pela empresa: " + "R$" + fgts);
			System.out.println("O desconto do imposto de renda é: " + "R$" + ir);
			System.out.println("O total de descontos é: " + "R$" + totalDescontos);
			System.out.println("O seu salário líquido é: " + "R$" + salarioLiquido);
		}
	}

}
