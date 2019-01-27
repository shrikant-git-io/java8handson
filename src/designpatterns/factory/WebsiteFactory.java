package designpatterns.factory;

public class WebsiteFactory {
	
	public static Website createWebsite(String type) {
		
		switch (type) {
		case "blog":
			return new BlogWebsite();
		case "eCom" :
			return new EComWebsite();
		}
		
		return null;
		
	}

}
