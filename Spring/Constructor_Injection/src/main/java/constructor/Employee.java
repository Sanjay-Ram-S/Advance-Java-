package constructor;

public class Employee {

	private int id;
	private String name;
	private double sal;
	private int age;
	private Manager manager;

	public Employee(int id, String name, double sal, int age, Manager manager) {
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.age = age;
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", age=" + age + ", manager=" + manager + "]";
	}

}
