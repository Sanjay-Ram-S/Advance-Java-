package constructor_set;

import java.util.Set;

public class Employee {

	private int id;
	private String name;
	private double sal;
	private int age;
	private Set<String> role;

	public Employee(int id, String name, double sal, int age, Set<String> role) {
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.age = age;
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", age=" + age + ", role=" + role + "]";
	}

}
