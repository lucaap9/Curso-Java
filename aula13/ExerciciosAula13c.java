package src.com.lucas.cursojava.aula13;

import java.util.Scanner;

public class ExerciciosAula13c {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Digite a temperatura em fahrenheit!");
		int temp1 = scan.nextInt();
		double celsius = (5 * (temp1 - 32)/ 9);
		
		System.out.println("A temperatura em Celsius é: " + celsius+ "°");
		
		System.out.println("Digite a temperatura em Celsius!");
		int tC = scan.nextInt();
		double tF = (tC * 9 + 160)/ 5;
		
		System.out.println("A temperatura em Fahrenheit é: " + tF+ "°");
		

	}

}
