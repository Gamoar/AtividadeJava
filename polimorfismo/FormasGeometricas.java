package polimorfismo;

public class FormasGeometricas {
	double calcularArea(double r) {
		return Math.PI * Math.pow(r, 2);
	}
	
	int calcularArea(int l) {
		return l*l;
	}
	
	int calcularArea(int b ,int h) {
		return (b*h)/2;
	}
}
