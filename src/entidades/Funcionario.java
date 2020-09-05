package entidades;

public class Funcionario {
	private Integer id;
	private String name;
	private Double salary;

	public Funcionario(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void aumentarSalario() {
		this.salary += this.salary * 0.01;
	}

	public void increaseSalary(double percentage) {
		this.salary += this.salary * (percentage / 100);
	}

	public String toString() {
		return String.format("ID: %d \n Nome: %s \n Salário: %.2f", getId(), getName(), getSalary());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
