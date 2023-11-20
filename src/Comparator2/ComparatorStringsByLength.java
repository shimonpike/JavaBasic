import java.util.Comparator;

public class ComparatorStringsByLength
implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		int size1 = s1.length();
		int size2 = s2.length();
		//return size1 - size2;
		return Integer.compare(size1, size2);
	}
	

}
