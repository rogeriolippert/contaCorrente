package test.br.com.contaCorrente.www;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.contaCorrente.www.Conta;

public class TesteConta {

	private Conta conta;
	
	@Before
	public void before() {
		conta = new Conta("Rogerio", "2-2", "123-4");
	}

	@Test
	public void DadosConta() {
		assertEquals("Rogerio", conta.GetTitular());
		assertEquals(0, conta.GetSaldo(), 0);
	}
	@Test
	public void DebitoConta() {
		conta.debito(600);
		assertEquals(0, conta.GetDebito(-600), 0);
	}

	@Test
	public void ContaCredito() {
		conta.credito(100);
		assertEquals(100, conta.GetCredito(100), 0);
	}


}


