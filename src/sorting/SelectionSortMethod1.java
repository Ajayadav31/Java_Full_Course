package sorting;

import java.util.Arrays;

//select largest element and swap with correct index

public class SelectionSortMethod1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,-23,-34,-70,0};
//		System.out.println(arr[maxElementIndex(arr,0,arr.length-1)]);
		SelectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void SelectionSort(int[] arr) {
		 for (int i = 0; i < arr.length; i++) {
	            // find the max item in the remaining array and swap with correct index
	            int last = arr.length - i - 1;
	            int maxIndex = maxElementIndex(arr, 0, last);
	            swap(arr, maxIndex, last);
	        }
	}
	static void swap(int[] arr,int first,int second) {
		int temp = arr[first];
		arr[first]=arr[second];
		arr[second] = temp;
	}
	static int maxElementIndex(int[] arr,int start,int end) {
		int max = start;
		for(int i = start;i<=end;i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
		}
		return max;
	}
}
