import java.util.List;
import java.util.Arrays;

class MyList {
	public static void printList(List<?> list){
		for(Object n : list){
			System.out.printf(n + " ");
		}
		System.out.println();
	}
}

public class Ans13_05 {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 2, 3);
		List<String> ls = Arrays.asList("one", "two", "three");
		MyList.printList(li);
		MyList.printList(ls);
	}
}