package TourReservationSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;

public class Application {
	public static boolean run = true;
	
	public static void main(String[] args) throws IOException, NumberFormatException, ParseException 
	
    { 
		while(run) {
			System.out.println ( "1. Open Tour. \n" 
					+ "2. Get Tour. \n"
					+ "3. End Operation. \n"
					+ "Type Operation number: " );
			
			//Enter data using BufferReader 
	        BufferedReader reader =  
	                   new BufferedReader(new InputStreamReader(System.in)); 
	         
	        // Reading data using readLine 
	        String operation = reader.readLine();
	        runner(operation);			
		}
    }

private static void runner(String operation) throws IOException, ParseException {
	TravelSystem system = new TravelSystem();
	BufferedReader reader =  
            new BufferedReader(new InputStreamReader(System.in)); 
	switch(operation) {
    case "1":
      String[] fields = {"1. Tour ID", "2. Date in mm/dd/yyyy format", "3. Number of Participants", "4. Manager Name"};
      System.out.println( "Fill the required fields");
      String[] inputs = new String[4];
      for (int i=0; i<fields.length; i++) 
      { 
    	  System.out.println(fields[i]);
    	  String input = reader.readLine();
    	  inputs[i] = input;
      }
      system.openTourInstance(inputs[0], new SimpleDateFormat("dd/MM/yyyy").parse(inputs[1]), Integer.parseInt(inputs[2]), inputs[3]);
      
      System.out.println ( "1. Open Tour. \n" 
				+ "2. Get Tour. \n"
				+ "Type Operation number: " );
      String oper = reader.readLine();
//      getTourInstances(String tourID, TimeInterval timeInterval, int numberOfPersons)
      
      String[] field = {"1. Tour ID", "2. Start Date in mm/dd/yyyy format", "3. End Date in mm/dd/yyyy format", "4. Number of Participants"};
      String[] newInputs = new String[4];
      for (int i=0; i<field.length; i++) 
      { 
    	  System.out.println(field[i]);
    	  String input = reader.readLine();
    	  newInputs[i] = input;
      }
      Date start = new SimpleDateFormat("dd/MM/yyyy").parse(newInputs[1]);
      Date end = new SimpleDateFormat("dd/MM/yyyy").parse(newInputs[2]);
      system.getTourInstances(newInputs[0], new TimeInterval(start, end), Integer.parseInt(newInputs[3]));

      
       break;
    case "2":
//    	String[] field = {"1. Tour ID", "2. Start Date in mm/dd/yyyy format", "3. End Date in mm/dd/yyyy format", "4. Number of Participants"};
//        String[] newInputs = new String[4];
//        for (int i=0; i<field.length; i++) 
//        { 
//      	  System.out.println(field[i]);
//      	  String input = reader.readLine();
//      	  newInputs[i] = input;
//        }
//        Date start = new SimpleDateFormat("dd/MM/yyyy").parse(newInputs[1]);
//        Date end = new SimpleDateFormat("dd/MM/yyyy").parse(newInputs[2]);
//        system.getTourInstances(newInputs[0], new TimeInterval(start, end), Integer.parseInt(newInputs[3]));
      break;
    case "3":
    	run = false;
    	break;
    default:
    	System.out.println(operation); 
  }

	
} 

}