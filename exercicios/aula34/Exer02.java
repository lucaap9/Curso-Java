 package src.com.lucas.cursojava.exercicios.aula34;

public class Exer02 {

	public static void main(String[] args) {
		
		imprimirTela(Calculadora.somar(1, 2));
		
		imprimirTela(Calculadora.subtrair(2, 1));
		
		imprimirTela(Calculadora.multiplicar(2, 2));
		
		imprimirTela(Calculadora.dividir(4, 2));
		
		imprimirTela(Calculadora.potencia(2, 3));

	}
	
static void imprimirTela(double num) {
	System.out.println(num);
}
}
