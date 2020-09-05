package cm.udemi.curso;

import java.util.Locale;
import java.util.Scanner;

import entidades.Account;

public class Main {

	private static Scanner entrada;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		entrada = new Scanner(System.in);

		System.out.println("Account Number:");
		int number = entrada.nextInt();
		System.out.println("Nome: ");
		entrada.nextLine();
		String holder = entrada.nextLine();

		System.out.println("Is there a initial deposit(y/n): ");
		char response = entrada.next().charAt(0);

		double initialDeposit = 0.00;
		Account conta = new Account(number, holder, initialDeposit);

		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			initialDeposit = entrada.nextDouble();
		} else if (response == 'n') {
			System.out.println("Enter a deposit value: ");
			double depositValue = entrada.nextDouble();
			conta.deposit(depositValue);
			System.out.println("Updated account data: ");
			System.out.println(conta.toString());

			System.out.println();

			System.out.println("Enter a withdraw value: ");
			double withdrawValue = entrada.nextDouble();
			conta.withdraw(withdrawValue);
			System.out.println("Updated account data: ");
			System.out.println(conta.toString());

		} else
			System.out.println("Entrada inválida");

		entrada.close();
	}

}
