package ClassInheritance;

public class MilkProduct extends Product{
	private String milkType;
	private double fat;
	
	public MilkProduct() {}
	
	public MilkProduct(String name, double price,
			int code, String unit, 
			String milkType, double fat) {
		super(name, price, code, unit);
		if(milkType != null)
		this.milkType = milkType;
		if(fat >= 0)
		this.fat = fat;
	}

	public String getMilkType() {
		return milkType;
	}
	public void setMilkType(String milkType) {
		if(milkType != null)
			this.milkType = milkType;
	}
	public double getFat() {
		return fat;
	}
	public void setFat(double fat) {
		if(fat >= 0)
			this.fat = fat;
	}

	@Override
	public String toString() {
		
		return super.toString()
				+ "  milk type: " + this.milkType
				+ "  fat: " + fat;
	}
	
	
	
}
