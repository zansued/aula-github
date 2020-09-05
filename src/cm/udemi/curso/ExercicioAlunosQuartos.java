package cm.udemi.curso;

import java.util.Locale;
import java.util.Scanner;
import entidades.Aluno;

public class ExercicioAlunosQuartos {

	private static Scanner entrada;
	private static Aluno aluno;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		entrada = new Scanner(System.in);

		System.out.println("Digite a quantidade de quartos");
		int qtdQuartos = entrada.nextInt();

		Aluno[] quartoDoAluno = new Aluno[qtdQuartos];

		System.out.println("Quantos quartos deseja alugar: ");
		int alugar = entrada.nextInt();

		for (int i = 0; i < alugar; i++) {
			System.out.println("Nome do Aluno:");
			entrada.nextLine();
			String nome = entrada.nextLine();

			System.out.println("Email:");
			String email = entrada.nextLine();
			aluno = new Aluno(nome, email);

			System.out.println("Qual o número do quarto:");
			int numeroDoQuarto = entrada.nextInt();
			quartoDoAluno[numeroDoQuarto] = aluno;
		}

		for (int i = 0; i < quartoDoAluno.length; i++) {
			if (quartoDoAluno[i] != null) {
				System.out.printf("===%nQuarto alugado: #%d%n" + "Nome do Aluno: %s%n" + "Email do Aluno: %s%n===%n", i,
						quartoDoAluno[i].getName(), quartoDoAluno[i].getEmail());
			}
		}
	}
}
