package cm.udemi.curso;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o tamanho do seu vetor");
		int tamanhoVetor = entrada.nextInt();
		double soma = 0, media = 0;
		double[] vetor = new double[tamanhoVetor];
		
		System.out.println("Digite os valores");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = entrada.nextDouble();
			 soma += vetor[i];			
		}
		
		media = soma/vetor.length; 
		
		System.out.println("=====TAMANHO DO VETOR e VALORES=====");
		for (int i = 0; i < vetor.length; i++) {
		System.out.printf("Posição[%d] - valor: %.2f%n", i, vetor[i]);
		}
		System.out.println();
		System.out.printf("Soma Valores: %.2f %n", soma);
		System.out.printf("Média dos Valores: %.2f %n", media);
		entrada.close();
	}
}
