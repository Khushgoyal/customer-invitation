package CustomerInvitation;

import java.io.FileNotFoundException;
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
public class JsonDataRead{
	public static List<List<String> > readData(String filename){

		List <List<String> > data = new ArrayList<List<String>>();
		List <String> lati = new ArrayList<String>();
		List <String> name1 = new ArrayList<String>();
		List <String> userid = new ArrayList<String>();
		List <String> longi = new ArrayList<String>();

		try{
		JSONParser parser=new JSONParser();
		JSONArray a = (JSONArray) parser.parse(new FileReader(filename));
		for (Object o : a){
		JSONObject person = (JSONObject) o;

		String name = (String)person.get("name");

		String latitude = (String)person.get("latitude");

		String user_id = Long.toString((Long)(person.get("user_id")));

		String longitude = (String)person.get("longitude");

		lati.add(latitude);
		name1.add(name);
		userid.add(user_id);
		longi.add(longitude);
		}
		data.add(lati);
		data.add(name1);
		data.add(userid);
		data.add(longi);
		}
		catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("IOException");
        } catch(NumberFormatException e){
        	System.out.println("The input is wrong");
        }
     	catch(ParseException e){
     		System.out.println("The ParseException Error");

     	}
	return data;
	}
}