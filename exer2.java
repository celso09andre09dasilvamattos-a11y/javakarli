import java.util.Scanner;

public class exer2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int frequencia;
		double media;
		System.out.print("Digite a média: ");
		media = entrada.nextDouble();
		System.out.print("Digite a frquencia: ");
		frequencia = entrada.nextInt();
		if (media >= 7 && frequencia >= 75) {
			System.out.println("Aluno aprovado");
		} else {
			System.out.println("Aluno reprovado");
		}
	}
}