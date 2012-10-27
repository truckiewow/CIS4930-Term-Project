package connections;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class BasicSiteConnect {

	//This class used for basic parsing of unsupported websites.
	
	public Document doc;
	
	public BasicSiteConnect(String url){
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
