package java8handson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class ComparatorLambda extends Main {

	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<>();
		stringList.add("1");
		stringList.add("100");
		stringList.add("10");
		
		
		// without lambda expression
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length() ,o2.length());
			}
		};
		Collections.sort(stringList, comparator);
		stringList.forEach(s -> System.out.println("Without lambda :: "+s));
		stringList.forEach(System.out :: println);
		// With lambda expression
		comparator = (String o1, String o2) -> Integer.compare(o2.length() ,o1.length());
		Collections.sort(stringList, comparator);
		stringList.forEach(s -> System.out.println("With lambda :: "+s));
		
		
		
		
		//Method references
		BinaryOperator<Integer> i = (i1,i2) -> Integer.sum(i1, i2);
		System.out.println("Without method ref :: "+i.apply(1, 3));
		BinaryOperator<Integer> j = Integer::sum;
		System.out.println("With method ref :: "+j.apply(1, 3));
		
		
		
 
	}

}
