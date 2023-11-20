package ClassInheritance;

public class Product {
	private String name;
	private double price;
	private int code;
	private String unit;
	
	public Product() {} 
	
	public Product(String name,double price,int code,
			           					String unit)
	{
		if(name != null)
			this.name = name;
		if(price > 0)
			this.price = price;
		if(code > 0)
			this.code = code;
		if(unit != null)
			this.unit = unit;
	}
		
	public void setName(String name)
	{
		if(name != null)
			this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) 
	{
		if(price >= 0)
			this.price = price;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code)
	{
		if(code > 0)
			this.code = code;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit)
	{
		if(unit != null)
			this.unit = unit;
	}

	@Override
	public String toString() {
		String s = "Name: " + name
				+"  Price: " + price
				+"  Code: " + code
				+"  Unit: " + unit;
		
		return s;
	}
	
}




