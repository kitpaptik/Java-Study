import java.util.*;

public class Ans13_07 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList<Integer>();					//ArrayList 생성
		LinkedList list2 = new LinkedList<Integer>();	//LinkedList 생성
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();										
		for(int i=0; i<10000; i++) {
			list2.add(0,i);	//LinkedList에 객체 추가	
		}
		endTime = System.nanoTime();							
		System.out.println("LinkedList 걸린시간: " + ((endTime - startTime) + " ns")); //Ans13_07 
		
		startTime = System.nanoTime();										
		for(int i=0; i<10000; i++) {
			list1.add(0, i);	//ArrayList에 객체 추가
		}
		endTime = System.nanoTime();										
		System.out.println("ArrayList 걸린시간: " + ((endTime - startTime) + " ns")); //Ans13_07 
	}
}



