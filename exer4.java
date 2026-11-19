import java.util.Scanner;

public class exer4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int frequencia;
		double nota;
		System.out.print("Digite a nota: ");
		nota = entrada.nextDouble();
		System.out.print("Digite a frequencia: ");
		frequencia = entrada.nextInt();
		if (nota >= 6 && frequencia >= 75) {
			if (nota >= 9 && frequencia >= 90) {
				System.out.print("Aluno destacado");
			} else {
				System.out.print("Aluno aprovado");
			}
		} else {
			if (frequencia >= 75) {
				System.out.print("Alnuo em reavaliação");
			} else {
				System.out.print("Aluno reprovado");
			}
		}
	}
}