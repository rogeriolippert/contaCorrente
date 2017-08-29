package test.br.com.contaCorrente.www;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteConta {

private Conta conta;
	
	@Before
	public void before() {
		conta = new Conta("Marcelo", "2-2", "123-4");
	}

	@Test
	public void test() {
		assertEquals(conta.GetTitular(), "Rogerio");
		assertEquals(conta.GetSaldo(), 0, 0);
	}

}

}
