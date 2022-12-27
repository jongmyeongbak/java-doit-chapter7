package array;

public class ArrayTest3 {
	
	public static void main(String[] args) {
		char[] alphabets = new char[52];
		char ch = 'A'; //65
		
		for (int i = 0; i < alphabets.length; i++, ch++) {
			alphabets[i] = ch;
			System.out.print(alphabets[i]);
		}
	}
}
