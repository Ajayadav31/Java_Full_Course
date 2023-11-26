package ch1_1Darray;
import java.util.*;
//WAP to accept values from the user in 1D array of 10 elements. 
//now display the sum of all even and odd and average of all elements of the array

public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int evensum = 0,oddsum = 0;
		float n =0,n1 = 0;
		for(int i = 0;i<10;i++) {
			System.out.println("Enter value of index "+i+" : ");
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) {
				evensum = evensum + arr[i];
				n++;
			}
			else {
				oddsum = oddsum + arr[i];
				n1++;
			}
		}
		System.out.println("Sum of even nos : "+evensum);
		System.out.println("Sum of odd nos : "+oddsum);
		System.out.println("Avg of even nos : "+evensum/n);
		System.out.println("Avg of odd nos : "+oddsum/n1);
	}
}
