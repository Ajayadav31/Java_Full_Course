package ch1_1Darray;
import java.util.*;

public class Question4 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int arr[] = {1,2,3,4,5,6,7,8,9,2};
			System.out.println("Enter VAlue : ");
			int num = sc.nextInt();
			for(int i = 0;i<arr.length;i++) {
				if(arr[i]==num)
					System.out.println("Position of no privide by you is : " +i);
			}
			
		}
	}

