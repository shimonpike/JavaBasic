import java.util.Comparator;

public class ComparatorIntEvenOdd 
implements Comparator<Integer>{

	@Override
	public int compare(Integer num1, Integer num2) {
	    if(num1%2 == 0 && num2%2 != 0)
	    	return 1;
	    else if(num1%2 != 0 && num2%2 == 0)
	    	return -1;
	    return 0;
	}
	

}
