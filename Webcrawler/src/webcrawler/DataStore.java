package webcrawler;

import java.util.ArrayList;

public class DataStore {
	
	public ArrayList<String> data;
	public ArrayList<Integer> number;
	
	public DataStore(){
		data = new ArrayList<String>(0);
		number = new ArrayList<Integer>(0);
	}

	public void add(String str){
		if(data.contains(str)){
			number.set(data.indexOf(str), (number.get(data.indexOf(str)) + 1));
		}
		else{
			data.add(str);
			number.add(1);
		}
		sort();
	}
	
	public void sort(){
		for(int x = 1; x < number.size(); x++){
			boolean placed = false;
			int count = x;
			while(placed != true){
				if(count == 0){
					number.add(0, number.get(x));
					number.remove(x+1);
					data.add(0, data.get(x));
					data.remove(x+1);
					placed = true;
				}
				else if(number.get(count-1) > number.get(x)){
					number.add(count, number.get(x));
					number.remove(x+1);
					data.add(count, data.get(x));
					data.remove(x+1);
					placed = true;
				}
				else count--;
			}
		}
	}
	
	public int getOccurences(int index){
		return number.get(index);
	}
	
	public int getOccurences(String data){
		return number.get(data.indexOf(data));
	}
	
	public String getData(int index){
		return data.get(index);
	}
	
	public void print(){
		for(int x= 0; x < data.size(); x++) {
			System.out.println(data.get(x) + " - Occurrences: " + number.get(x));
		}
		System.out.println();
	}
}
