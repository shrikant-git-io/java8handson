package java8handson;

public interface NewInterface {
	
	//this is final, you can save the state in this
	public String instanceVariable = "default value";
	
	//nelwy added method, enhancing capacity of exisitng interface
	public default void defaultTest1() throws Exception{
		//instanceVariable = "updated value";
		
	}
	
	public default void defaultTest2() {
		
	}

	//Existing method in interface
	public  void defaultTest();

}
