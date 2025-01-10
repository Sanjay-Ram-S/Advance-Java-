package com;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BankAccount {

	@Id
	private long accno;
	private String bankName;
	private String branch;
	private String ifsc;

	public long getAccno() {
		return accno;
	}

	public void setAccno(long accno) {
		this.accno = accno;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	@Override
	public String toString() {
		return "BankAccount [accno=" + accno + ", bankName=" + bankName + ", branch=" + branch + ", ifsc=" + ifsc + "]";
	}

}
