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

public class GetValuesOf100kmTest{

	@Test
	public void testGetValues1()
	{
		//Output Data
		List<List<String> > dataOutput = new ArrayList<List<String>>();
		List<String> innerListOutput1 = new ArrayList<String>();
		List<String> innerListOutput2 = new ArrayList<String>();

		innerListOutput1.add("Christina McArdle");
		innerListOutput2.add("12");

		dataOutput.add(innerListOutput1);
		dataOutput.add(innerListOutput2);

 		//Input Data

		List<List<String> > data = new ArrayList<List<String>>();
		List<String> innerList1 = new ArrayList<String>();
		List<String> innerList2 = new ArrayList<String>();
		List<String> innerList3 = new ArrayList<String>();
		List<String> innerList4 = new ArrayList<String>();

		innerList1.add("52.986375");
		innerList1.add("51.92893");
		innerList1.add("51.8856167");

		data.add(innerList1);

		innerList2.add("Christina McArdle");
		innerList2.add("Alice Cahill");
		innerList2.add("Ian McArdle");
	

		data.add(innerList2);

		innerList3.add("12");
		innerList3.add("1");
		innerList3.add("2");
		

		data.add(innerList3);

		innerList4.add("-6.043701");
		innerList4.add("-10.27699");
		innerList4.add("-10.4240951");
	

		data.add(innerList4);

		assertEquals("Error in GetValues",dataOutput,Get100kmsRangeValue.getValues(data));
	}
}