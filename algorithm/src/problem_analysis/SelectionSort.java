package problem_analysis;

public class SelectionSort {
	
	public void selSort(int[] arr) {
		int smallest, temp;
		for(int i=0; i<arr.length-1; i++) {
			smallest = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[smallest])
					smallest = j;
			}
			temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
		}
		printArr(arr);
	}

	public void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args) {
		int[] arr = {3,5,2,8,6,1,10,13};
		new SelectionSort().selSort(arr);
	}

}
