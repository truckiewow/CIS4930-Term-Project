package webcrawler;

import connections.BasicSiteConnect;


public class DataCruncher {
	
	// This class will take in data from each of the connect classes and process it, either keeping data
	// or throwing it away if unlikely. Possible statistical analysis.

	
	DataStore urls_MAIN = new DataStore();
	DataStore locations_MAIN = new DataStore();
	DataStore emails_MAIN = new DataStore();
	
	public DataCruncher(){
		
	}
	
	public void fetchData(String url){
		System.out.println("Working...0%");
		BasicSiteConnect round1_1 = new BasicSiteConnect(url);
		round1_1.fetchAll();
		urls_MAIN.merge(round1_1.urls);
		locations_MAIN.merge(round1_1.locations);
		emails_MAIN.merge(round1_1.emails);
		System.out.println("Working...25%");
		if((round1_1.urls.data.size() >= 1) || (round1_1.url.compareToIgnoreCase(round1_1.urls.getData(0)) != 0)){
			BasicSiteConnect round2_1 = new BasicSiteConnect(round1_1.urls.getData(0));
			round2_1.fetchAll();
			urls_MAIN.merge(round2_1.urls);
			locations_MAIN.merge(round2_1.locations);
			emails_MAIN.merge(round2_1.emails);
		}
		System.out.println("Working...50%");
		if((round1_1.urls.data.size() >= 2) || (round1_1.url.compareToIgnoreCase(round1_1.urls.getData(1)) != 0)){
			BasicSiteConnect round2_2 = new BasicSiteConnect(round1_1.urls.getData(1));
			round2_2.fetchAll();
			urls_MAIN.merge(round2_2.urls);
			locations_MAIN.merge(round2_2.locations);
			emails_MAIN.merge(round2_2.emails);
		}
		System.out.println("Working...75%");
		if((round1_1.urls.data.size() >= 3) || (round1_1.url.compareToIgnoreCase(round1_1.urls.getData(2)) != 0)){
			BasicSiteConnect round2_3 = new BasicSiteConnect(round1_1.urls.getData(2));
			round2_3.fetchAll();
			urls_MAIN.merge(round2_3.urls);
			locations_MAIN.merge(round2_3.locations);
			emails_MAIN.merge(round2_3.emails);
		}
	}
	
}
