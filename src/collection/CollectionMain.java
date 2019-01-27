package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionMain {

	public static void main(String[] args) {
		List<String> objects = Arrays.asList("A","B","D","C");
		objects.forEach(System.out::println);
		
		
		List<String> strings = new ArrayList<>();
		strings.add("A");
		strings.add("B");
		strings.add(null);
		strings.add(null);
		strings.forEach(System.out::println);
	}

}
