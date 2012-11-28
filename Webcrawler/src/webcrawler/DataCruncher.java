package webcrawler;

import java.io.IOException;
import java.util.ArrayList;

import connections.BasicSiteConnect;


public class DataCruncher {
	
	// This class will take in data from each of the connect classes and process it, either keeping data
	// or throwing it away if unlikely. Possible statistical analysis.

//<<<<<<< HEAD
	
	//Possibly store all gathered information in arrayLists, then create methods to perform statistical analysis
	ArrayList<String> usernames;

//=======
	String username_verified = null;
	String firstname_verified = null;
	String lastname_verified = null;
	String location_verified = null;
	String email_verified = null;
	ArrayList<String> exploredURLs = new ArrayList<String>();
	DataStore urls_MAIN = new DataStore();
	DataStore locations_MAIN = new DataStore();
	DataStore emails_MAIN = new DataStore();
//>>>>>>> bf082d9957c6370451206548ac26197bcfd314fa
	
	public DataCruncher(){
		usernames = new ArrayList<String>(1);
		usernames.add("truckiewow");
	}
	
	public String getUsernames(int index) {
		return usernames.get(index);
	}

	public void start(int depth, String startURL){
		System.out.println("Working...");
		recursion(depth, startURL, null, null);
	}
	
	public void recursion(int depth, String url1, String url2, String url3){
		if(depth >= 0){
			if((url1 != null) && (!exploredURLs.contains(url1))){
				try{
					BasicSiteConnect temp1 = new BasicSiteConnect(url1);
					temp1.fetchAll();
					urls_MAIN.merge(temp1.urls);
					locations_MAIN.merge(temp1.locations);
					emails_MAIN.merge(temp1.emails);
					exploredURLs.add(url1);
					String newURL1_1;
					String newURL1_2;
					String newURL1_3;
					if(temp1.urls.data.size() >= 1){
						newURL1_1 = temp1.urls.getData(0);
					}
					else newURL1_1 = null;
					if(temp1.urls.data.size() >= 2){
						newURL1_2 = temp1.urls.getData(1);
					}
					else newURL1_2 = null;
					if(temp1.urls.data.size() >= 3){
						newURL1_3 = temp1.urls.getData(2);
					}
					else newURL1_3 = null;
					recursion(depth-1, newURL1_1, newURL1_2, newURL1_3);
				}
				catch(IOException e){
					
				}
			}
			if((url2 != null) && (!exploredURLs.contains(url2))){
				try{
					BasicSiteConnect temp2 = new BasicSiteConnect(url2);
					temp2.fetchAll();
					urls_MAIN.merge(temp2.urls);
					locations_MAIN.merge(temp2.locations);
					emails_MAIN.merge(temp2.emails);
					exploredURLs.add(url2);
					String newURL2_1;
					String newURL2_2;
					String newURL2_3;
					if(temp2.urls.data.size() >= 1){
						newURL2_1 = temp2.urls.getData(0);
					}
					else newURL2_1 = null;
					if(temp2.urls.data.size() >= 2){
						newURL2_2 = temp2.urls.getData(1);
					}
					else newURL2_2 = null;
					if(temp2.urls.data.size() >= 3){
						newURL2_3 = temp2.urls.getData(2);
					}
					else newURL2_3 = null;
					recursion(depth-1, newURL2_1, newURL2_2, newURL2_3);
				}
				catch(IOException e){
					
				}
			}
			if((url3 != null) && (!exploredURLs.contains(url3))){
				try{
					BasicSiteConnect temp3 = new BasicSiteConnect(url3);
					temp3.fetchAll();
					urls_MAIN.merge(temp3.urls);
					locations_MAIN.merge(temp3.locations);
					emails_MAIN.merge(temp3.emails);
					exploredURLs.add(url3);
					String newURL3_1;
					String newURL3_2;
					String newURL3_3;
					if(temp3.urls.data.size() >= 1){
						newURL3_1 = temp3.urls.getData(0);
					}
					else newURL3_1 = null;
					if(temp3.urls.data.size() >= 2){
						newURL3_2 = temp3.urls.getData(1);
					}
					else newURL3_2 = null;
					if(temp3.urls.data.size() >= 3){
						newURL3_3 = temp3.urls.getData(2);
					}
					else newURL3_3 = null;
					recursion(depth-1, newURL3_1, newURL3_2, newURL3_3);
				}
				catch(IOException e){
					
				}
			
		}
	}
	}
}
