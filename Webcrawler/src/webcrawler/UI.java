package webcrawler;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class UI {

	// Purpose of this class is to take input from user and provide organized output
	

	public static void main(String[] args) {
		
//<<<<<<< HEAD
		Filter filter = new Filter();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter verified data of each type. If no data is possessed for a given type, just press enter.");
		String username_verified = null;
		String firstname_verified = null;
		String lastname_verified = null;
		String location_verified = null;
		String email_verified = null;
		System.out.println("Username: ");
		try{
			username_verified = scanner.next();
		}
		catch(NoSuchElementException e){
			
		}
		System.out.println("First Name: ");
		try{
			firstname_verified = scanner.next();
		}
		catch(NoSuchElementException e){
			
		}
		System.out.println("Last Name: ");
		try{
			lastname_verified = scanner.next();
		}
		catch(NoSuchElementException e){
			
		}
		System.out.println("Location(State): ");
		try{
			location_verified = scanner.next();
		}
		catch(NoSuchElementException e){
			
		}
		System.out.println("Email: ");
		try{
			email_verified = scanner.next();
		}
		catch(NoSuchElementException e){
			
		}
		
		scanner.close();


/*		
		String url = "http://www.facebook.com/" + dataCruncher.getUsernames(0);
		//Michael Testing date filter
		System.out.println(url);
		String numtest = "10/08/1990 : " + filter.dates("10/08/1990") + "\n10/8/90 : " + filter.dates("10/8/90") + "\n8/10/90 : " + filter.dates("8/10/90") + "\n90/10/8 : " + filter.dates("90/10/8");
		System.out.println(numtest);
		String wordtest = "10 October, 1990 : " + filter.written("10 October, 1990") + "\n1 jan. 90 : " + filter.written("1 jan. 90");
		System.out.println(wordtest);

//=======
		DataCruncher dataCruncher = new DataCruncher();
		DataCruncher d = new DataCruncher();
		d.start(2, "http://www.rsriv.ece.ufl.edu/");

		System.out.println();
		d.urls_MAIN.printTop5();
		d.locations_MAIN.printTop5();
		d.emails_MAIN.printTop5();
*/		
		
//>>>>>>> bf082d9957c6370451206548ac26197bcfd314fa
	}

}
