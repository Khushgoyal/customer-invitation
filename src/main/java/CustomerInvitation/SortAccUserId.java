package CustomerInvitation;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class SortAccUserId{
	public static List<List<String> > sort_userId(List <List<String> > data){
		List <List<String> > listNameUserId = new ArrayList<List<String>>();
		String []name = (data.get(0)).toArray(new String[(data.get(0)).size()]);
		String []user_id =(data.get(1)).toArray(new String[(data.get(1)).size()]);

		for(int i=0;i<user_id.length;i++)
		{
			for(int j=0;j<user_id.length-1;j++)
			{
				if((Integer.valueOf(user_id[j]))>(Integer.valueOf(user_id[j+1]))){
					String temp1=user_id[j];
					user_id[j]=user_id[j+1];
					user_id[j+1]=temp1;

					String temp2=name[j];
					name[j]=name[j+1];
					name[j+1]=temp2;
				}

			}
		}
		List <String>  listUserId = Arrays.asList(user_id);
		List <String>  listName = Arrays.asList(name);
		listNameUserId.add(listName);
		listNameUserId.add(listUserId);

		return listNameUserId;
	}

}