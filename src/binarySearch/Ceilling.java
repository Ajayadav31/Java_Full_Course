package binarySearch;

public class Ceilling {
	public static void main(String[] args) {
		int[] arr = {8,7,6,3,2,-3};
		int target = 5;
		int ans = ceillingOfNumber(arr, target);
		System.out.println(ans);
	}
		
	static int ceillingOfNumber(int[] arr,int target) {
		int start=0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(target==arr[mid])
				return arr[mid];
			else if(target>arr[mid])
					end = mid-1;
			else if(target<arr[mid])
				start=mid+1;
		}
		return arr[start];
	//	return arr[mid];   //this we also give same output
	}
}
