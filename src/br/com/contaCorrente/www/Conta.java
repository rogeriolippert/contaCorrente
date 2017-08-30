package br.com.contaCorrente.www;

public class Conta {
	private String agencia;
	private String conta;
	private String titular;
	private double saldo;
	private double credito;
	private double debito;
	
	
	public Conta(String titular, String agencia, String conta) {
		this.titular = titular;
		this.setAgencia(agencia);
		this.setConta(conta);
		this.setSaldo(0);
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public double getCredito() {
		return credito;
	}
	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	public double getDebito() {
		return debito;
	}
	public void setDebito(double debito) {
		this.debito = debito;
	}
}

