package webcrawler;

import java.util.ArrayList;

public class DataStore {
	
	ArrayList<String> data;
	ArrayList<Integer> number;
	
	public DataStore(){
		data = new ArrayList<String>(0);
		number = new ArrayList<Integer>(0);
	}

	public void add(String str){
		if(data.contains(str)){
			number.set(data.indexOf(str), number.get(data.indexOf(str) + 1));
		}
		else{
			data.add(str);
			number.add(1);
		}
		sort();
	}
	
	public void sort(){
		//sorts data from most occurences to least
	}
}
