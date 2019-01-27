package designpatterns.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
	
	List<Page> pages = new ArrayList<>();
	
	Website(){
		createWebsite();
	}
	
	public abstract void createWebsite() ;

	public List<Page> getPages() {
		return pages;
	}

}
