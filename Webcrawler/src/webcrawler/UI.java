package webcrawler;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class UI {

	// Purpose of this class is to take input from user and provide organized output
	

	public static void main(String[] args) {
		
		Filter filter = new Filter();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter verified data of each type. If no data is possessed for a given type, enter \"null\".");
		String username_verified = null;
		String firstname_verified = null;
		String lastname_verified = null;
		String location_verified = null;
		String email_verified = null;
		String temp = null;
/*		
		System.out.print("Username: ");
		try{
			temp = scanner.next();
			if(temp.compareTo("null") == 0);
			else username_verified = temp;
		}
		catch(NoSuchElementException e){
			
		}
		System.out.print("First Name: ");
		try{
			temp = scanner.next();
			if(temp.compareTo("null") == 0);
			else firstname_verified = temp;
		}
		catch(NoSuchElementException e){
			
		}
		System.out.print("Last Name: ");
		try{
			temp = scanner.next();
			if(temp.compareTo("null") == 0);
			else lastname_verified = temp;
		}
		catch(NoSuchElementException e){
			
		}
		System.out.print("Location(State): ");
		try{
			temp = scanner.next();
			if(temp.compareTo("null") == 0);
			else location_verified = temp;
		}
		catch(NoSuchElementException e){
			
		}
		System.out.print("Email: ");
		try{
			temp = scanner.next();
			if(temp.compareTo("null") == 0);
			else email_verified = temp;
		}
		catch(NoSuchElementException e){
			
		}
		System.out.println();
*/
		scanner.close();

/*
		DataCruncher dataCruncher = new DataCruncher(username_verified, firstname_verified, lastname_verified, location_verified, email_verified);
		String url = "http://www.facebook.com/" + dataCruncher.getUsernames(0);
		//Michael Testing date filter
		System.out.println(url);
		String numtest = "10/08/1990 : " + filter.dates("10/08/1990") + "\n10/8/90 : " + filter.dates("10/8/90") + "\n8/10/90 : " + filter.dates("8/10/90") + "\n90/10/8 : " + filter.dates("90/10/8");
		System.out.println(numtest);
		String wordtest = "10 October, 1990 : " + filter.written("10 October, 1990") + "\n1 jan. 90 : " + filter.written("1 jan. 90");
		System.out.println(wordtest);
*/

		
		DataCruncher d = new DataCruncher(username_verified, firstname_verified, lastname_verified, location_verified, email_verified);
		d.start(1, "http://www.google.com/search?q=lol+fred");

		System.out.println();
		d.urls_MAIN.print(5);
		d.locations_MAIN.print(5);
		d.emails_MAIN.print(5);
		

	}

}
