package com.capgemini.day6.q2;

import java.util.Objects;

public class School {
	String name;
	String city;
	String district;
	int greatSchoolRanking;
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public School(String name, String city, String district, int greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.district = district;
		this.greatSchoolRanking = greatSchoolRanking;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}
	public void setGreatSchoolRanking(int greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		School s2=(School)obj;
		return((s2.name==this.name)&&(s2.city==this.city)&&(s2.district==this.district));
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,city,district);
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", district=" + district + ", greatSchoolRanking="
				+ greatSchoolRanking + "]";
	}
	
	

}
