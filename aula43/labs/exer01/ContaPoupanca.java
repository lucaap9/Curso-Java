package src.com.lucas.cursojava.aula43.labs.exer01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
	
	private int diaRedimento;

	public int getDiaRedimento() {
		return diaRedimento;
	}

	public void setDiaRedimento(int diaRedimento) {
		this.diaRedimento = diaRedimento;
	}

	@Override
	public String toString() {
		String s = "ContaPoupanca[";
		 s += "diaRedimento: " + diaRedimento;
		 s +=  "; " + super.toString();
		 s += ";]";
		return s;
	}
	
	public boolean calcularNovoSaldo(double taxaRendimento) {
		
		Calendar hoje = Calendar.getInstance();
		
		if(diaRedimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			//saldo += saldo * taxaRendimento;
			this.setSaldo(this.getSaldo() + (this.getSaldo()) * taxaRendimento);
			return true;
		}
		return false;
	}

}
