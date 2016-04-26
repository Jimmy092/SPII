package tests;

import water.SourceSegment;

import static org.junit.Assert.*;

import org.junit.Test;

public class SourceSegmentTest {

	@Test(expected= IllegalArgumentException.class)
	public void getNullNameSourceTest() {
		SourceSegment s= new SourceSegment(null, 11.25, 3.2, "theSource");
		s.getName();
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void getNullsubSourceTest() {
		SourceSegment s1= new SourceSegment("SSegm", 11.25, 3.2, null);
		s1.getSource();
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void getNegativePowerTest() {
		SourceSegment s2= new SourceSegment("SSegm", 11.25, -3.2, "theSource");
		s2.getPower();
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void getIllegalLengthTest() {
		SourceSegment s2= new SourceSegment("SSegm", -8, 3.2, "theSource");
		s2.getLength();
	}
	
	@Test
	public void getLegalLengthTest() {
		SourceSegment s2= new SourceSegment("SSegm", 55.1, 3.2, "theSource");
		s2.getLength();
	}
	
	@Test
	public void getLongestPathTest() {
		SourceSegment s2= new SourceSegment("SSegm", 55.1, 3.2, "theSource");
		s2.longestPath();
	}
	
	@Test
	public void getPowerTest() {
		SourceSegment s2= new SourceSegment("SSegm", 55.1, 88.2, "theSource");
		s2.getPower();
	}
	
	@Test
	public void getSubSourceTest() {
		SourceSegment s2= new SourceSegment("SSegm", 55.1, 88.2, "theSource");
		s2.getSource();
	}
	
	@Test
	public void getNameTest() {
		SourceSegment s2= new SourceSegment("SSegm", 55.1, 88.2, "theSource");
		s2.getName();
	}

}
