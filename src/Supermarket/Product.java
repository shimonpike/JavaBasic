package com.tlalim.supermarket.superm;

import java.util.Objects;

public class Product 
	implements Comparable<Product>{
	private String name;
	private int code;
	private double price;
	private String unit;
		
	public Product(String name, int code,
			double price, String unit) {
		super();
		this.name = name;
		this.code = code;
		this.price = price;
		this.unit = unit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	@Override
	public String toString() {
		return "name: " + name 
				+ ", code: " + code 
				+ ", price: " + price 
				+ ", unit: " + unit;
	}
	@Override
	public int hashCode() {
		return Objects.hash(code);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return this.code == other.code;
	}
	@Override
	public int compareTo(Product other) {
	int res = 
		this.name.compareToIgnoreCase(other.name);
	if(res == 0)
		res = Integer.compare(this.code, other.code);
				
		return res;
	}
	
	
}
