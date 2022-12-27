package arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		String[][][] slist = new String[][][] {{{"ab1", "bc2"}, {"xy3", "yz4"}}, {{"ab5", "bc6"}, {"xy7", "yz8"}}};
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for (String[][] face : slist) {
			for (String[] row : face) {
				for (String s : row) {
					System.out.println(s);
				}
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
