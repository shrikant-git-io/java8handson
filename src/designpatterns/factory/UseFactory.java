package designpatterns.factory;

public class UseFactory {

	public static void main(String[] args) {
		
		System.out.println(WebsiteFactory.createWebsite("blog").getPages());
		System.out.println(WebsiteFactory.createWebsite("eCom").getPages());

	}

}
