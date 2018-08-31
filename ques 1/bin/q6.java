package cg.day_6.que3.java;

import java.util.ArrayList;
import java.util.Iterator;

public class Names {
	private String name;
	private long rollNumber;
	private String branch;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(long rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Names(String name, long rollNumber, String branch) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.branch = branch;
	}

	public Names() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public static void printName(ArrayList<Names> name) {
		for (Names names : name) {
			System.out.println(names.name+" "+names.rollNumber+" "+names.branch);

		}
	}
}
