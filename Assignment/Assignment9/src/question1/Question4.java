package question1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Question4 {
	

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 12, 43, 55, 76, 23);

        List<Double> linkedList = new LinkedList<>();
        Collections.addAll(linkedList, 5.5, 9.8, 2.3, 8.1, 7.6);
        
        System.out.println(Collections.max(arrayList));


	}

}
