package binarySearch;

public class FindingEotationCount {
	public static void main(String[] args) {
		int[] arr = {15,18,19,20,21,22,2,3,6,12};
		int pivot = findPivot(arr);
		System.out.println(findCount(pivot));
	}
	static int findCount(int pivot) {
/*		int count = 0;
			do {
			if(pivot-1>=0&&arr[pivot]>arr[pivot-1]) {
				count++;
				pivot--;
			}
			else {
				count++;
				break;
				}
			}while(pivot>=0);
		return count;
*/
		return pivot+1;
	}

	 static int findPivot(int[] arr) {
	        int start = 0;
	        int end = arr.length - 1;
	        while (start <= end) {
	            int mid = start + (end - start) / 2;
	            // 4 cases over here
	            if (mid < end && arr[mid] > arr[mid + 1]) {
	                return mid;
	            }
	            if (mid > start && arr[mid] < arr[mid - 1]) {
	                return mid-1;
	            }
	            if (arr[mid] <= arr[start]) {
	                end = mid - 1;
	            } else {
	                start = mid + 1;
	            }
	        }
	        return -1;
	    }
}
