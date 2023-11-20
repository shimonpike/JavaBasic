package ClassInheritance;

public class MeatProduct extends Product{
	private String meatType;
	
	public MeatProduct() {}
	
	public MeatProduct(String name,double price,
			      int code,String unit,String meatType)
	{
		super(name,price,code,unit);
		if(meatType != null)
			this.meatType = meatType;
	}
	public String getMeatType() {
		return meatType;
	}

	public void setMeatType(String meatType) {
		if(meatType != null)
			this.meatType = meatType;
	}

	@Override
	public String toString() {
		
		return super.toString() 
				+ "  Meat type: " + this.meatType;
	}

	

	

	
	
	
}
