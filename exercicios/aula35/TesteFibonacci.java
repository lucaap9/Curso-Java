package src.com.lucas.cursojava.exercicios.aula35;

public class TesteFibonacci {

	public static void main(String[] args) {

		for(int i=0; i<20; i++) {
			System.out.print(Fibonacci.fibonacci(i)+ " ");
		}
		System.out.println();
		System.out.println(Fibonacci.fibonacci(10));
	}

}
