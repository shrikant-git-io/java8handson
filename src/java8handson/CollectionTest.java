package java8handson;

import java.util.ArrayList;
import java.util.List;

import java8handson.common.Person;

public class CollectionTest {
	
	public static void main (String[] args) {
		
		Person p1 = new Person();
		p1.setName("A");
		Person p2 = new Person();
		p2.setName("AA");
		Person p3 = new Person();
		p3.setName("AAA");
		
		List<Person> persons = new ArrayList<>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		
		persons.forEach(per -> System.out.println(per));
		
		
		
	}

}
