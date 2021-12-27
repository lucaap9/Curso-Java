package src.com.lucas.cursojava.aula43.labs.exer01;

public class Teste {

	public static void main(String[] args) {

		System.out.println("*** Teste ContaPoupança ***");
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Cliente conta Poupança");
		contaPoupanca.setNumConta("22222");
		contaPoupanca.setDiaRedimento(21);
		
		contaPoupanca.depositar(100);
		
		realizaSaque(contaPoupanca, 50);
		
		realizaSaque(contaPoupanca, 70);
		
		if (contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado! Novo saldo é de: " + contaPoupanca.getSaldo() );
		} else {
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
		}
		
		System.out.println(contaPoupanca);
		
        System.out.println("*** Teste ContaEspecial ***");
		
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("Cliente conta Especial");
		contaEspecial.setNumConta("33333");
		contaEspecial.setLimite(50);
		
		contaEspecial.depositar(100);
		
		realizaSaque(contaEspecial, 50);
		
		realizaSaque(contaEspecial, 70);
		
		realizaSaque(contaEspecial, 80);
		
		System.out.println(contaEspecial);
	}
	
	private static void realizaSaque(ContaBancaria conta, double valor) {
		if(conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para saque de: " + valor + "; Seu saldo: " + conta.getSaldo());
		}
		
	}
	

}
