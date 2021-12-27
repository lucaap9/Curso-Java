package src.com.lucas.cursojava.exercicios.aula24;

public class lampada {
	
	String tensao;
	String modelo;
	String cor;
	String tipoLuz;
	String[] tipos;
	int potencia;
	int garantiaMeses;
	boolean tipoAbajur;
	
	boolean ligada;
	
	void ligar() {
		ligada = true;
	}
	void desligar() {
		ligada = false;
	}
	
	void mostrarEstado() {
		if(ligada) {
			System.out.println("Lâmpada está ligada");
			}else {
				System.out.println("Lâmpada está desligada");
			}
	}

}
