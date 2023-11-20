import java.util.Iterator;

public class RangeHalfIterator 
implements Iterator<Double>{
	private Range rg;
	private double position;
	
	public RangeHalfIterator(Range rng) {
		super();
		this.rg = rng;
		position = rg.getFirst();
	}
	@Override
	public boolean hasNext() {
		if(position <= rg.getLast())
			return true;
		
		return false;
	}
	@Override
	public Double next() {
		double current = position;
		position += 0.5;
		return current;
	}

}
