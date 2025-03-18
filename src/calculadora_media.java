import java.util.Scanner;

public class calculadora_media {

		public static void main(String[] args) {
			Scanner scanners = new Scanner(System.in);
				
			System.out.println("Informe a primeira nota : ");
			float nota1 = scanners.nextFloat();
				
			System.out.println("Informe a segunda nota : ");
			float nota2 = scanners.nextFloat();
				
			System.out.println("Informe a terceira nota: ");
			float nota3 = scanners.nextFloat();
				
				
			float media= ((nota1)+(nota2)+(nota3))/(3);
			System.out.println("A media das 3 notas é:"+String.format("%.2f",media));
			if(media>6) {
					System.out.println("Você Passou!!");
			} else {
					System.out.println("Você reprovou!!");
			}
		}
}


