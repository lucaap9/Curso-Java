package src.com.lucas.cursojava.aula13;

import java.util.Scanner;

public class ExerciciosAula13d {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Digite dois números inteiros e um real!");
		int inte1 = scan.nextInt();
		int inte2 = scan.nextInt();
		double real = scan.nextDouble();
		
		double a = (inte1 * 2) * (inte2 / 2);
		double b = inte1 * 3 + real;
		double c = real * real * real;
		
		System.out.println("O resultado de A é: " + a);
		System.out.println("O resultado de B é: " + b);
		System.out.println("O resultado de C é: " + c);
		

	}

}
