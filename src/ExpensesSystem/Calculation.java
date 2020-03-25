package ExpensesSystem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Calculation {
	
	public static String findDays(int date, int month, int year, int day)
	{
		try{
		 String input = date+"/"+month+"/"+year;
		 System.out.println(input);
		 String input_date = input;
		 SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		 Date dt1 = format1.parse(input_date);
		 DateFormat format2 = new SimpleDateFormat("EEEE"); 
		 String finalDay = format2.format(dt1);
		 
		 System.out.println(finalDay);
		 return finalDay;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
		
	}
	public Map<String, Integer > DayCountCalculation(int n, String firstday) 
    { 
		Map<String, Integer> dayMap = new HashMap<String, Integer>();
        // stores days in a week 
        String[] days = new String[]{ "Monday","Tuesday", "Wednesday","Thursday", "Friday","Saturday", "Sunday" }; 
          
        // Initialize all counts as 4. 
        int[] count = new int[7]; 
        for (int i = 0; i < 7; i++) 
            count[i] = 4; 
          
        // find index of the first day 
        int pos = 0; 
        for (int i = 0; i < 7; i++) 
        { 
            if (firstday == days[i])  
            { 
                pos = i; 
                break; 
            } 
        } 
          
        // number of days whose occurrence 
        // will be 5 
        int inc = n - 28; 
          
        // mark the occurrence to be 5 of n-28 days 
        for (int i = pos; i < pos + inc; i++) 
        { 
            if (i > 6) 
                count[i % 7] = 5; 
            else
                count[i] = 5; 
        } 
          
        // print the days 
        for (int i = 0; i <= 7; i++)  
        { 
            System.out.println(days[i] + " " + count[i]); 
            dayMap.put(days[i],count[i]);
            
        }
        return dayMap; 
    }       
}
