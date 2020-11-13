package divide_and_conquer;

public class BinarySearch {
	
	private int t;
	private int[] arr;
	
	public BinarySearch(int target, int[] array) {
		t = target;
		arr = array;
		
	}
	
	public int Sort(int low, int high) {
		if (low>high)
			return 0;
		else {
			int mid = (low+high)/2;
			if(t == arr[mid]) {
				return mid;
			} else if (t < arr[mid]) {
				return Sort(low, mid-1);
			} else {
				return Sort(mid+1, high);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 3, 4, 6, 7, 9, 10};
		int target = 10;
		BinarySearch bs = new BinarySearch(target, array);
		System.out.println(array[bs.Sort(0, array.length-1)]);
	}

}
