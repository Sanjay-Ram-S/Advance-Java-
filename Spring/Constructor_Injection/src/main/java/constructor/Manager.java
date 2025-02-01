package constructor;

public class Manager {

	private int mid;
	private String name;
	private String email;

	public Manager(int mid, String name, String email) {
		this.mid = mid;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", name=" + name + ", email=" + email + "]";
	}

}
