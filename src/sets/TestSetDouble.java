package sets;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestSetDouble {

	public static void main(String[] args) {

		HashSet<Double> set = new HashSet<>(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));
		
		afficherCollection(set);

		double max = Double.MIN_VALUE;
		for (Double double1 : set) {
			max = (max < double1) ? double1 : max;
		}
		
		System.out.println("max : " + max);

		double min = Double.MAX_VALUE;
		for (Double double1 : set) {
			min = (min > double1) ? double1 : min;
		}
		
		System.out.println("min : " + min);
		set.remove(min);
		
		System.out.println("----------------");
		afficherCollection(set);

	}
	

	public static <E> void afficherCollection(Collection<E> collection) {
		for (E e : collection) {
			System.out.println(e);
		}
	}
	

}
