package com.capgemini.day6.q4;

import java.util.ArrayList;

public class Names implements Comparable<Names> {
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
	

	@Override
	public String toString() {
		return "Names [name=" + name + ", rollNumber=" + rollNumber + ", branch=" + branch + "]";
	}

	@Override
	public int compareTo(Names n) {
		int result=this.name.compareTo( n.name);
		if(result==0)
		return	Long.compare(this.rollNumber,n.rollNumber);
		return result;
	}
}