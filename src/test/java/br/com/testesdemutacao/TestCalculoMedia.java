package br.com.testesdemutacao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import br.com.testesdemutacao.CalculoMedia;

public class TestCalculoMedia {
	
	@Test
	public void testeReprovado() {
		CalculoMedia calculoMedia = new CalculoMedia(5.99,6);
		assertEquals("Reprovado",calculoMedia.getStiuacao());
	}
	
	@Test 
	public void testeAprovado() {
		CalculoMedia calculoMedia = new CalculoMedia();
		calculoMedia.setNota1(6);
		calculoMedia.setNota2(6);
		assertEquals("Aprovado",calculoMedia.getStiuacao());
	}

}
