package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import water.ConfluenceSegment;
import water.SourceSegment;

public class ConfluenceSegmentTest {

	@Test(expected= IllegalArgumentException.class)
	public void getNullNameConfTest() {
		SourceSegment s= new SourceSegment("SSeg", 11.25, 3.2, "theSource");
		SourceSegment s1= new SourceSegment("SSeg1", 22.25, 13.2, "anotherSource");
		ConfluenceSegment c= new ConfluenceSegment(null, 11.25, 9.6, s1, s);
		c.getName();
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void getNullRightTest() {
		SourceSegment s= new SourceSegment("SSeg", 11.25, 3.2, "theSource");
		ConfluenceSegment c= new ConfluenceSegment("CSeg", 11.25, 9.6, null, s);
		c.getRight();
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void getNullLeftTest() {
		SourceSegment s= new SourceSegment("SSeg", 11.25, 3.2, "theSource");
		ConfluenceSegment c= new ConfluenceSegment("CSeg", 11.25, 9.6, s, null);
		c.getLeft();
	}
	

	@Test(expected= IllegalArgumentException.class)
	public void getNegativePowerTest() {
		SourceSegment s= new SourceSegment("SSeg", 11.25, 3.2, "theSource");
		SourceSegment s1= new SourceSegment("SSeg1", 22.25, 13.2, "anotherSource");
		ConfluenceSegment c= new ConfluenceSegment("CSeg", 11.25, -9.6, s1, s);
		c.getPower();
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void getIllegalLengthTest() {
		SourceSegment s= new SourceSegment("SSeg", 11.25, 3.2, "theSource");
		SourceSegment s1= new SourceSegment("SSeg1", 22.25, 13.2, "anotherSource");
		ConfluenceSegment c= new ConfluenceSegment("CSeg", -11.25, 9.6, s1, s);
		c.getLength();
	}
	
	@Test
	public void getLongestPathTest(){
		SourceSegment s= new SourceSegment("SSeg", 11.25, 3.2, "theSource");
		SourceSegment s1= new SourceSegment("SSeg1", 22.25, 13.2, "anotherSource");
		ConfluenceSegment c= new ConfluenceSegment("CSeg", 11.25, 9.6, s1, s);
		c.longestPath();
	}
	
	@Test
	public void getLegalLengthTest() {
		SourceSegment s= new SourceSegment("SSeg", 11.25, 3.2, "theSource");
		SourceSegment s1= new SourceSegment("SSeg1", 22.25, 13.2, "anotherSource");
		ConfluenceSegment c= new ConfluenceSegment("CSeg", 11.25, 9.6, s1, s);
		c.getLength();
	}
	
	@Test
	public void getPowerTest() {
		SourceSegment s= new SourceSegment("SSeg", 11.25, 3.2, "theSource");
		SourceSegment s1= new SourceSegment("SSeg1", 22.25, 13.2, "anotherSource");
		ConfluenceSegment c= new ConfluenceSegment("CSeg", 11.25, 9.6, s1, s);
		c.getPower();
	}
	
	@Test
	public void getSinglePowerTest() {
		SourceSegment s= new SourceSegment("SSeg", 11.25, 3.2, "theSource");
		SourceSegment s1= new SourceSegment("SSeg1", 22.25, 13.2, "anotherSource");
		ConfluenceSegment c= new ConfluenceSegment("CSeg", 11.25, 9.6, s1, s);
		c.getSinglePower();
	}
	
	@Test
	public void getLeftTest() {
		SourceSegment s= new SourceSegment("SSeg", 11.25, 3.2, "theSource");
		SourceSegment s1= new SourceSegment("SSeg1", 22.25, 13.2, "anotherSource");
		ConfluenceSegment c= new ConfluenceSegment("CSeg", 11.25, 9.6, s1, s);
		c.getLeft();
	}
	
	@Test
	public void getRightTest() {
		SourceSegment s= new SourceSegment("SSeg", 11.25, 3.2, "theSource");
		SourceSegment s1= new SourceSegment("SSeg1", 22.25, 13.2, "anotherSource");
		ConfluenceSegment c= new ConfluenceSegment("CSeg", 11.25, 9.6, s1, s);
		c.getRight();
	}
}
