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

	public <T extends Number> double dividir(T x, T y) {
		double division = x.doubleValue() / y.doubleValue();
		return division;
	}
	
	public double sumar(int...nums) { //Christofer
		 double sum = 0;
	        for (int num : nums) {
	            sum += num;
	        }	        
	        return sum;
	}
	
	public double raizCuadrada(double num) { //Vicente
		return 0;
	}
	
	public double max(double ...nums) { // Rogelio
		return 0;
	}
	
	public double multiplicar(int...nums) { // Ramón
		return 0;
	}
	
	public double elevarA(double num, int exponente) { //Carlos
		return 0;
	}
	
	public int random() { //Alex
		return 0;
	}

}

