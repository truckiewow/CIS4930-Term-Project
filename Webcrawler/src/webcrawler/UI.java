package webcrawler;

public class UI {

	// Purpose of this class is to take input from user and provide organized output
	
	String username_verified = null;
	String firstname_verified = null;
	String lastname_verified = null;
	String location_verified = null;
	String email_verified = null;
	
	public static void main(String[] args) {
		
//<<<<<<< HEAD
		DataCruncher dataCruncher = new DataCruncher();
		Filter filter = new Filter();
		
		System.out.println("Please enter verified data of each type. Please seperate each with a space before pressing Enter. If no data is possessed for a given type, enter null");
		System.out.println("Username, First Name, Last Name, Location(State), Email");
/*		
		String url = "http://www.facebook.com/" + dataCruncher.getUsernames(0);
		//Michael Testing date filter
		System.out.println(url);
		String numtest = "10/08/1990 : " + filter.dates("10/08/1990") + "\n10/8/90 : " + filter.dates("10/8/90") + "\n8/10/90 : " + filter.dates("8/10/90") + "\n90/10/8 : " + filter.dates("90/10/8");
		System.out.println(numtest);
		String wordtest = "10 October, 1990 : " + filter.written("10 October, 1990") + "\n1 jan. 90 : " + filter.written("1 jan. 90");
		System.out.println(wordtest);
*/
//=======
		
		DataCruncher d = new DataCruncher();
		d.start(2, "http://www.rsriv.ece.ufl.edu/");

		System.out.println();
		d.urls_MAIN.printTop5();
		d.locations_MAIN.printTop5();
		d.emails_MAIN.printTop5();
//>>>>>>> bf082d9957c6370451206548ac26197bcfd314fa
	}

}
