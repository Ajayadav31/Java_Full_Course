package advanceJava;
import java.util.ArrayDeque;

public class ArrayDequeClas {
	public static void main(String[] args) {
		ArrayDeque<Integer> d1 = new ArrayDeque<>();//16 capacity
		ArrayDeque<Integer> d2 = new ArrayDeque<>(10);//Constructor in which you can initialize capacity of ArrayDeque
		
		d1.add(1);
		d1.add(2);
		d1.add(3);
		d1.add(4);
		
	/*	for(int item : d1) {
			System.out.println(item);
		}
	*/
		d1.addFirst(0);
		d1.addLast(5);
		
		for(int item : d1) {
			System.out.println(item);
		}
		
		System.out.println(d1.size());
	//	System.out.println(d1.contains(0));
		System.out.println(d1.offerFirst(0));
		System.out.println(d1.offerLast(7));
		System.out.println(d1.offer(100));
		for(int item : d1) {
			System.out.println(item);
		}
	}

}
