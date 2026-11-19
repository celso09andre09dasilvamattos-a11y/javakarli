import java.util.Scanner;

public class exer6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int turno, disciplina;
		System.out.print("Digite um valor inteiro para selecionar um turno");
		turno = entrada.nextInt();
		System.out.print("Digite um valor inteiro para selecionar uma disciplina");
		disciplina = entrada.nextInt();
		switch (turno) {
			case 1:
				switch (disciplina) {
					case 1:
						System.out.print("Matemática");
					break;
					case 2:
						System.out.print("Português");
					break;
					default:
						System.out.print("Disciplina não disponível no período da tarde");
				}
			break;
			case 2:
				switch (disciplina) {
					case 1:
						System.out.print("História");
					break;
					default:
						System.out.print("disciplina não disponível no período da tarde");
				}
		}
	}
}