package src.com.lucas.cursojava.aula24;

public class testeCarro {

	public static void main(String[] args) {
		
	 Carro van = new Carro();
	 van.marca = "Fiat";
	 van.modelo = "Ducato";
	 van.numeroPassegeiros = 10;
	 van.capCombustivel = 100;
	 van.consumoCombustivel = 0.2;
	 
	 System.out.println(van.marca);
	 System.out.println(van.modelo);
	 
	 van.exibirAutonomia();
	 
	 double autonomia = van.obterAutonomia();
	 System.out.println("A autonomia do carro é: " + autonomia);
	 System.out.println("A autonomia do carro é: " + van.obterAutonomia());
	 
	 double qtdCombustivel10 = van.calcularCombustivel(10);
	 double qtdCombustivel15 = van.calcularCombustivel(15);
	 
	 System.out.println("Quanto de combustível para andar 10 km: " + qtdCombustivel10);
	 System.out.println("Quanto de combustível para andar 15 km: " + qtdCombustivel15);
	
	 
	}	
	
}


