package src.com.lucas.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o primeiro número!");
		int numero1 = scan.nextInt();
				
				System.out.println("Entre com o segundo número!");
				int numero2 = scan.nextInt();

				System.out.println("Entre com o segundo número!");
				int numero3 = scan.nextInt();
				
				if ((numero1 >= numero2 && numero1 >= numero3)&&(numero1 >= numero2 && numero2 >= numero3)) {
					System.out.println(numero3 + "-" + numero2 + "-" + numero1);
				} else if ((numero1 >= numero2 && numero1 >= numero3)&&(numero1 >= numero2 && numero3 >= numero2)) {
					System.out.println(numero2 + "-" + numero3 + "-" + numero1);
				} else if ((numero2 >= numero1 && numero2 >= numero3)&&(numero2 >= numero1 && numero1 >= numero3)) {
					System.out.println(numero3 + "-" + numero1 + "-" + numero2);
				} else if ((numero2 >= numero1 && numero2 >= numero3)&&(numero2 >= numero1 && numero3 >= numero1)) {
					System.out.println(numero1 + "-" + numero3 + "-" + numero2);
				} else if ((numero3 >= numero1 && numero3 >= numero2)&&(numero3 >= numero1 && numero2 >= numero1)) {
					System.out.println(numero1 + "-" + numero2 + "-" + numero3);
				} else if ((numero3 >= numero1 && numero3 >= numero2)&&(numero3 >= numero1 && numero1 >= numero2)) {
					System.out.println(numero2 + "-" + numero1 + "-" + numero3);
				} else {
					System.out.println(numero2 + "-" + numero1 + "-" + numero3);
				}

	}

}
