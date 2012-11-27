package webcrawler;

public class UI {

	// Purpose of this class is to take input from user and provide organized output
	
	boolean hasBasicSiteUrls;
	boolean hasFacebookUrls;
	boolean hasLinkedInUrls;
	boolean hasUsernames;
	boolean hasEmails;
	boolean hasStates;
	
	public static void main(String[] args) {
		
		DataCruncher dataCruncher = new DataCruncher();
		Filter filter = new Filter();
		
		System.out.println("Please enter the number possessed of each data type. Please seperate each with a space before pressing Enter.");
		System.out.println("Facebook URL, LinkedIn URL, Other URL, Usernames, Emails, States");
		
		String url = "http://www.facebook.com/" + dataCruncher.getUsernames(0);
		//Michael Testing date filter
		System.out.println(url);
		String numtest = "10/08/1990 : " + filter.dates("10/08/1990") + "\n10/8/90 : " + filter.dates("10/8/90") + "\n8/10/90 : " + filter.dates("8/10/90") + "\n90/10/8 : " + filter.dates("90/10/8");
		System.out.println(numtest);
		String wordtest = "10 October, 1990 : " + filter.written("10 October, 1990") + "\n1 jan. 90 : " + filter.written("1 jan. 90");
		System.out.println(wordtest);
		
	}

}
