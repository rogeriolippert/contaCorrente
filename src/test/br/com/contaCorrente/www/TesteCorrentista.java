package test.br.com.contaCorrente.www;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCorrentista {

	import static org.junit.Assert.*;

	import org.junit.Before;
	import org.junit.Test;

	import br.com.java.aula.Correntista;

	public class TesteCorrentista {
		private Correntista correntista;
		
		@Before
		public void before() {
			correntista = new Correntista("Rogerio", "123.123.123-12");
		}

		@Test
		public void test() {
			assertEquals(correntista.GetNome(), "Rogerio");
			assertEquals(correntista.GetCPF(), "123.123.123-12");
		}

	}