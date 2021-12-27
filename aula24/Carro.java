package src.com.lucas.cursojava.aula24;

public class Carro {

	String marca;
	String modelo;
	int numeroPassegeiros;
	double capCombustivel;
	double consumoCombustivel;
	
	public Carro(String marca, String modelo, int numeroPassegeiros,
			double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroPassegeiros = numeroPassegeiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro() {}
	
	public Carro(String marca, String modelo) {
       this("Fiat", "Ducato", 10);
       System.out.println("Chamando o construtor com 2 parâmetros");
	}

	public Carro(String marca, String modelo, int numeroPassegeiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroPassegeiros = numeroPassegeiros;
		System.out.println("Chamando o construtor com 3 parâmetros");
	}

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel);
	}
	
    double obterAutonomia() {
	
	System.out.println("Método obterAutonomia foi chamado. ");
		
		return this.capCombustivel * this.consumoCombustivel; 
	}

    double calcularCombustivel(double km) {
    	
    	double qtdCombustivel = km / this.consumoCombustivel;
    	
    	return qtdCombustivel;
    }
}
