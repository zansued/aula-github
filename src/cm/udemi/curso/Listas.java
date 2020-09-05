package cm.udemi.curso;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.Funcionario;

public class Listas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Funcionario> funcionarios = new ArrayList<Funcionario>();

		Funcionario joao = new Funcionario(0, "João", 110.00);
		Funcionario maria = new Funcionario(1, "Maria", 110.00);
		Funcionario macaco = new Funcionario(4, "Macaco", 11000.50);
		funcionarios.add(joao);
		funcionarios.add(maria);
		funcionarios.add(macaco);

		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario.toString());
		}
		System.out.println("========AUMENTO DE SALARIO==========");
		joao.increaseSalary(50);
		macaco.aumentarSalario();
		System.out.println(joao.toString());
		System.out.println(macaco.toString());
	}
}
