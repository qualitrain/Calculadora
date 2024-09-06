package mx.com.qtx.calc.servicios;

public class Calculadora {
	public <T extends Number> double sumar(T x, T y) {
		double suma = x.doubleValue() + y.doubleValue();
		return suma;
	}

}
