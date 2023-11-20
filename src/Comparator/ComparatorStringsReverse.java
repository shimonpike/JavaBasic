import java.util.Comparator;

public class ComparatorStringsReverse 
            implements Comparator<String>{

	@Override      //         i          i+1
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);
	}
}
/*
 * 
         i       i+1 
         0       1       2  3  4  5  6   
      ["kiwi"]["apple"][1][9][5][3][6]
          temp[]
     if i > i+1 return  > 0 
     if i+1 > i return < 0
     if i == i+1 return 0
      


*/