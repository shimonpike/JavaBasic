package Comparator2;

import java.util.Comparator;

public class ComparatorIntReverse 
implements Comparator<Integer>{

	@Override
	public int compare(Integer num1, Integer num2) {
		
		return Integer.compare(num2, num1);
	}

}
