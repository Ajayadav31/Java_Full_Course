package advanceJava;

import java.util.HashSet;

public class Hashing {

	public static void main(String[] args) {
		HashSet<Integer> myHash = new HashSet<>(2,0.5f);
		myHash.add(1);
		myHash.add(2);
		myHash.add(3);
		myHash.add(2);
		System.out.println(myHash);

	}

}
