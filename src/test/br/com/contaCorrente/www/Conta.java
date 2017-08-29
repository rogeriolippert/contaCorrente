package test.br.com.contaCorrente.www;

import static org.junit.Assert.*;

import org.junit.Test;

public class Conta {

private Conta conta;
	
	@Before
	public void before() {
		conta = new Conta("Rogerio", "3-3", "225-6");
	}

	@Test
	public void test() {
		assertEquals(conta.GetTitular(), "Rogerio");
		assertEquals(conta.GetSaldo(), 0, 0);
	}

}
