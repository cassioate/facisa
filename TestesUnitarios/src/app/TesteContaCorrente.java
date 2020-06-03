package app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteContaCorrente {
	
	private ContaCorrente conta;
	private ContaCorrente conta2;
	
	@Before
	public void setUp() throws ValorInvalidoException {
		conta = new ContaCorrente(100, 10, "Cassio");
		conta2 = new ContaCorrente(100, 11, "Jose");
		conta.depositar(1000);
	}
	
	@Test (expected=ValorInvalidoException.class)
	public void testDepositarException() throws ValorInvalidoException {
		conta.depositar(10);
		assertEquals(1010, conta.getSaldo(),0);
		conta.depositar(1000000);
		assertEquals(1001010, conta.getSaldo(),0);
		
//		Depositar um valor negativo e causar a exceção
		conta.depositar(-10);
		assertEquals(50, conta.getSaldo(),0);
		
//		Valor impossivel por causa do limite do double, teria que ser BigDecimal.
//		conta.depositar(10000000000);
//		assertEquals(10000000010, conta.getSaldo(),0);

	}
	
	@Test
	public void testDebitar() throws ValorInvalidoException{
		conta.debitar(100);
		assertEquals(900, conta.getSaldo(),0);
		conta.debitar(1000);
		assertEquals(-100, conta.getSaldo(),0);
		
		conta.depositar(1100);
		conta.debitar(1000);
		System.out.println(conta.getSaldo());
		assertEquals(0, conta.getSaldo(),0);
		
		conta.depositar(1000);
		conta.debitar(1100);
		assertEquals(-100, conta.getSaldo(),0);
		
//		Quebra (Que é realmente o que deveria acontecer), pois não existe exceção para tratar.
//		assertEquals(-101, conta.getSaldo(),0);
		
	}
	
	@Test
	public void testTransferir(){
		conta.transferir(100, conta2);
		assertEquals(900, conta.getSaldo(),0);
		assertEquals(100, conta2.getSaldo(),0);
		
//		Quebra (Que é realmente o que deveria acontecer), pois não existe exceção para tratar.
//		conta.transferir(-100, conta2);
//		assertEquals(1000, conta.getSaldo(),0);
//		assertEquals(0, conta2.getSaldo(),0);
	}
	
	@Test
	public void testVerificaRetirada(){
		assertTrue(conta.verificaRetirada(500));
		assertTrue(conta.verificaRetirada(1100));
		
//		Quebra
//		assertTrue(conta.verificaRetirada(-1));
//		assertTrue(conta.verificaRetirada(1101));
	}
	
}