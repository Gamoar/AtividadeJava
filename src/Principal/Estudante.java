package Principal;
import java.util.Scanner;

public class Estudante {
	private String nome;
	private String cpf;
	private String curso;
	private int idade;
	
	public void cadastrar(String nome,String cpf,String curso,int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.curso = curso;
		this.idade = idade;
	}
	public void exibirCadastro() {
		System.out.println("Nome aluno : "+this.nome);
		System.out.println("CPF : "+Funcions.formatarCpf(this.cpf));
		System.out.println("Curso : "+this.curso);
		System.out.println("Idade aluno : "+this.idade);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nColoque o nome do aluno : ");
        String nome = scanner.nextLine();
        
        System.out.println("\nColoque o CPF do aluno : ");
        String cpf = scanner.nextLine();
        
        System.out.println("\nColoque o curso que o aluno pertence :");
        String curso = scanner.nextLine();
        
        System.out.println("\nColoque a idade do aluno :");
        int idade = scanner.nextInt();
        
        Estudante cadastro = new Estudante();
        
        cadastro.cadastrar(nome, cpf, curso, idade);
        
        cadastro.exibirCadastro();
        
        scanner.close();
	}

}
