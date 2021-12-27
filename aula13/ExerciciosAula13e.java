package src.com.lucas.cursojava.aula13;

import java.util.Scanner;

public class ExerciciosAula13e {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Entre com a altura!");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Opeso ideal é: " + pesoIdeal);
		
		

	}

}
