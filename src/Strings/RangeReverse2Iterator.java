import java.util.Iterator;

public class RangeReverse2Iterator 
implements Iterator<Integer>{
	private Range rg;
	private int position;
	
	public RangeReverse2Iterator(Range rng) {
		super();
		this.rg = rng;
		position = rng.getLast();
	}
	@Override
	public boolean hasNext() {
		if(position >= rg.getFirst())
			return true;
		
		return false;
	}
	@Override
	public Integer next() {
		int current = position;
		position -= 2;
		return current;
	}

}
