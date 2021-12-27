package src.com.lucas.cursojava.exercicios3;

public class exercicios02 {

	public static void main(String[] args) {
		int[] a = new int[8];
		a[0] = 12;
		a[1] = 15;
		a[2] = 13;
		a[3] = 17;
		a[4] = 18;
		a[5] = 11;
		a[6] = 13;
		a[7] = 19;
		
		int[] b = new int[8];
		
		for(int i=0;i<8 ;i++) {
			b[i] = a[i] * 2;
			System.out.println("Valor de A: " + a[i] + " Valor de B: " + b[i]);
		}

	}

}
