package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import water.*;

public class WaterBodyTest {

	@Test
	public void getNameTest() {
		WaterBody w= new WaterBody("aWaterBody");
		String expected = "aWaterBody";
		String result = w.getName();
		assertEquals(result, expected);
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void nameNullTest(){
		WaterBody w1= new WaterBody(null);
		w1.toString();
	}
	
	@Test
	public void toStringTest() {
		WaterBody w1= new WaterBody("oneOtherWaterBody");
		w1.toString();
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void nullMostPowerfulTest(){
		WaterBody[] a=null;
		WaterBody.mostPowerful(a);
	}
	
	@Test
	public void mostPowerfulTest() {
		
		SourceSegment s= new SourceSegment("SubSeg", 17.42, 33.21, "aSubSource");
		SourceSegment s1= new SourceSegment("SubSeg1", 18.19, 23.12, "anotherSubSource");
		
		WaterBody[] a={
				new Sea("Baltic Sea", 125.01, 19.36),
				new WaterBody("aWaterBody"),
				new SourceSegment("SSeg", 11.25, 3.2, "theSource"),
				new SourceSegment("SSeg1", 22.25, 13.2, "anotherSource"),
				new ConfluenceSegment("CSeg", 11.25, 9.6, s, s1),
				new Lake("Victoria", 125.01, "Somewhere")
				
		};
		
		WaterBody.mostPowerful(a);
		
	}

}
