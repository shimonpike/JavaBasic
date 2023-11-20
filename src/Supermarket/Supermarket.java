package com.tlalim.supermarket.superm;

import java.util.*;

public class Supermarket {
	private String name;
	private String address;
	private TreeMap<Product,Integer> products=
						       new TreeMap<>();

	public Supermarket(String name, String address)
	{
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void addProduct(Product pr ,int quantity)
	{
		boolean isExists = products.containsKey(pr);
		if(isExists == false)
		{
			products.put(pr, quantity);
		}
		else
		{
			int current = products.get(pr);
			current += quantity;
			products.replace(pr, current);
		}
	}
	public void displayProducts()
	{
		System.out.println("Supermarket name: " + name);
		System.out.println("Address: " + this.address);
		System.out.println("\t Products:");
		Set<Product> keys = products.keySet();
		for(Product p : keys)
		{
			System.out.println(p);
			System.out.println("quantity: " 
			                   + products.get(p));
			System.out.println("------------------");
		}
		System.out.println("=======================");
	}
	public void removeProduct(int code, int quantity)
	{
		Set<Product> keys = products.keySet();
		for(Product p : keys)
		{
			if(p.getCode() == code)
			{
				int current = products.get(p);
				if(current > quantity)
				{
					current -= quantity;
				}
				else if(current <= quantity)
				{
					System.out.println("This product has only: " 
				                       + current + " in stock");
					current = 0;
					System.out.println("Current product quantity is ZERO");
				}
				products.replace(p, current);
				return;
			}
		}
		System.out.println("Code : " + code + " is wrong");
		System.out.println("please re-check the code");
	}
	public void removeProduct(int code)
	{
		Set<Product> keys = products.keySet();
		for(Product p : keys)
		{
			if(p.getCode() == code)
			{
				products.remove(p);
				System.out.println(p + "\nremoved successfully");
				return;
			}
		}
		System.out.println("Code : " + code + " is wrong");
		System.out.println("please re-check the code");
	}

}
