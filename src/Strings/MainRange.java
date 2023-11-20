package Strings;

public class MainRange {
public static void main(String[] args) {
	Range rng = new Range(-5, 10);
	RangeIterator iter = new RangeIterator(rng);
	while(iter.hasNext() == true)
	{
		System.out.print(iter.next() + " ");
	}
	System.out.println();
	RangeReverse2Iterator iter1 = 
			new RangeReverse2Iterator(rng);
	while(iter1.hasNext() == true)
	{
		System.out.print(iter1.next()+" ");
	}
	System.out.println();
	RangeHalfIterator iter2 = 
			new RangeHalfIterator(rng);
	while(iter2.hasNext() == true)
	{
		System.out.print(iter2.next() + " ");
	}
	
	
}
}
/*
  first        last
   |-------------|
   5             15
                 ^
position   
iterator 
*/