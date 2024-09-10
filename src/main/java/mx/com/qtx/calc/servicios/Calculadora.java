package mx.com.qtx.calc.servicios;

public class Calculadora {
	public <T extends Number> double sumar(T x, T y) {
		double suma = x.doubleValue() + y.doubleValue();
		return suma;
	}
	
	public int restar(int x, int y) {
		int resta = x - y;
		return resta;
	}
	
	public int multiplicar(int x, int y) {
		int producto = x * y;
		return producto;
	}

}
