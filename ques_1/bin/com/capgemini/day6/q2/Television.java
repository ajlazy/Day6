package com.capgemini.day6.q2;

import java.util.Objects;

public class Television {
	String comapny;
	String type;
	boolean _3Denabled;
	int price;
	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Television(String comapny, String type, boolean _3Denabled,int price) {
		super();
		this.comapny = comapny;
		this.type = type;
		this._3Denabled = _3Denabled;
		this.price=price;
	}
	public String getComapny() {
		return comapny;
	}
	public void setComapny(String comapny) {
		this.comapny = comapny;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean is_3Denabled() {
		return _3Denabled;
	}
	public void set_3Denabled(boolean _3Denabled) {
		this._3Denabled = _3Denabled;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
    public boolean equals(Object obj)
    {
		if(this==obj)
			return true;
		if(this.getClass()!=obj.getClass())
			return false;
		Television t2=(Television)obj;
		return(t2.comapny==this.comapny)&&(t2.price==this.price)&&(t2.type==this.type);
		
		
			
    }
	@Override
	public int hashCode() {
		return Objects.hash(comapny,type,price);
		
		
	}
	@Override
	public String toString() {
		return "Television [comapny=" + comapny + ", type=" + type + ", _3Denabled=" + _3Denabled + ", price=" + price
				+ "]";
	}
	

}
