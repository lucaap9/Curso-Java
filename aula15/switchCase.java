package src.com.lucas.cursojava.aula15;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Diga o dia da semana (1-7)!");
		int diaSemana = scan.nextInt();
		
		if (diaSemana == 1) {
			System.out.println("Domingo");
		} else if (diaSemana == 2) {
			System.out.println("Segunda Feira");
		}else if (diaSemana == 3) {
			System.out.println("Terça Feira");
		}else if (diaSemana == 4) {
			System.out.println("Quarta Feira");
		}else if (diaSemana == 5) {
			System.out.println("Quinta Feira");
		}else if (diaSemana == 6) {
			System.out.println("Sexta Feira");
		}else if (diaSemana == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Dia inválido!");
		}
		switch(diaSemana) {
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda Feira");break;
		case 3: System.out.println("Terça Feira");break;
		case 4: System.out.println("Quarta Feira");break;
		case 5: System.out.println("Quita Feira");break;
		case 6: System.out.println("Sexta Feira");break;
		case 7: System.out.println("Sábado");break;
		default: System.out.println("Dia inválido!");
		}
		
	}

}
