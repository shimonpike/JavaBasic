
public class AlcoholDrink extends Drink{
	private double volume;

	public AlcoholDrink() {}
	
	
	public AlcoholDrink(String name, double price,
			int code, String unit, 
			boolean isSparkling, double volume) {
		super(name, price, code, unit, isSparkling);
		if(volume >= 0)
			this.volume = volume;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		if(volume >= 0)
			this.volume = volume;
	}
	@Override
	public String toString() {
		
		return super.toString()
				+ "  Volume: " + volume;
	}
	
	
}
