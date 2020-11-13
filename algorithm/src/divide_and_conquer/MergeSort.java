package divide_and_conquer;

public class MergeSort {
	
	public void sort(int[] arr, int low, int high) {
		if(low<high) {
			int mid = (low+high)/2;
			sort(arr, low, mid);
			sort(arr, mid+1, high);
			merge(arr, low, mid, high);
		}
	}
	
	public void merge(int[] arr, int low, int mid, int high) {
		int i = low;
		int j = mid+1;
		int k = low;
		int[] s = new int[arr.length];
		while (i<=mid && j<=high) {
			if(arr[i]<arr[j]) {
				s[k]=arr[i];
				i++;
			} else {
				s[k]=arr[j];
				j++;
			}
			k++;
		}
		while(i<=mid)
			s[k++] = arr[i++];
		while(j<=high)
			s[k++] = arr[j++];
		for(int index = low; index<k; index++)
			arr[index] = s[index];
	}
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,5,2,6,8,5,6};
		MergeSort ms = new MergeSort();
		ms.sort(arr, 0, arr.length-1);
		printArray(arr);
	}
	
}
