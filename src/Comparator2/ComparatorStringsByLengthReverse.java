package Comparator2;

import java.util.Comparator;

public class ComparatorStringsByLengthReverse
implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		int size1 = s1.length();
		int size2 = s2.length();
		return Integer.compare(size2, size1);
	}

}
