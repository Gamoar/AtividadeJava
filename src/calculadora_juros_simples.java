import java.util.Scanner;

public class calculadora_juros_simples{

	public static void main(String[] args) {
		Scanner scanners = new Scanner(System.in);
		
		System.out.println("Informe o Valor inicial que deseja : ");
		float valor = scanners.nextFloat();
		
		System.out.println("Informe a % da taxa de juros mensal : ");
		int taxa = scanners.nextInt();
		
		System.out.println("Informe o periodo em que ira durar esse processo: ");
		int meses = scanners.nextInt();
		
		
		double juros= ((valor)*(taxa)*(meses))/(100);
		System.out.println("O valor do juros é : R$"+String.format("%.2f",juros));
	}

}
