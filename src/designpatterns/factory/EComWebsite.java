package designpatterns.factory;

public class EComWebsite extends Website {

	@Override
	public void createWebsite() {
		pages.add(new EComPage());
		
	}

}
