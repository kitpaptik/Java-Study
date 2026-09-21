import java.util.*;
public class Ans13_09 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();	
		
        list.add("하나");
        list.add("둘");
        list.add("셋");
        list.add("넷");
		
        String s;
        Iterator e = list.iterator();			
        while(e.hasNext()) {			
            s = (String)e.next();					//반복자는 object 타입을 반환
            System.out.println(s);
        }
		e.remove();
        //...				
		System.out.println();
        
		e = list.iterator();
        while(e.hasNext()) {	
            s = (String)e.next();				//반복자는 object 타입을 반환
            System.out.println(s);
        }
    }
}