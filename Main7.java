import java.util.*;
public class Main7 
{   
  	public static void main(String[] strings) 
	{

        	Scanner input = new Scanner(System.in);

        	int nod = 0; 
                String MON = "Unknown";

        	System.out.print("Input a month number: ");
        	int month = input.nextInt();

        	System.out.print("Input a year: ");
        	int year = input.nextInt();

        	switch (month) 
		{
            		case 1:
                		MON = "January";
                		nod = 31;
                	        break;
            		case 2:
                		MON = "February";
                		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
				{
                   			nod = 29;
                		} 
				else 	
				{
                    			nod = 28;
                		}
                	        break;
            		case 3:
                		MON = "March";
                		nod = 31;
                	        break;
            		case 4:
                		MON = "April";
                		nod = 30;
                	        break;
            		case 5:
                		MON = "May";
                		nod = 31;
                		break;
            		case 6:
               			MON = "June";
                		nod = 30;
                		break;
            		case 7:
                		MON = "July";
                		nod = 31;
                		break;
            		case 8:
                		MON = "August";
                		nod = 31;
                		break;
            		case 9:
                		MON = "September";
                		nod = 30;
                		break;
            		case 10:
                		MON = "October";
                		nod = 31;
                		break;
            		case 11:
                		MON = "November";
                		nod = 30;
                		break;
            		case 12:
                		MON = "December";
                		nod = 31;
		}
        	System.out.print(MON + " " + year + " has " + nod + " days\n");
   	}
}