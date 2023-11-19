package advanceJava;

import java.util.*;
public class ArrayList1 {
	public static void main(String[] args) {
		//Constructor 1
		ArrayList<Integer> Array1 = new ArrayList<>();
		Array1.add(100);
		//Constructor 2
		ArrayList<Integer> Array2 = new ArrayList<>(5);
		Array2.add(300);
		
		//Constructor 3
		Collection<Integer> My = new ArrayList<>();
		My.add(100);
		My.add(400);
		My.add(500);
		My.add(600);
		ArrayList<Integer> Array3 = new ArrayList<>(My);
	
		//Methods
		
	/*	Array1.add(0, 100);
		Array1.add(200);
	//	Array1.addAll(5, Array3);
		Array1.addAll(Array2);
		Array1.addAll(0, My);
		Array1.addAll(6, Array3);
		
		My.clear();
		for(int item : Array1) {
			System.out.println(item);
		}
	*/
		
		
	/*	Array3.clear();
		for(int item : Array3) {
			System.out.println(item);
		}
		My.clear();
		for(int item : My) {
			System.out.println(item);
		}
	*/	
		
	/*	
		System.out.println(Array1.contains(10));
		System.out.println(Array1.contains(Array3));
		System.out.println(Array1.contains(My));
	*/	
		
	//	Array2.ensureCapacity(10);
		
	//	System.out.println(Array1.equals(Array3));
		
		
	}
}
