package src.com.lucas.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero:");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite:");
		int max = scan.nextInt();
		
		for (int i=num; i <= max; i++) {
			if (i % 7 == 0) {
				System.out.println("O valor de I �: " + i);break;
			}
			
			
		}System.out.println("Entre com um n�mero:");
		int nume = scan.nextInt();
		
		System.out.println("Entre com um limite:");
		int maxi = scan.nextInt();
		
		for (int i=nume; i <= maxi; i++) {
			if (i % 7 == 0) {
				continue;
			}System.out.println("O valor de I �: " + i);
			
		}

	}

}
