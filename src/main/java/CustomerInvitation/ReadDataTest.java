package CustomerInvitation;

import static org.junit.Assert.*;
import java.util.*;
import java.io.*;
import org.junit.Test;
import java.util.*;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import org.json.simple.parser.ParseException;
import org.junit.rules.ExpectedException;

public class ReadDataTest{
public ExpectedException exception = ExpectedException.none();
@Test
public void testReadData1()
{
		List<List<String> > data = new ArrayList<List<String>>();
		List<String> innerList1 = new ArrayList<String>();
		List<String> innerList2 = new ArrayList<String>();
		List<String> innerList3 = new ArrayList<String>();
		List<String> innerList4 = new ArrayList<String>();

		innerList1.add("52.986375");
		innerList1.add("51.92893");
		innerList1.add("51.8856167");
		innerList1.add("53.2451022");
		innerList1.add("53.807778");

		data.add(innerList1);

		innerList2.add("Christina McArdle");
		innerList2.add("Alice Cahill");
		innerList2.add("Ian McArdle");
		innerList2.add("Ian Kehoe");
		innerList2.add("Charlie Halligan");

		data.add(innerList2);

		innerList3.add("12");
		innerList3.add("1");
		innerList3.add("2");
		innerList3.add("4");
		innerList3.add("28");

		data.add(innerList3);

		innerList4.add("-6.043701");
		innerList4.add("-10.27699");
		innerList4.add("-10.4240951");
		innerList4.add("-6.238335");
		innerList4.add("-7.714444");


		data.add(innerList4);

		
		assertEquals("Error in ReadData",data,JsonDataRead.readData("customers2.json"));
}

@Test
public void testNumberFormatException(){
	exception.expect(NumberFormatException.class);
	exception.expectMessage("Input is wrong");
	JsonDataRead.readData("customers.json");
}

@Test
public void testFileNotFoundException (){
	exception.expect(FileNotFoundException.class);
	exception.expectMessage("File Not Found");
	JsonDataRead.readData("customers.json");
}

@Test
public void testIOException (){
	exception.expect(IOException.class);
	exception.expectMessage("IOException");
	JsonDataRead.readData("customers.json");
}

@Test
public void testParseException (){
	exception.expect(ParseException.class);
	exception.expectMessage("The ParseException Error");
	JsonDataRead.readData("customers.json");
}
}
