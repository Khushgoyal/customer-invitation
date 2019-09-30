package CustomerInvitation;

import static org.junit.Assert.*;
import java.util.*;
import java.io.*;
import org.junit.Test;
public class DistFromTest{

	@Test
	public void testDistanceFrom1()
	{
		assertEquals("Error in DistanceFrom",(Long)10L,DistanceFromSource.distanceFrom("53.2451022","-6.238335"));
	}

	@Test
	public void testDistanceFrom2()
	{
		assertEquals("Error in DistanceFrom",(Long)0L,DistanceFromSource.distanceFrom("53.3381985","-6.2592576"));
	}

	
	@Test //Test Case having negative coordinates
	public void testDistanceFrom3()
	{
		assertEquals("Error in DistanceFrom",(Long)14376L,DistanceFromSource.distanceFrom("-34.0522","-118.2437"));
	}
	

}