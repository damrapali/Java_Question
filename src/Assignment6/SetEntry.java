package Assignment6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetEntry {

	public static void main(String[] args) {
		//HashSet<Integer> hs = new HashSet<>();
		  //LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		TreeSet<Integer> hs = new TreeSet<>();
		
		hs.add(2);
		hs.add(5);
		hs.add(8);
		hs.add(3);
		hs.add(22);
		hs.add(2);
		hs.add(22);
		
		System.out.println(hs);
	}
}
