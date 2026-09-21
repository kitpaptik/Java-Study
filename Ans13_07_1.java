import java.util.*;

public class Ans13_07_1{
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();	//Ans13_07 ArrayList 생성
		List<String> list2 = new LinkedList<String>();	//Ans13_07 LinkedList 생성
		
		long startTime;
		long endTime;

		startTime = System.nanoTime();			//Ans13_07 
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));	//Ans13_07 
			//list2.add(String.valueOf(i));  	//ArrayList가 더 빠른 결과
		}
		endTime = System.nanoTime();			//Ans13_07 
		System.out.println("LinkedList 걸린시간: " + (endTime-startTime) + " ns"); //Ans13_07 
		
		startTime = System.nanoTime();			//Ans13_07 
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));	//Ans13_07 
			//list1.add(String.valueOf(i));		//Ans13_07 ArrayList가 더 빠른 결과가 나오게 수정하려면? 끝에서부터 순차적으로 추가
		}
		endTime = System.nanoTime();			//Ans13_07 
		System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + " ns"); //Ans13_07 
	}
}