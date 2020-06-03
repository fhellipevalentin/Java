import java.util.Scanner;

public class aula2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Associando o objeto ao teclado no modo console
		
		
		int x;
		System.out.println("Digite um numero inteiro:");
		
		//x = sc.next(); //comando que vai permitir fazer a leitura do que for digitado pelo 'scanner'
		x = sc.nextInt(); //comando para ler apenas inteiros
		//x = sc.nextDouble(); //comando para ler apenas double
		//x = sc.next().charAt(0); //comando para ler apenas char
		//x = sc.nextLine(); //comando sc.next que aciona uma quebra de linha
		System.out.println("Você digitou: " + x);
		
		
		sc.close();
	}

}
