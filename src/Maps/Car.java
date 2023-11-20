package Maps;

import java.util.Objects;

public class Car implements Comparable<Car>{
	private String model;
	private double engine;
	private String regNumber;
	private String color;
	private int year;
	
	
	public Car(String model, double engine, 
			String regNumber, String color, int year) {
		super();
		this.model = model;
		this.engine = engine;
		this.regNumber = regNumber;
		this.color = color;
		this.year = year;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "model=" + model 
				+ ", engine=" + engine 
				+ ", regNumber=" + regNumber 
				+ ", color=" + color
				+ ", year=" + year;
	}
	@Override
	public int hashCode() {
		return Objects.hash(regNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(this.regNumber, other.regNumber);
	}
	@Override
	public int compareTo(Car other) {
		int res = this.model.compareToIgnoreCase(other.model);
		if(res == 0)
			res = this.regNumber.compareToIgnoreCase(other.regNumber);
		
		return res;
	}
	
	
	
}
