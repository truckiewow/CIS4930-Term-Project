package connections;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class LinkedInConnect {

	public Document doc;
	
	public LinkedInConnect(String url){
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}