import java.util.*;
public class Ans13_10_1 {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();						

        list.add("MILK");
        list.add("BREAD");
        list.add("BUTTER");
        
		list.add(1, "APPLE");
		list.add(2, "GRAPE");
		list.remove(3);
        
		String s;
		Iterator e = list.iterator();
		while(e.hasNext()){
			s = (String)e.next();
			System.out.println(s);
		}
        /*for (int i = 0; i <   list.size()  ; i++)	
            System.out.println(list.get(i));	
		System.out.println();*/
		
		System.out.println();
		list.remove(3);
		e = list.iterator();
		while(e.hasNext()){
			s = (String)e.next();
			System.out.println(s);
		}
        /*for (String s: list)	//향상된 for ~ each 루프
            System.out.println(s);*/
    }
}