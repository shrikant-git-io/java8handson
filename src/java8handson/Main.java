package java8handson;

import java.util.Optional;

import java8handson.common.Person;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello there !");
		
		Runnable run = new Runnable() {
			@Override
			public void run() {
				System.out.println("I am inside thread !");
			}
		};
		
		Thread th = new Thread(run);
		th.start();
		
		CustomFunctionalInterface custi = string -> System.out.println(string);
		custi.calculate("shrikant");
		CustomFunctionalInterface.test();
		
		//custi = new CustomFunctionalInterface();
		
		Optional<Person> p = Optional.of(new Person());
		
	}

}
