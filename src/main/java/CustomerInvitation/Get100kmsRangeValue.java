/* From this file data is being selected and pass it to Calling Customers file and then check the condition of distance euqals or greater than 100 km 
 * */

package CustomerInvitation;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Get100kmsRangeValue{

	public static List<List<String> > getValues(List <List<String> > data)
	{
		List <List<String> > values = new ArrayList<List<String>>();
		List <String> lati = new ArrayList<String>();
	    List <String> name = new ArrayList<String>();
	    List <String> user_id = new ArrayList<String>();
	    List <String> longi = new ArrayList<String>();
	    List <String> nameIn100Range = new ArrayList<String>();
	    List <String> userID100InRange = new ArrayList<String>();

			lati=data.get(0);
			name=data.get(1);
			user_id=data.get(2);
			longi=data.get(3);

			for(int i=0;i<lati.size();i++)
			{
				String str1=(String) lati.get(i);
				String str2=(String) longi.get(i);
				// getting from values from the json file where str1 and str2 are lati and longi of user id
				Long dist=DistanceFromSource.distanceFrom(str1,str2);
				if(dist<=100)
				{
					nameIn100Range.add(name.get(i));
					userID100InRange.add(user_id.get(i));
				}
			}
		values.add(nameIn100Range);
		values.add(userID100InRange);
		return values;
	}
}