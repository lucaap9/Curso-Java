package src.com.lucas.cursojava.aula52.labs;

public class Contato {
	
	private static int contador = 0;
	
	private int id;
	private String nome;
	private String tel;
	private String email;
	
	public Contato() {
		contador++;
		id = contador;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", tel=" + tel + ", email=" + email + "]";
	}

}
