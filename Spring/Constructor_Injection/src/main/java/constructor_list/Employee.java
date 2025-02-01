package constructor_list;

import java.util.List;

public class Employee {

	private int id;
	private String name;
	private double sal;
	private int age;
	private List<String> dept;

	public Employee(int id, String name, double sal, int age, List<String> dept) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.age = age;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", age=" + age + ", dept=" + dept + "]";
	}

}
