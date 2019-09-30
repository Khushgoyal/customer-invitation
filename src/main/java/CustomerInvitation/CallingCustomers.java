/*This file is all about getting values from the json file and putting in list
 * */

package CustomerInvitation;

import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import org.json.simple.parser.ParseException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class CallingCustomers{



	public static void driverFunction() //Driver Function
	{
		
		List <List<String> > JsonData = new ArrayList<List<String>>();
		List <List<String> > DataIn100km = new ArrayList<List<String>>();
		JsonData = JsonDataRead.readData("customers.json");
		
	    if(JsonData.isEmpty()){
	    	System.out.println("data is not present ");
	        }
	    else{
	    	DataIn100km=Get100kmsRangeValue.getValues(JsonData);
	    	//sorting according to the user id
		System.out.println(SortAccUserId.sort_userId(DataIn100km));
		}
	}

	public static void main(String[] args) 
	{
		CallingCustomers.driverFunction();	
	}
}