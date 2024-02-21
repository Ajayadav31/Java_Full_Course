package binarySearch;

public class Ceilling {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,7,8};
		int target = 5;
		int ans = ceillingOfNumber(arr, target);
		System.out.println(ans);
	}
		
	static int ceillingOfNumber(int[] arr,int target) {
		int start=0;
		int end = arr.length-1;
		int mid=0;
		while(start<=end) {
			mid = start+(end-start)/2;
			if(target==arr[mid])
				return arr[mid];
			else if(target<arr[mid])
					end = mid-1;
			else if(target>arr[mid])
				start=mid+1;
		}
		return arr[start];
	//	return arr[mid];   //this we also give same output
	}
}
