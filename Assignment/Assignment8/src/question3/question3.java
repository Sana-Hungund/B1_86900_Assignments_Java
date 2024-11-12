package question3;

import java.util.ArrayList;
import java.util.List;

public class question3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("blue");
		list.add("red");
		list.add("green");
		list.add("purple");
		
		list.set(2, "pink");
		System.out.println(list);

	}

}
