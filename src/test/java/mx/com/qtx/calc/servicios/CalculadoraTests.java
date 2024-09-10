package mx.com.qtx.calc.servicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculadoraTests {

	@Test
	void testSumar() {
		// Dados
		int num1 = 1500;
		int num2 = 1500;
		
		// Cuando
		Calculadora miMaizoro = new Calculadora();
		int suma = miMaizoro.sumar(num1, num2);
		//Entonces
		assertEquals(3000, suma, "No coincidieron el valor esperado y obtenido");
	}

	@Test
	void testRestar() {
		// Dados
		int num1 = 1500;
		int num2 = 1500;
		
		// Cuando
		Calculadora miMaizoro = new Calculadora();
		int diferencia = miMaizoro.restar(num1, num2);
		//Entonces
		assertEquals(0, diferencia, "No coincidieron el valor esperado y obtenido");
	}

	@Test
	void testMultiplicar() {
		// Dados
		int num1 = 1500;
		int num2 = 2;
		
		// Cuando
		Calculadora miMaizoro = new Calculadora();
		int producto = miMaizoro.multiplicar(num1, num2);
		//Entonces
		assertEquals(3000, producto, "No coincidieron el valor esperado y obtenido");
	}

}
