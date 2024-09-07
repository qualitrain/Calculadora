package mx.com.qtx.calc.servicios;

public class Calculadora {
	public <T extends Number> double sumar(T x, T y) {
		double suma = x.doubleValue() + y.doubleValue();
		return suma;
	}

	public <T extends Number> double dividir(T x, T y) {
		double division = x.doubleValue() / y.doubleValue();
		return division;
	}
	
}

