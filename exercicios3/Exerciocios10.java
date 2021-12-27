package src.com.lucas.cursojava.exercicios3;

public class Exerciocios10 {

	public static void main(String[] args) {
		int a[] = new int[10];
		a[0] = 9;
		a[1] = 25;
		a[2] = 64;
		a[3] = 225;
		a[4] = 36;
		a[5] = 4;
		a[6] = 1;
		a[7] = 16;
		a[8] = 100;
		a[9] = 196;
		
		
		for(int i=0; i <10; i++) {
			if(a[i] % 2 != 0)
				continue;
			System.out.println("Valor de A: " + a[i]);
				
			
		}

	}

}
