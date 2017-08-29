package br.com.contaCorrente.www;

public class Conta {
	private String agencia;
	private String conta;
	private String titular;
	
	public Conta(String titular, String agencia, String conta) {
		this.titular = titular;
		this.setAgencia(agencia);
		this.setConta(conta);
	}
	
	public String GetTitular() {
		return this.titular;
	}
	
	public double GetSaldo() {
		return 0;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
}

