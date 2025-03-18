import java.util.Scanner;

public class calculadora_simples{

	public static void main(String[] args) {
		
		Scanner scanners = new Scanner(System.in);
		
		System.out.println("Informe o primeiro Valor que deseja usar: ");
		int valor1 = scanners.nextInt();
		
		System.out.println("Informe o tipo de Operação deseja usar:\n(1)Adição \n(2)Subtração \n(3)Multiplicação \n(4)Divisão ");
		int valor2 = scanners.nextInt();
		
		System.out.println("Informe o segundo Valor que deseja usar: ");
		int valor3 = scanners.nextInt();
		
		switch(valor2) {
		case 1:
			int resultado = (valor1)+(valor3);
			System.out.println(valor1+" + "+valor3+" = "+resultado);
			break;
		case 2:
			int resultado1 = (valor1)-(valor3);
			System.out.println(valor1+" - "+valor3+" = "+resultado1);
			break;
		case 3:
			int resultado2 = (valor1)*(valor3);
			System.out.println(valor1+" X "+valor3+" = "+resultado2);
			break;
		case 4:
			double resultado3 = ((double)valor1)/((double)valor3);
			System.out.println(valor1+" / "+valor3+" = "+String.format("%.2f",resultado3));
			break;
		}
				
		}
		
	}
