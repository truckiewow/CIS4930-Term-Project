package webcrawler;

import java.util.ArrayList;
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
		
		System.out.print("How many URLs? ");
		int num = scanner.nextInt();
		ArrayList<String> urls = new ArrayList<String>(num);
		for(int x = 0; x < num; x++){
			System.out.print("Enter URL: ");
			urls.add(scanner.next());
		}
		scanner.close();
		
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

		scanner.close();


//		DataCruncher dataCruncher = new DataCruncher(username_verified, firstname_verified, lastname_verified, location_verified, email_verified);
//		String url = "http://www.facebook.com/" + dataCruncher.getUsernames(0);
		//Michael Testing date filter
//		System.out.println(url);
		String numtest = "NUMBER TEST:\n10/08/1990 : " + filter.dates("10/08/1990") + "\n10/8/90 : " + filter.dates("10/8/90") + "\n8/10/90 : " + filter.dates("8/10/90") + "\n90/10/8 : " + filter.dates("90/10/8");
		System.out.println(numtest);
		String wordtest = "WRITTEN TEST:\n10 October, 1990 : " + filter.dates("10 October, 1990") + "\n1 jan. 90 : " + filter.dates("1 jan. 90");
		System.out.println(wordtest);
		String email = "EMAIL TEST:\nblahb blah@blah blah : " + filter.email("blah blah@blah blah") + "\n.. : " + filter.email("..");
		System.out.println(email);
		String names = "NAME TEST: FIRSTVALID LASTVALID\nShaniqua : " + filter.first("Shaniqua") + " " + filter.last("Shaniqua") + "\nMichael : " + filter.first("Michael") + " " + filter.last("Michael") + "\nSmith : " + filter.first("Smith") + " " + filter.last("Smith");
		System.out.println(names);
		
*/

		DataCruncher d = new DataCruncher(username_verified, firstname_verified, lastname_verified, location_verified, email_verified);
		for(int y = 0; y < urls.size(); y++){
			d.recursion(3, urls.get(y), null, null);
		}


		System.out.println("URLS :");
		d.urls_MAIN.print(5);
		System.out.println("Locations :");
		d.locations_MAIN.print(5);
		System.out.println("Emails :");
		d.emails_MAIN.print(5);
		System.out.println("First Names:");
		d.firstnames_MAIN.print(5);
		System.out.println("Last Names:");
		d.lastnames_MAIN.print(5);
		System.out.println("Dates:");
		d.dates_MAIN.print(5);
		
	

		
	}

}
