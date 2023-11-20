package Strings;

import java.util.Iterator;

public class RangeIterator 
			implements Iterator<Integer>{
	private Range rg;
	private int position;
	
	public RangeIterator(Range rng) {
		super();
		this.rg = rng;
		position = rng.getFirst();
	}
	@Override
	public boolean hasNext() {
		if(position <= rg.getLast())
			return true;
		
		return false;
	}
	@Override
	public Integer next() {
		int current = position;
		position++;
		return current;
	}

}
