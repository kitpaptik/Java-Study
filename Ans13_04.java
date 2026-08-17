class MyArrayAlg {
    public static <T> void swap(T[] array , int i, int j) {
		T temp = array[i];
		array[i] = array[j];
		array[j] = temp;
    }
}

public class Ans13_04 {
	public static void main(String[] args) {
		String[] language = { "C++", "C#", "JAVA" };
		MyArrayAlg.swap(language, 1, 2); 
		for(String value : language) System.out.print(value + " ");
		System.out.println();
		
		Integer[] intary = { 10, 20, 30, 40, 50 }; 
		MyArrayAlg.swap(intary, 3, 4);
		for(  Object   value : intary)	System.out.print(value + " ");
	}
}