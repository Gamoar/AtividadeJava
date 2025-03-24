
import java.util.Scanner;

public class Salario {

	String name;
	double salary;
	double tax;
	
	public Salario(String name, double salary, double tax) {
		this.name = name;
		this.salary = salary;
		this.tax = tax;
	}
	public double applytax() {
		return salary - tax;
	}
	public void increaseSalary(double amount) {
		salary += salary *(amount / 100);
	}
	public void showInfo() {
		System.out.println("Nome : "+name);
		System.out.println("Salário Bruto : R$"+ salary);
		System.out.println("Salário liquido : R$"+ applytax());
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nDigite seu nome: ");
        String name = scanner.nextLine();
        
        System.out.print("Digite seu salário bruto: ");
        double salary = scanner.nextDouble();
        
        System.out.print("Digite o imposto a ser descontado: ");
        double tax = scanner.nextDouble();
        
        Salario employe = new Salario(name, salary, tax);
        
        employe.showInfo();
        
        System.out.print("\nDeseja aumentar o salário? (Digite a porcentagem que deseja aumentar : ");
        double increase = scanner.nextDouble();
        
        if (increase > 0) {
            employe.increaseSalary(increase);
            System.out.println("\nApós aumento:");
            employe.showInfo();
        }
		
        scanner.close();
	}

}
