package ClassInheritance;

public class Drink extends Product{
	private boolean isSparkling;
	
	public Drink() {}
	
	public Drink(String name, double price,
			int code, String unit, boolean isSparkling) {
		super(name, price, code, unit);
		this.isSparkling = isSparkling;
	}

	public boolean getSparkling() {
		return isSparkling;
	}

	public void setSparkling(boolean isSparkling) {
		this.isSparkling = isSparkling;
	}

	@Override
	public String toString() {
		return super.toString()
			+ "  Is sparkling? " + isSparkling;
	}
	
	

}
