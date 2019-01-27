package java8handson;

@FunctionalInterface
public interface CustomFunctionalInterface<T> {

	
	public abstract void calculate (T t);
	
	public static void main(String[] args) {
		
		System.out.println("args : "+ args);
		System.out.println("Main inside interface !");

	}
	
public static void test() {
		
		System.out.println("Static method inside interface !");

	}

}
