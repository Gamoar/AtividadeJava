import java.util.Scanner;

public class calculadora_imc {

	public static void main(String[] args) {
		Scanner scanners = new Scanner(System.in);
		
		System.out.println("Informe a sua Altura em M :");
		double altura = scanners.nextDouble();
		
		System.out.println("Informe o seu peso em Kg:");
		double peso = scanners.nextDouble();
		
		double imc = (peso)/(altura*altura);
		
		if(imc<18.5){		
			System.out.println("Abaixo do Peso");
		}else if(imc<24.9){
			System.out.println("Peso Normal");
		}else if(imc<29.9){
			System.out.println("Sobrepeso");
		}else if(imc<34.9){
			System.out.println("Obesidade Grau I");
		}else if(imc<39.9){
			System.out.println("Obesidade Grau II");
		}else {
			System.out.println("Obesidade grrau III");
		}
	
	}

}
