package src.com.lucas.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		double tempDia001 = 31.3;
		double tempDia002 = 27.3;
		double tempDia003 = 32.3;
		double tempDia004 = 36.3;
		double tempDia005 = 30.3;
		
		double[] temperaturas = new double [365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 27.3;
		temperaturas[2] = 32.3;
		temperaturas[3] = 36.3;
		temperaturas[4] = 30.3;
		
		System.out.println("O valor da temperatura do dia 01 é: " + temperaturas[0]);
		System.out.println("O tamanho do array é: " + temperaturas.length);
		System.out.println("Valores do array:");
		
		for (int i=0; i<temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i + 1) +" é: " + temperaturas[i]);
		}
		
	}

}
