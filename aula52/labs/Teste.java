package src.com.lucas.cursojava.aula52.labs;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		int opcao = 1;
		
		while (opcao !=3) {
			opcao = obterOpcaoMenu(scan);
			if (opcao == 1) {//Consultar contato
				consultarContato(scan, agenda);
			}else if (opcao == 2) {//Adicionar contato
				adicionarContato(scan, agenda); 
			}
		}
	}
	
	public static void adicionarContato(Scanner scan, Agenda agenda) {
		
		try {
			System.out.println("Criando um contato, entre com as informa��es");
			String nome = lerInfoString(scan, "Entre com nome do contato");
			String tel = lerInfoString(scan, "Entre com telefone do contato");
			String email = lerInfoString(scan, "Entre com email do contato");
			
			Contato contato = new Contato();
			contato.setNome(nome);
			contato.setTel(tel);
			contato.setEmail(email);
			
			System.out.println("Contato sendo criado: ");
			System.out.println(contato);
			agenda.adiocionarContato(contato);
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
			
			System.out.println("Contatos da agenda");
			System.out.println(agenda);
		}
	}
	
	public static void consultarContato(Scanner scan, Agenda agenda) {
		String nomeContato = lerInfoString(scan, "Entre com o nome do contato a ser pesquisado");
		try {
			if (agenda.consultaContatoPorNome(nomeContato) >= 0) {
				System.out.println("Contato existe!");
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static String lerInfoString(Scanner scan, String msg) {
		System.out.println(msg); 
		String entrada = scan.nextLine();
		return entrada;
	}
	
	public static int obterOpcaoMenu(Scanner scan) {
		
		boolean entradaValida = false;
		int opcao = 3;
		
		while (!entradaValida) {
			System.out.println("Digite a op��o desejada:");
			System.out.println("1: Consultar contato");
			System.out.println("2: Adicionar contato");
			System.out.println("3: Sair");
			
			try {
			String entrada = scan.nextLine();
			opcao = Integer.parseInt(entrada);
			
			     if (opcao == 1 || opcao == 2 || opcao == 3) {
			    	 entradaValida = true;
			     }else {
			    	 throw new Exception("Entrada inv�lida.");	
			     }
			}
			catch (Exception e) {
				System.out.println("Entrada inv�lida. Digite novamente\n");
			}
		}return opcao;
	}

}
