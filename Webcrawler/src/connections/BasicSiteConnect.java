package connections;

import java.io.IOException;

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
	
	public BasicSiteConnect(String url){
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.url = url;
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
}
