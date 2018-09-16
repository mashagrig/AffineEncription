package encoding.affine;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class aSet {
	private static Set<Integer> set = new TreeSet<>();
	private static Set<Integer> aSet = new TreeSet<>();
	
	public static Set<Integer> aSimlpeSet(int m){
		for (int a = 2; a < m+1; a++) {
			for (int i = 2; i <m+1 ; i++) {
				if((a%i==0)&&(m%i==0)){set.add(a); }
			}
		}
		aSet.addAll(IntStream.range(2, m).boxed().collect(Collectors.toSet()));
		aSet.removeAll(set);
		return aSet;
	}
}
