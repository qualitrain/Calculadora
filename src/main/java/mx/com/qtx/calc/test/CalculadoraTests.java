package mx.com.qtx.calc.test;

import mx.com.qtx.calc.servicios.Calculadora;

public class CalculadoraTests {

	public static void main(String[] args) {
		test_suma();
	}

	private static void test_suma() {
		Calculadora miMaizoro = new Calculadora();
		int resultado = (int) miMaizoro.sumar(100, 150);
		System.out.println("Resultado suma =" + resultado);
	}

}
