package src.com.lucas.cursojava.exercicios.aula24;

public class TesteLampada {

	public static void main(String[] args) {
		
		lampada lampada = new lampada();
		
		lampada.ligar();
		
		lampada.mostrarEstado();
		
        lampada.desligar();
        
        lampada.mostrarEstado();

	}

}
