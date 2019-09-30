/*This file calculates distance from the source corrdinates and destination coordinates
 * */

package CustomerInvitation;

import java.io.*;
import java.util.*;
public class DistanceFromSource{
	public static int RadiusOfEarthInKM=6367;
	public static Double Lati =  Double.parseDouble("53.3381985");
	public static Double Longi =  Double.parseDouble("-6.2592576");

	public static Long distanceFrom(String LatiDestination,String LongiDestination){

		Double LatiDesti = Double.parseDouble (LatiDestination);
		Double LongiDesti = Double.parseDouble(LongiDestination);
		Double phi_1 = Math.toRadians(DistanceFromSource.Lati);
		Double phi_2 = Math.toRadians(LatiDesti);
		Double delta_lambda =Math.abs( Math.toRadians(LongiDesti - DistanceFromSource.Longi));
		Double delta_sigma = Math.acos(((Math.sin(phi_1)*Math.sin(phi_2))+(Math.cos(phi_1)*Math.cos(phi_2)*Math.cos(delta_lambda))));

		return ((new Double (DistanceFromSource.RadiusOfEarthInKM*delta_sigma)).longValue());
	}
	public static void main(String[] args) 
	{
		System.out.println(DistanceFromSource.distanceFrom("-34.0522","-118.2437"));
	}
}