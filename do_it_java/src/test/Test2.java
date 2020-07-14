//package test;
//import java.util.ArrayList;
//
//class Student{
//	public int score;
//	public String name;
//	public Student(int score, String name) {
//		this.score = score;
//		this.name = name;
//	}
//	ArrayList<Student> student = new ArrayList<Student>();
//}
//
//class Sort{
//	public static void sortArray(ArrayList<Student> student,int[] before, String[] nameBefore) {
//		Student[0]
//		
//		int[] after = new int[before.length];
//		String[] nameAfter = new String[nameBefore.length];
//		
//		for (int i=0; i<before.length; i++) {
//			for(int j=0; j<after.length; j++) {
//				if(after[j]<before[i]) {
//					for(int k=4; k>j; k--) {
//						after[k]=after[k-1];
//						nameAfter[k]=nameAfter[k-1];
//					}
//					after[j]=before[i];
//					nameAfter[j]=nameBefore[i];
//					break;
//				}
//			}
//		}
//		for (int i=0; i<after.length; i++) {
//			System.out.println((i+1)+"등 : "+nameAfter[i]+" (점수 : "+after[i]+"점)");
//		}
//	}
//	
//	public static void findBest(int[] score, String[] name) {
//		int best = 0;
//		String bestName = null;
//		for(int i=0; i<score.length; i++) {
//			if(score[i]>best) {
//				best = score[i];
//				bestName = name[i];
//			}
//		}
//		System.out.println("");
//		System.out.println("***** FIRST RANK IN THE CLASS *****");
//		System.out.println(bestName+" (점수 : "+best+"점)");
//		System.out.println("***********************************");
//		System.out.println("");
//		
//	}
//	
//}
//
//public class Test2{
//	public static void main(String[] args) {
//		
//	}
//}