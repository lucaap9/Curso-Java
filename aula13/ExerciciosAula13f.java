package src.com.lucas.cursojava.aula13;

import java.util.Scanner;

public class ExerciciosAula13f {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da sua hora trabalhada e quantas horas trabalha por m�s!");
		double vHora = scan.nextDouble();
		int hTrab = scan.nextInt();
		
		double salarioBruto = vHora * hTrab;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("O seu sal�rio bruto �: " + "R$" + salarioBruto);
		System.out.println("O desconto do inss �: " + "R$" + inss);
		System.out.println("O desconto do sindicato �: " + "R$" + sindicato);
		System.out.println("O desconto do imposto de renda �: " + "R$" + ir);
		System.out.println("O total de descontos �: " + "R$" + totalDescontos);
		System.out.println("O seu sal�rio l�quido �: " + "R$" + salarioLiquido);


	}

}
