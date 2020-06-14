
package classwork7.kryvenkosergii_lv44;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

@SuppressWarnings("unused")
public class App1 {

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> myCollection = new ArrayList<Integer>(
				Arrays.asList(4, 20, 68, 45, 56, 56, -68, 5, 5, -18, 6, 0, 78));
		ArrayList<Integer> newCollection = new ArrayList<Integer>();
		System.out.println(myCollection);
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
//		for (int i = 0; i <10; i++) {
//		System.out.println("Enter number");
//		String text = br.readLine();
//		myCollection.add(Integer.parseInt(text));
//		}
//		System.out.println(myCollection.size());

		// Find and save in list newCollection all positions of element more than 5 in
		// the collection
		for (int j = 0; j < myCollection.size(); j++) {

			if (myCollection.get(j) > 5) {
				newCollection.add(myCollection.get(j));
			}
		}
//		for (int num : newCollection) {
//			System.out.println(num);
//		}

		System.out.println(newCollection);
		// Remove from collection myCollection elements, which are greater then 20
		for (int j = 0; j < myCollection.size(); j++) {

			if (myCollection.get(j) > 20) {
				myCollection.remove(j);
				j--;
			}
		}
//		for (int num : myCollection) {
//			System.out.println(num);
//		}
		System.out.println(myCollection);

		// Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format:
		// “position – xxx, value of element – xxx”
		if (myCollection.size() > 2)
			myCollection.set(2, 1);
		if (myCollection.size() > 8)
			myCollection.set(8, -3);
		if (myCollection.size() > 5)
			myCollection.set(5, -4);
//		System.out.println(myCollection);
		for (int i = 0; i < myCollection.size(); i++) {
			System.out.println("position – " + i + ", value of element – " + myCollection.get(i));
		}

		// Sort and print collection
		Collections.sort(myCollection);
		System.out.println(myCollection);
	}

}
