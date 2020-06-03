package curso_programacao;

public class Main {

	public static void main(String[] args) {
		
		String nome = "Maria";
		int idade = 31;
		double x = 10.35784;
		double renda = 4000.0;
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		
// "%.2f%n" - > padrão de formatação para delimitar casas decimais + '%n' que é para quebra de linha		

		System.out.printf("%.4f%n", x);
	    System.out.println("RESULTADO = " + x + " METROS");
	    System.out.printf("RESULTADO = " + "%.2f metros %n", x); // %.2f atribui a variável em si
	    
	    System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome,idade,renda);
	}

}
