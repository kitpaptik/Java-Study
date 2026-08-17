public class Ans13_03 {
	public static void main(String args[]) {
		Integer[] iArray = { 10, 20, 30, 40, 50 };	
		Double[] dArray = { 1.1, 1.2, 1.3, 1.4, 1.5 };	
		Character[] cArray = { 'K', 'O', 'R', 'E', 'A' };	

		printArray(iArray);
		printArray(dArray);
		printArray(cArray);
	}
	
	//정수, 실수, 문자 배열을 모두 출력할 수 있는 제네릭 메소드 printArray()를 정의
	public static <T> void printArray(T[] array) {
        for (Object element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}