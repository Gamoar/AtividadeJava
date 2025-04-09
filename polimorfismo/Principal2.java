package polimorfismo;

public class Principal2 {

	public static void main(String[] args) {
		MeioPeriodo meioperiodo = new MeioPeriodo();
		meioperiodo.calcularSalario();
		
		TempoIntegral tempointegral = new TempoIntegral();
		tempointegral.calcularSalario();
		
		Contratados contratados = new Contratados();
		contratados.calcularSalario();
	}
}
