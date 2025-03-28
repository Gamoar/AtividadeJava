package Principal;
import java.util.Scanner;

public class EstoqueProduto {
	private String descricao; 
	private int quantidade;
	private double valor;

	public void cadastrar(String descricao, int quantidade, double valor) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	public void removerQuantidade(int valor) {
		this.quantidade -= valor; 
	}
	public void exibirEstoque() {
		System.out.println("Produto : "+this.descricao);
		System.out.println("Estoque : "+this.quantidade);
		System.out.println("Preço : R$"+this.valor);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nColoque a descrição do produto: ");
        String descricao = scanner.nextLine();
        
        System.out.print("\nColoque a quantidade em estoque: ");
        int quantidade = scanner.nextInt();
        
        System.out.print("\nColoque o preço do produto: ");
        double valor = scanner.nextDouble();
        
        EstoqueProduto produto = new EstoqueProduto();
        
        produto.cadastrar(descricao, quantidade, valor);
        
        produto.exibirEstoque();
        
        System.out.print("\nColoque a quantidade que deseja tirar do estoque: ");
        int quantidadeRemover = scanner.nextInt();
        
        produto.removerQuantidade(quantidadeRemover);
        
        produto.exibirEstoque();
        
        scanner.close();
	}
	
}
