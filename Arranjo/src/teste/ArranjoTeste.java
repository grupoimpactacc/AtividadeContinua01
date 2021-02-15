package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArranjoTeste {

	@Test
	void test() {
		Arranjo a = new Arranjo();
		
		// Testa se 510 é menor.
		assertEquals(510, a.menor(), "O menor deve ser 510");
		
		// Testa se 940 é maior.
		assertEquals(940, a.maior(), "O maior deve ser 940");
		
		// Testa se a soma é 7450.
		assertEquals(7540, a.soma(), "A soma é 7540");
		
		// Testa a quantidade de vezes que o número 940 aparece.
		assertEquals(2, a.repeticoes(940), "940 repete 2 vezes");
		
		// Testa a quantidada de vezes que o número 790 aparece.
		assertEquals(1, a.repeticoes(790), "790 aparece 1 vez");
		
		// Testa a quantidada de vezes que o número 3 aparece.
		assertEquals(0, a.repeticoes(3), "3 não aparece nenhuma vez");
		
	}

}
