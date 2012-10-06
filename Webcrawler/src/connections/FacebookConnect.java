package connections;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class FacebookConnect {
	
	FacebookConnect(String url){
		try {
			Document doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
