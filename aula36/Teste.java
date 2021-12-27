package src.com.lucas.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {

		Contato contato =new Contato();
		contato.setNome("Tyrion");
		//contato.setEndereco("Kings Landing");
		//contato.setTelefone("11 99999-9999");
		
		//Relacionamento tem-um Telefone
		Telefone tel = new Telefone();
		tel.setDdd("11");
		tel.setNumero("99999-9999");
		tel.setTipo("Celular");
		
		Telefone tel2 = new Telefone();
		tel2.setDdd("11");
		tel2.setNumero("88888-8888");
		tel2.setTipo("Casa");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;
		
		//Relacionamento tem-um Endereço
		Endereco end = new Endereco();
		end.setNomeRua("Rua Game of Thrones");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Kings Landing");
		end.setEstado("Westeros");
		end.setCep("99999-99");
		
		contato.setEndereco(end);
		
		//contato.setTelefone(tel);
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
		
		/*if(contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd()+ " " + contato.getTelefone().getNumero());
		}*/
		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd()+ " " + t.getNumero());

			}
		}
		
		if (contato != null && contato.getEndereco() != null) {
		System.out.println(contato.getEndereco().getCidade());
		}
	}

}
