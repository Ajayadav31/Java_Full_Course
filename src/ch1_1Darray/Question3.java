package ch1_1Darray;
import java.util.*;

//WAP to create an array of 10 elements and accept value from the users in it.
//now search whether this no is present in the array or not. if it present then display its position other
//display the message element not found. assume that the array contains unique elements

public class Question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7,8,9};
		System.out.println("Enter VAlue : ");
		int num = sc.nextInt();
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==num) {
				System.out.println("position of value provided by you : "+i);
				break;
			}
			else {
				System.out.println("Element not Found");
				break;
			}
		}
		
	}
}
