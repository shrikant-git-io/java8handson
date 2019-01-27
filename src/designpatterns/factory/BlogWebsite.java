package designpatterns.factory;

public class BlogWebsite extends Website{

	@Override
	public void createWebsite() {
		pages.add(new BlogPage());
		
	}

}
