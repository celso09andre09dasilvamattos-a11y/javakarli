import java.util.Scanner;

public class exer5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int codigo;
		System.out.print("digite o código do produto: ");
		codigo = entrada.nextInt();
		switch (codigo) {
			case 1:
				System.out.print("Boné R$50,00");
			break;
			case 2:
				System.out.print("Calça R$80,00");
			break;
			case 3:
				System.out.print("Tênis R$150,00");
			break;
			default:
				System.out.print("Produto não encontrado");
		}
	}
}