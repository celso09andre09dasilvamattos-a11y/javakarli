import java.util.Scanner;

public class exer3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade;
		System.out.print("Digite uma idade: ");
		idade = entrada.nextInt();
		if (idade <= 12) {
			System.out.print("Atendimento infantil");
		} else if (idade >= 13 && idade <= 59) {
			System.out.print("Atendimento adulto");
		} else if (idade >= 60) {
			System.out.print("Atendimento preferencial");
		}
	}
}