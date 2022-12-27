package array;

public class TwoDimensionArray {

	public static void main(String[] args) {
		int[][] arr;
		arr = new int[][] {{1, 2, 3}, {4, 5, 6}};
		
		
		System.err.println(arr.length);
		System.out.println(arr[0].length);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]); // 0,0 ~ 0,2
			}
			System.out.println();
		}
		
		char[][] alphabets = new char[13][2];
		
	}

}
