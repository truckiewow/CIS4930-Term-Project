package connections;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import webcrawler.DataStore;

public class BasicSiteConnect {

	//This class used for basic parsing of unsupported websites.
	
	public Document doc;
	public String url;
	public DataStore urls = new DataStore();
	public DataStore locations = new DataStore();
	public ArrayList<String> states = new ArrayList<String>();
	public DataStore emails = new DataStore();
	
	public BasicSiteConnect(String url) throws IOException{
		doc = Jsoup.connect(url).get();
		this.url = url;
		states.add("Alabama");
		states.add("Alaska");
		states.add("Arizona");
		states.add("Arkansas");
		states.add("California");
		states.add("Colorado");
		states.add("Connecticut");
		states.add("Delaware");
		states.add("Florida");
		states.add("Georgia");
		states.add("Hawaii");
		states.add("Idaho");
		states.add("Illinois");
		states.add("Indiana");
		states.add("Iowa");
		states.add("Kansas");
		states.add("Kentucky");
		states.add("Louisiana");
		states.add("Maine");
		states.add("Maryland");
		states.add("Massachusetts");
		states.add("Michigan");
		states.add("Minnesota");
		states.add("Mississippi");
		states.add("Missouri");
		states.add("Montana");
		states.add("Nebraska");
		states.add("Nevada");
		states.add("New Hampshire");
		states.add("New Jersey");
		states.add("New Mexico");
		states.add("New York");
		states.add("North Carolina");
		states.add("North Dakota");
		states.add("Ohio");
		states.add("Oklahoma");
		states.add("Oregon");
		states.add("Pennsylvania");
		states.add("Rhode Island");
		states.add("South Carolina");
		states.add("South Dakota");
		states.add("Tennessee");
		states.add("Texas");
		states.add("Utah");
		states.add("Vermont");
		states.add("Virginia");
		states.add("Washington");
		states.add("West Virginia");
		states.add("Wisconsin");
		states.add("Wyoming");
		
		
	}
	
	public void URLFetch(){
		Elements list = doc.select("a[href]");
		for(Element element : list){
			if(element.attr("href").substring(0,1).compareTo("h") != 0){
				urls.add(url + element.attr("href").substring(1));
			}
			else urls.add(element.attr("href"));
		}
	}
	
	public void locationFetch(){
		for(String state : states){
			Elements list = doc.select("*:containsOwn(" + state + ")");
			for(Element element : list){
				locations.add(state);
			}
		}
		
	}
	
	//Produces lots of false-positives
	public void emailFetch(){
		Elements list = doc.select("*:containsOwn(@)");
		for(Element element : list){
			emails.add(element.text());
		}	
	}
	
	//Method passes DataStore?
	public void genericFetch(String str){
		Elements list = doc.select("*:containsOwn(" + str + ")");
	}
	
	public void fetchAll(){
		this.URLFetch();
		this.locationFetch();
		this.emailFetch();
	}
	
	public String containsVerifiedData(String username, String firstname, String lastname, String location, String email){
		String result = null;
		Elements check1 = doc.select("*:contains(" + username + ")");
		Elements check2 = doc.select("*:contains(" + firstname + ")");
		Elements check3 = doc.select("*:contains(" + lastname + ")");
		Elements check4 = doc.select("*:contains(" + location + ")");
		Elements check5 = doc.select("*:contains(" + email + ")");
		if(!check1.isEmpty()) result += " Username";
		if(!check2.isEmpty()) result += " First Name";
		if(!check3.isEmpty()) result += " Last Name";
		if(!check4.isEmpty()) result += " Location";
		if(!check5.isEmpty()) result += " Email";
		return result;
	}
}
