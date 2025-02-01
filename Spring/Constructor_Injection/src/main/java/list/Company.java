package list;

import java.util.List;

public class Company {

	private String cname;
	private String loc;
	private String email;
	private long phone;
	private List<String> empnames;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public List<String> getEmpnames() {
		return empnames;
	}

	public void setEmpnames(List<String> empnames) {
		this.empnames = empnames;
	}

	@Override
	public String toString() {
		return "Company [cname=" + cname + ", loc=" + loc + ", email=" + email + ", phone=" + phone + ", empnames="
				+ empnames + "]";
	}

}
