package testData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MonthlyExpensesData<BufferReader> {
		 
		     private Map< String,ArrayList > subscriptionRatesMatrix = new HashMap< String,ArrayList >();   
		     public void addNewspaper(String newspaperName, List<Double> newspaperData)
		     {        
		         subscriptionRatesMatrix = (Map<String, ArrayList>) newspaperData;
		     }

		     public MonthlyExpensesData(){}

		     public void readSubscriptionFile(String filename)
		     {
		         // read a file line by line
		         // "TOI", 1,2,3,4,5,6,7
		         // "BT", 1,2,3,4,5,6,7
		         // "ET", 1,2,3,4,5,6,7
		    	try {
		     	String filePath = "newspaperTable.csv";
		     	String line = null;//,newspaperName;
		     	String newspaperName;
		     	List<Double> dayWiseData = null;
		     	File csvFile = new File (filePath) ;
		     		if(csvFile.isFile())
		     		{
		     			BufferedReader csvReader = new BufferedReader(new FileReader (filePath));
		     			List<String> lines = new ArrayList<String>();		     			
		     			
		     			
							while ((line = csvReader.readLine()) != null) {
							    lines.add(line);
							    String [] data = line.split(",");
							    newspaperName = data[0];
							    int beg = 1;
							   // dayWiseData = data[1];
							    addNewspaper(newspaperName, dayWiseData);
							}	
		     		
							csvReader.close();
		     		}
		    	}
						 catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
		     				     			
		     		}
		     
		     public List<Double> getDayWiseRates(List<String> newspaperNames)
		     {
		         List<Double> dailyRates = new ArrayList<Double>();
		         for(int i = 0; i < newspaperNames.size(); i++)
		         {
		        	 
		        	// List<Double> rate =  subscriptionRatesMatrix<newspaperNames[i][i], dailyRates>;
		             //dailyRates.add(rate);
		         }
		         return dailyRates;
		     }

		     	
		             //line = getline(); // get line
		            // List<String> newspaperRow = string_split(line); // split the string into multiple
		             //String newspaperName = newspaperRow[0];
		             //List<Double> dayWiseData = newspaperRow[1:end] // from index 1 to end is numeric data
		             //addNewspaper(newspaperName, dayWiseData);
		         
}
	 


