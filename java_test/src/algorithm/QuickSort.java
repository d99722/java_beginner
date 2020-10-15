package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
	private static int exchangeCount = 0;
	private static int comparisonCount = 0;
	
	public int partition (int low, int high, int[] s) {
		int i,j;
		int pivotitem = s[low];
		j = low;
		for (i=low+1; i<=high; i++) {
			comparisonCount++;
			if(s[i]<pivotitem) {
				j++;
				int temp = s[i];
				s[i] = s[j];
				s[j] = temp;
				exchangeCount++;
			}
		}
		int temp = s[low];
		s[low] = s[j];
		s[j] = temp;
		
		return j;
	}
	
	public int partitionRandom (int low, int high, int[] s) {
		int randomNumber = (int) (Math.random()*high+1);
		int temp = s[randomNumber];
		s[randomNumber] = s[low];
		s[low] = temp;
		
		int i,j;
		int pivotitem = s[low];
		j = low;
		for (i=low+1; i<=high; i++) {
			comparisonCount++;
			if(s[i]<pivotitem) {
				j++;
				temp = s[i];
				s[i] = s[j];
				s[j] = temp;
				exchangeCount++;
			}
		}
		temp = s[low];
		s[low] = s[j];
		s[j] = temp;
		
		return j;
	}
	
	public int getMidNumber (int low, int mid, int high) {
		int[] arr = {low,mid,high};
		Arrays.sort(arr);
		return arr[1];
	}
	
	public int partitionMedian (int low, int high, int[] s) {
		int mid = (low+high)/2;
		int midValue = getMidNumber(s[low], s[mid], s[high]);
		if (midValue == s[mid]) {
			int temp = s[mid];
			s[mid] = s[low];
			s[low] = temp;
		} else if (midValue == s[high]) {
			int temp = s[high];
			s[high] = s[low];
			s[low] = temp;
		} 
		
		int i,j;
		int pivotitem = s[low];
		j = low;
		for (i=low+1; i<=high; i++) {
			comparisonCount++;
			if(s[i]<pivotitem) {
				j++;
				int temp = s[i];
				s[i] = s[j];
				s[j] = temp;
				exchangeCount++;
			}
		}
		int temp = s[low];
		s[low] = s[j];
		s[j] = temp;
		
		return j;
	}
	
	public void sort(int low, int high, int[] s) {
		if(high>low) {
			int pivotpoint = partition(low, high, s);
			sort(low,pivotpoint-1, s);
			sort(pivotpoint+1,high,s);
		}
	}
	
	public void sortMedian(int low, int high, int[] s) {
		if(high>low) {
			int pivotpoint = partitionMedian(low, high, s);
			sort(low,pivotpoint-1, s);
			sort(pivotpoint+1,high,s);
		}
	}
	
	public void sortRandom(int low, int high, int[] s) {
		if(high>low) {
			int pivotpoint = partitionRandom(low, high, s);
			sort(low,pivotpoint-1, s);
			sort(pivotpoint+1,high,s);
		}
	}
	
	public void printExCount() {
		System.out.println("Number of Exchange : "+exchangeCount);
		exchangeCount=0;
	}
	
	public void printCpCount() {
		System.out.println("Number of Comparison : "+comparisonCount);
		comparisonCount=0;
	}
	
	public static int[] randomArray(int input_size) {
		int[] arr = new int[input_size];
		for(int a=0; a<input_size; a++) {
			arr[a] = (int)(Math.random()*(input_size*10));
		}
		return arr;
	}
	
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {

//			System.out.print("Enter Input Size : ");
//			Scanner sc = new Scanner(System.in);
//			int input_size = sc.nextInt();
			int input_size = 300000000;
			int[] testArray = randomArray(input_size);
			
//			int[] testArray = {2,1,3,4};
			
//			System.out.println();
//			System.out.println("*");
//			System.out.println("Array Before/After Sort");
//			for (int number : testArray) {
//				System.out.print(number+" ");
//			}		
			
			
			long start = System.nanoTime();
			QuickSort tester = new QuickSort();
//			tester.sort(0, testArray.length-1, testArray);
//			tester.sortRandom(0, testArray.length-1, testArray);
			tester.sortMedian(0, testArray.length-1, testArray);
			long end = System.nanoTime();

//			System.out.println();
//			for (int number : testArray) {
//				System.out.print(number+" ");
//			}
//			System.out.println();
//			System.out.println();
//			System.out.println("*");
//			tester.printCpCount();
//			tester.printExCount();
			
//			System.out.println();
			System.out.println("*");
			System.out.println((i+1)+" time exp");
			System.out.println("Time (ms) : "+(double)(end-start)/1000000);	
		}
		
		
	}
}
