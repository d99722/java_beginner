package java_tutorials.collection;

import java.util.ArrayList;
import java.util.HashSet;
 
import java.util.Iterator;
 
public class ListSetDemo {
 
    public static void main(String[] args) {
    	
    	ArrayList <Integer> A = new ArrayList<Integer>();
    	A.add(1);
    	A.add(2);
    	A.add(3);
    	A.add(2);
    	A.add(3);
    	
    	Iterator hii = (Iterator)A.iterator();
    	while(hii.hasNext()) {
    		System.out.println(hii.next());
    	}
    	
    	
        ArrayList<String> al = new ArrayList<String>();
        al.add("one");
        al.add("two");
        al.add("two");
        al.add("three");
        al.add("three");
        al.add("five");
        System.out.println("array");
        Iterator ai = al.iterator();
        while(ai.hasNext()){
            System.out.println(ai.next());
        }
         
        HashSet<String> hs = new HashSet<String>();
        hs.add("one");
        hs.add("two");
        hs.add("two");
        hs.add("three");
        hs.add("three");
        hs.add("five");
        Iterator hi = hs.iterator();
        System.out.println("\nhashset");
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
    }
 
}