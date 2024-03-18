package sorting;

import java.util.Arrays;

public class SelectionSortingMethod2 {
	public static void main(String[] args) {
		int[] arr = {5,3,4,2,1,-67,-4,-45,-45,-34,200};
//		System.out.println(minElementIndex(arr, 0, arr.length-1));
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int minIndex = minElementIndex(arr, i, arr.length-1);
            swap(arr,i, minIndex);
        }
	}
	static void swap(int[] arr,int first,int last) {
		int temp = arr[first];
		arr[first] = arr[last];
		arr[last]=temp;
		
	}
	static int minElementIndex(int[] arr,int start,int end) {
		int min = start;
		for(int i = start;i<=end;i++) {
			if(arr[min]>arr[i]) {
				min = i;
			}
		}
		return min;
	}
}
