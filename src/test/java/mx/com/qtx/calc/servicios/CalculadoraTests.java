package mx.com.qtx.calc.servicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculadoraTests {

	@Test
	void testDividir() {
		//Dados
		double dividendo = 500;
		double divisor = 10;
		//Cuando
		Calculadora miMaizoro = new Calculadora();
		double resultado = miMaizoro.dividir(dividendo, divisor);
		//Entonces
		assertEquals(50, resultado, 0.0000001, "No coinciden los valores esperado y obtenido");
	}

}
