package webcrawler;

import connections.BasicSiteConnect;

public class UI {

	// Purpose of this class is to take input from user and provide organized output
	
	boolean hasBasicSiteUrls;
	boolean hasFacebookUrls;
	boolean hasLinkedInUrls;
	boolean hasUsernames;
	boolean hasEmails;
	boolean hasStates;
	
	public static void main(String[] args) {
		
		
		System.out.println("Please enter the number possessed of each data type. Please seperate each with a space before pressing Enter.");
		System.out.println("Facebook URL, LinkedIn URL, Other URL, Usernames, Emails, States");
		
		BasicSiteConnect site = new BasicSiteConnect("http://www.ign.com");
		site.URLFetch();
		for(int x = 0; x < 15; x++){
			System.out.println(site.urls.getData(x) + " " + site.urls.getOccurences(x));
		}	
	}

}
