package problem_analysis;

public class InsertionSort {
	
	public void inSort(int[] arr) {
		int pointer, j, temp;
		int n = arr.length;
		for (int i=1; i<n; i++) {
			pointer = arr[i];
			j = i-1;
			while(j>-1 && arr[j]>pointer) {
				temp = arr[j+1];
				arr[j+1]= arr[j];
				arr[j] = temp;
				j--;
			}
			arr[j+1] = pointer;
		}
		printArr(arr);
	}
	
	public void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args) {
		int[] arr = {3,5,2,8,6,1,10,13};
		new InsertionSort().inSort(arr);
	}

}
