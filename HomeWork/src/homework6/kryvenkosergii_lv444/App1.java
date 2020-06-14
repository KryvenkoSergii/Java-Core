package homework6.kryvenkosergii_lv444;

import java.util.HashSet;
import java.util.Set;

public class App1 {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();

		set1.add("one");
		set1.add("two");
		set1.add("three");
		set1.add("cat");
		set1.add("three");

		set2.add("cat");
		set2.add("dog");
		set2.add("snake");
		set2.add("two");
		set2.add("ant");

		System.out.println("This is a union of two sets: " + new App1().union(set1, set2));
		System.out.println("This is an intersect of two sets: " + new App1().intersect(set1, set2));

	}

	// parameterized methods union(Set set1, Set set2) realizing the operation of
	// union of two sets

	public <T> Set<T> union(Set<T> set1, Set<T> set2) {
		Set<T> union = new HashSet<T>();
		union.addAll(set1);
		union.addAll(set2);
		return union;
	}

	// parameterized methods intersect(Set set1, Set set2), realizing the operation
	// of intersection of two sets
	public <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
		Set<T> intersect = new HashSet<T>(set1);
		intersect.retainAll(set2);
		return intersect;
	}

}
