package connections;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class FacebookConnect {
	
	public Document doc;
	
	public FacebookConnect(String url){
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
