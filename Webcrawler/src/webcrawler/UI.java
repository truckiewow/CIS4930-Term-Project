package webcrawler;

import connections.BasicSiteConnect;

public class UI {

	// Purpose of this class is to take input from user and provide organized output
	
	public static void main(String[] args) {
		
		
		DataCruncher d = new DataCruncher();
		d.fetchData("http://www.rsriv.ece.ufl.edu/");
		d.urls_MAIN.printTop5();
		d.locations_MAIN.printTop5();
		d.emails_MAIN.printTop5();
		
	}

}
