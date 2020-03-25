package ExpensesSystem;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;
import java.util.Scanner;
import ExpensesSystem.Calculation;

public class UIdisplay {
	
public Scanner sc = new Scanner(System.in);
	
	public void displayBoard()
	{
		
		System.out.println("*********** WELCOME TO INTELLIGENT SYSTEM **********");

		// String input
		System.out.println("Enter user name ");
		String name = sc.nextLine();
		System.out.println("Welcome " + name +" !!");   

	    // Numerical input
	    int month = sc.nextInt();
	    System.out.println("Enter month " + month); 
	    
	    int year = sc.nextInt();
	    System.out.println("Enter year " + year);
	    
	    int date = sc.nextInt();
	    System.out.println("Enter first day - " + date);
	    
	    int days = checkMonthDays(month, year,date); 
	    
	    String firstDays = Calculation. findDays(date,month,year,days);
	    
	    Calculation cal = new Calculation();
	    
	    Map<String, Integer> dayCount  = cal.DayCountCalculation(days, firstDays);
	    
	    System.out.println("Enter type of expenses ");
		String expensesType = sc.nextLine();
		System.out.println("Type of Expenses " + expensesType );  
       
		TypeofWays tw = new TypeofWays(TypeofExpenses.valueOf(expensesType)); 
		tw.expenseWays();
	    
		
		ArrayList<String> memory = new ArrayList<String>(); 
        
        while(true) 
        { 
            memory.add(sc.nextLine()); 
            System.out.println(memory.toString()); 
        } 
	
	}	 
	
	  
	public int checkMonthDays(int month, int year,int firstdate)
	  
	  {
			  Calendar calendar = Calendar.getInstance();	 
			  int date = firstdate;
			  calendar.set(year, month, date);
			  int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
			  System.out.println("Day of week : " + calendar.getActualMaximum(Calendar.WEEK_OF_MONTH));
			  if(date == 01)
			  {
			  System.out.println("Total Number of Days in a month - " + days);
			  return days;
			  }
			  else
			  {
				  int totalDays = days - date;
				  System.out.println("Total Number of Days in a month - " + totalDays);
				  return totalDays;
			  }
	  }

}


