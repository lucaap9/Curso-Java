package src.com.lucas.cursojava.exercicios3;

public class Exercicios04 {

	public static void main(String[] args) {
		int[] a = new int[15];
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
		a[10] = 144;
		a[11] = 121;
		a[12] = 81;
		a[13] = 49;
		a[14] = 169;
		
		double[] b =new double[15];
		
		for (int i=0; i<15;i++) {
			b[i] = Math.sqrt(a[i]);
			System.out.println("Valor de A: " + a[i] + " Valor de B: " + b[i]);
		}

	}

}
