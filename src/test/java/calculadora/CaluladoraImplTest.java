package calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaluladoraImplTest {

	private Calculadora calculadora;

	@BeforeEach
	void tearUp() {
		calculadora = new CaluladoraImpl();
	}

	@Test
	void test_debe_sumar_cuando_se_utiliza_mas() {
		int resultado = calculadora.calcular(1, '+', 2);
		Assertions.assertEquals(3, resultado);
	}
        
        @Test
	void test_restar() {
		int resultado = calculadora.calcular(4, '-', 2);
		Assertions.assertEquals(2, resultado);
	}
        
        @Test
	void test_multiplicar() {
		int resultado = calculadora.calcular(5, '*', 3);
		Assertions.assertEquals(15, resultado);
	}

        @Test
	void test_dividir() {
		int resultado = calculadora.calcular(15, '/', 3);
		Assertions.assertEquals(5, resultado);
	}
        
}
