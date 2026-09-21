import java.util.*;
public class Ans13_10 {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();						

        list.add("MILK");
        list.add("BREAD");
        list.add("BUTTER");
        
		list.add(1, "APPLE");
		list.add(2, "GRAPE");
		list.remove(3);
        
        for (int i = 0; i <   list.size()  ; i++)	
            System.out.println(list.get(i));	
		System.out.println();
		
		list.remove(3);
        for (String s: list)	//향상된 for ~ each 루프
            System.out.println(s);
    }
}