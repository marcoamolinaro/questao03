package br.sysmanager.com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.sysmanager.com.Questao3;

public class Questao03Test {

	@Test
	public void testCalcular_numero_amstrong() {
		long expected = 153;
		long actual = Questao3.calcular_numero_amstrong("153");
		assertEquals("Número é Amstrong", expected, actual);
	}

	@Test
	public void testCalcular_numero_nao_amstrong() {
		long expected = 42;
		long actual = Questao3.calcular_numero_amstrong("42");
		assertNotEquals("Número não é Amstrong", expected, actual);
	}
}
