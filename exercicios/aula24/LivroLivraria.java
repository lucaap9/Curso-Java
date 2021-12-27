package src.com.lucas.cursojava.exercicios.aula24;

import java.util.Date;

public class LivroLivraria {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		livro.titulo = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.ano = 2015;
        livro.numPaginas = 245;
        livro.preco = 63.39;
        
        livro.alugado = true;
        livro.dataEntrega = new Date();
        livro.alugador = "Lucas";
        
		System.out.println("Nome do livro: " + livro.titulo	);

	}

}
