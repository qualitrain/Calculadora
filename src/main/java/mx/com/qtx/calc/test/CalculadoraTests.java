package mx.com.qtx.calc.test;

import mx.com.qtx.calc.servicios.Calculadora;

public class CalculadoraTests {

	public static void main(String[] args) {
		Calculadora miMaizoro = new Calculadora();
		int resultado = (int) miMaizoro.sumar(100, 150);
		System.out.println("Resultado suma =" + resultado);
	}

}
