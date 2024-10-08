package mx.com.qtx.calc.servicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculadoraTests {

	@Test
	void testSumar_enteros() {
		//Dados -> Datos de entrada
		int sumando1 = 100;
		int sumando2 = 50;
		
		//Cuando -> Ejecución del código a probar
		Calculadora miMaizoro = new Calculadora();
		double suma = miMaizoro.sumar(sumando1, sumando2);
		
		//Entonces -> Probar el resultado obtenido vs resultado esperado
		assertEquals(150, suma, 0.0000000001,"El valor esperado no coincide con el obtenido");
	}

	@Test
	void testSumar_dobles() {
		//Dados -> Datos de entrada
		double sumando1 = 100.00000001;
		double sumando2 =  50.00000001;
		
		//Cuando -> Ejecución del código a probar
		Calculadora miMaizoro = new Calculadora();
		double suma = miMaizoro.sumar(sumando1, sumando2);
		
		//Entonces -> Probar el resultado obtenido vs resultado esperado
		assertEquals(150.00000002, suma, 0.000000000000001,"El valor esperado no coincide con el obtenido");
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
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		
		// Cuando
		Calculadora miMaizoro = new Calculadora();
		double producto = miMaizoro.multiplicar(num1, num2, num3, num4, num5);
		//Entonces
		assertEquals(120, producto, "No coincidieron el valor esperado y obtenido");
	}
	
	@Test
	//Cris Suma
	void testsumar() {
		// Dados
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		
		// Cuando
		Calculadora miMaizoro = new Calculadora();
		double num = miMaizoro.sumar(num1, num2, num3);
		//Entonces
		assertEquals(6, num, "No coincidieron el valor esperado y obtenido");
	}
	
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

	@Test
	void testRaizCuadrada() {
		//Dados
		double raiz = 9;
		//Cuando
		Calculadora miMaizoro = new Calculadora();
		double resultado = miMaizoro.raizCuadrada(raiz);
		//Entonces
		assertEquals(3, resultado, 0.0000001, "No coinciden los valores esperado y obtenido");
}
	@Test
	void testExponerA() {
		//Dados
		double num = 2;
		int exponente = 4;
		//Cuando
		Calculadora miMaizoro = new Calculadora();
		double resultado = miMaizoro.elevarA(num, exponente);
		//Entonces

	}

}
