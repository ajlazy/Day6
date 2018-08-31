package cg.day_6.que4.java;

import java.util.ArrayList;

public class TreeSet implements Comparable<TreeSet> {
	private String name;
	private long rollN;
	private String branch;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRollNumber() {
		return rollN;
	}

	public void setRollNumber(long rollNumber) {
		this.rollN = rollNumber;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public TreeSet(String name, long rollNumber, String branch) {
		super();
		this.name = name;
		this.rollN = rollNumber;
		this.branch = branch;
	}

	public TreeSet() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public static void printName(ArrayList<TreeSet> name) {
		for (TreeSet names : name) {
			System.out.println(names.name+" "+names.rollN+" "+names.branch);

		}
	}
	

	@Override
	public String toString() {
		return "Names [name=" + name + ", rollNumber=" + rollN + ", branch=" + branch + "]";
	}

	@Override
	public int compareTo(TreeSet n) {
		int result=this.name.compareTo( n.name);
		if(result==0)
		return	Long.compare(this.rollN,n.rollN);
		return result;
	}
}