package src.com.lucas.cursojava.aula49;

public class FinallyPegadinha {
	public static void main(String[] args) {
		int[] numeros = {4,8,16,32,64,128} ;
		int[] demon = {2,0,4,8,0};
		
		for (int i=0; i<numeros.length; i++) {
			try {
			System.out.println(numeros[i] +	"/" + demon[i] + "=" +(numeros[i]/demon[i]));
		}catch(ArithmeticException e1){
			System.out.println("erro ao dividir por 0");
			System.exit(0);
		}catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("erro ao tentar dividir por posi��o do array vazia");
			System.exit(0);
		}
		finally {
			System.out.println("Essa linha � impressa sempre ap�s o try ou catch");
			System.out.println();
		}
	 }

	}

}
