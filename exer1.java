import java.util.Scanner;

public class exer1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade;
		System.out.print("Digite uma idade: ");
		idade = entrada.nextInt();
		if (idade <= 12 || idade >= 65) {
			System.out.print("Entrada gratuita");
		} else {
			System.out.print("Entrada paga");
		}
	}
}