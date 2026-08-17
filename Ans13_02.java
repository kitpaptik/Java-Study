class OrderedPair<T, T1> {
    private T key;		//필드
    private T1 value;		//필드
    
	OrderedPair(T key, T1 value){
		this.key = key;
		this.value = value;
	}
	
	public T getKey(){return this.key;}
	public T1 getValue(){return this.value;}
}

public class Ans13_02 {
	public static void main(String[] args) {
		OrderedPair<String, Integer> p1 = 
			new OrderedPair<String, Integer>("mykey", 12345678);
		OrderedPair<String, String> p2 = 
			new OrderedPair<String, String>("java", "a programming laguage");
		System.out.println(p1.getKey() + " " + p1.getValue());
		System.out.println(p2.getKey() + " " + p2.getValue());
	}
}