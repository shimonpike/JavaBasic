package Maps;

import java.util.Comparator;

public class ComparatorCharsReverse
implements Comparator<Character>{

	@Override
	public int compare(Character c1, Character c2) {
		
		return Character.compare(c2, c1);
	}

}
