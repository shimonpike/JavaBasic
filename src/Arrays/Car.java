package Arrays;

public class Car {
	//this
	private String model;
	private int year;
	private double engine;
	
	public Car() {}
	
	public Car(String model,int year,double engine)
	{
		//if(model != null)
		//	this.model = model;
		this.setModel(model);
		//if(year > 0)
		//	this.year = year;
		this.setYear(year);
		if(engine > 0)
			this.engine = engine;
	}
	public void setModel(String model)
	{
		if(model != null)
			this.model = model;
	}
	public String getModel()
	{
		return model;
	}
	public void setYear(int year)
	{
		if(year > 0)
			this.year = year;
	}
	public int getYear()
	{
		return year;
	}
	public void setEngine(double engine)
	{
		if(engine > 0)
			this.engine = engine;
	}
	public double getEngine()
	{
		return engine;
	}
	public void display()
	{
		System.out.print("Model: " + this.model);
		System.out.print("  Year: " + year);
		System.out.println("  Engine: " + this.engine);
	}
}
