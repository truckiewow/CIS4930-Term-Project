package webcrawler;



public class Filter {

	public Filter() {
		//doesn't need anything yet
	}
	
	public String dates(String str) {
		String M = "", D = "", Y = "", date = written(str);
		String temp[];
		if(date != "Failed"){
			return date;
		}
		//Check for xx(xx)/xx(xx)/xx(xx)
		else if(str.matches("[0-9]{1,4}/[0-9]{1,4}/[0-9]{1,4}")) {
			temp = str.split("/");
		    if (numbers(temp[0], "m") && numbers(temp[1],"d") && numbers(temp[2],"y")) {
		    	System.out.println("MDY");
		    	M = temp[0];
		    	D = temp[1];
		    	Y = temp[2];
		    }
		    else if (numbers(temp[0], "d") && numbers(temp[1],"m") && numbers(temp[2],"y")) {
		    	System.out.println("DMY");
		    	D = temp[0];
		    	M = temp[1];
		    	Y = temp[2];
		    }
		    else if (numbers(temp[0], "y") && numbers(temp[1],"m") && numbers(temp[2],"d")) {
		    	System.out.println("YMD");
		    	Y = temp[0];
		    	M = temp[1];
		    	D = temp[2];
		    }
		    else 
		    	return "Failed";
		}
		else if(str.matches("[0-9]{1,4}-[0-9]{1,4}-[0-9]{1,4}")) {
			temp = str.split("-");
		    if (numbers(temp[0], "m") && numbers(temp[1],"d") && numbers(temp[2],"y")) {
		    	System.out.println("MDY");
		    	M = temp[0];
		    	D = temp[1];
		    	Y = temp[2];
		    }
		    else if (numbers(temp[0], "d") && numbers(temp[1],"m") && numbers(temp[2],"y")) {
		    	System.out.println("DMY");
		    	D = temp[0];
		    	M = temp[1];
		    	Y = temp[2];
		    }
		    else if (numbers(temp[0], "y") && numbers(temp[1],"m") && numbers(temp[2],"d")) {
		    	System.out.println("YMD");
		    	Y = temp[0];
		    	M = temp[1];
		    	D = temp[2];
		    }
		    else 
		    	return "Failed";
		    
		}
		date = format(M,D,Y);
		return date;
	}
	
	private boolean numbers(String str, String mode) {
		boolean num = false;
		switch (mode) {
		  case "m" :
			  if((str.length() == 1) || (str.length() == 2)) { 
			      int month = 0;
			      for(int i=0; i < str.length(); i++){
       				  month += Math.pow(10,(str.length()-i-1))*(str.charAt(i)-'0');
		    	  }
			      if(month < 13 && month > 0) {
				      num = true;
			      }
			  }
			  else return(false);
			  break;
		  case "d" :
			  if((str.length() == 1) || (str.length() == 2)) { 
			      int day = 0;
			      for(int i=0; i < str.length(); i++){
       				  day += Math.pow(10,(str.length()-i-1))*(str.charAt(i)-'0');
		    	  }
			      if(day < 32 && day > 0) {
				      num = true;
			      }
			  }
			  else return(false);
			  break;
		  case "y" :
			  if((str.length() == 2) || (str.length() == 4)) { 
			      int year = 0;
			      for(int i=0; i < str.length(); i++){
       				  year += Math.pow(10,(str.length()-i-1))*(str.charAt(i)-'0');
		    	  }
			      if(year < 2013 && year >= 0) {
				      num = true;
			      }
			  }
			  else return(false);
			  break;
		  default :
			  num = false;
			  break;
		}
		return num;
	}
	
	private  String written(String str) {
		String date, m = "", d = "", y = "", temp[];
		// D(D) MMM(M.,) Y(YYY)
		if(str.matches("[0-9]{1,2} ((jan|Jan|JAN)|(feb|Feb|FEB)|(mar|Mar|MAR)|(apr|Apr|APR)|(may|May|MAY)|(jun|Jun|JUN)|(jul|Jul|JUL)|(aug|Aug|AUG)|(sep|Sep|SEP)|(oct|Oct|OCT)|(nov|Nov|NOV)|(dec|Dec|DEC))[a-zA-Z.,]+ [0-9]{2,4}")){
			temp = str.split(" ");
			d = temp[0];
			y = temp[2];
			if(temp[1].matches("((jan|Jan|JAN))[a-zA-Z.,]+")) {
				m = "01";
			}
			else if(temp[1].matches("((feb|Feb|FEB))[a-zA-Z.,]+")) {
				m = "02";
			}
			else if(temp[1].matches("((mar|Mar|MAR))[a-zA-Z.,]+")) {
				m = "03";
			}
			else if(temp[1].matches("((apr|Apr|APR))[a-zA-Z.,]+")) {
				m = "04";
			}
			else if(temp[1].matches("((may|May|MAY))[a-zA-Z.,]+")) {
				m = "05";
			}
			else if(temp[1].matches("((jun|Jun|JUN))[a-zA-Z.,]+")) {
				m = "06";
			}
			else if(temp[1].matches("((jul|Jul|JUL))[a-zA-Z.,]+")) {
				m = "07";
			}
			else if(temp[1].matches("((aug|Aug|AUG))[a-zA-Z.,]+")) {
				m = "08";
			}
			else if(temp[1].matches("((sep|Sep|SEP))[a-zA-Z.,]+")) {
				m = "09";
			}
			else if(temp[1].matches("((oct|Oct|OCT))[a-zA-Z.,]+")) {
				m = "10";
			}
			else if(temp[1].matches("((nov|Nov|NOV))[a-zA-Z.,]+")) {
				m = "11";
			}
			else if(temp[1].matches("((dec|Dec|DEC))[a-zA-Z.,]+")) {
				m = "12";
			}
			date = format(m,d,y);
			return date;
		}
		else if(str.matches("((jan|Jan|JAN)|(feb|Feb|FEB)|(mar|Mar|MAR)|(apr|Apr|APR)|(may|May|MAY)|(jun|Jun|JUN)|(jul|Jul|JUL)|(aug|Aug|AUG)|(sep|Sep|SEP)|(oct|Oct|OCT)|(nov|Nov|NOV)|(dec|Dec|DEC))[a-zA-Z.,]+ [0-9]{1,2}[.,]{0,1} [0-9]{2,4}")){
			temp = str.split(" ");
			String temp2[];
			if(temp[1].contains(",")) {
				temp2 = temp[1].split(",");
				temp[1] = "";
				for(int i=0; i<temp2.length; i++) {
					temp[1] +=  temp2[i];
				}
			}
			if(temp[1].contains(".")) {
				temp2 = temp[1].split(".");
				temp[1] = "";
				for(int i=0; i<temp2.length; i++) {
					temp[1] += temp2[i];
				}
			}
			d = temp[1];
			y = temp[2];
			if(temp[0].matches("((jan|Jan|JAN))[a-zA-Z.,]+")) {
				m = "01";
			}
			else if(temp[0].matches("((feb|Feb|FEB))[a-zA-Z.,]+")) {
				m = "02";
			}
			else if(temp[0].matches("((mar|Mar|MAR))[a-zA-Z.,]+")) {
				m = "03";
			}
			else if(temp[0].matches("((apr|Apr|APR))[a-zA-Z.,]+")) {
				m = "04";
			}
			else if(temp[0].matches("((may|May|MAY))[a-zA-Z.,]+")) {
				m = "05";
			}
			else if(temp[0].matches("((jun|Jun|JUN))[a-zA-Z.,]+")) {
				m = "06";
			}
			else if(temp[0].matches("((jul|Jul|JUL))[a-zA-Z.,]+")) {
				m = "07";
			}
			else if(temp[0].matches("((aug|Aug|AUG))[a-zA-Z.,]+")) {
				m = "08";
			}
			else if(temp[0].matches("((sep|Sep|SEP))[a-zA-Z.,]+")) {
				m = "09";
			}
			else if(temp[0].matches("((oct|Oct|OCT))[a-zA-Z.,]+")) {
				m = "10";
			}
			else if(temp[0].matches("((nov|Nov|NOV))[a-zA-Z.,]+")) {
				m = "11";
			}
			else if(temp[0].matches("((dec|Dec|DEC))[a-zA-Z.,]+")) {
				m = "12";
			}
			date = format(m,d,y);
			return date;
		}
		return " Failed"; 
	}
	
	private String format(String m, String d, String y){
		String date;
		if(y.length() == 2) {
	    	y = "19" + y;
	    }
	    if(m.length() == 1) {
	    	m = "0" + m;
	    }
	    if(d.length() == 1) {
	    	d = "0" + d;
	    }
	    date = m + d + y;
		return date;
	}

	public boolean email(String str) {
		return str.matches("[a-zA-Z0-9-._]+@[a-zA-Z0-9._-]+[a-zA-Z0-9]+");
	}
	
}