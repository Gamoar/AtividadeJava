package Principal;

import java.util.Scanner;

public class Carro {
	
	private String modelo;
	private String marca;
	private String cor;
		
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public String getMarca() {
		return marca;
	}
	public String getCor() {
		return cor;
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Para Cadastrar um carro siga as etapas abaixo");
		
		System.out.printf("\nColoque o modelo do carro : ");
		String modelo = scanner.nextLine();
		
		System.out.printf("Coloque a marca do carro : ");
		String marca = scanner.nextLine();
		
		System.out.printf("Coloque a cor do carro : ");
		String cor = scanner.nextLine();
		
		Carro registro = new Carro();
		
		registro.setModelo(modelo);
		registro.setMarca(marca);
		registro.setCor(cor);
		
		System.out.println("_________________________________");
		System.out.println("O modelo do carro é: "+registro.getModelo());
		System.out.println("A marca do carro é: "+registro.getMarca());
		System.out.println("A cor do carro é: "+registro.getCor());
		
		scanner.close();
	}

}
