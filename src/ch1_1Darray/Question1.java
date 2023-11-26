package ch1_1Darray;

import java.util.Scanner;

//WAP to accept values from the user in 1D array of 10 elements. 
//now display the sum and average of all the elements of the array

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int sum = 0;
		for(int i = 0;i<10;i++) {
			System.out.println("Enter value of index "+i+ ":");
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("Sum is :"+sum);
		System.out.println("Average is : "+sum/10.0);
	}
}
