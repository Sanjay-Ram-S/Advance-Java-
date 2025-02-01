package set;

import java.util.Set;

public class Employee {

	private int eid;
	private String ename;
	private double sal;
	private long phone;
	private Set<String> dept;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Set<String> getDept() {
		return dept;
	}

	public void setDept(Set<String> dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", phone=" + phone + ", dept=" + dept
				+ "]";
	}

}
