package tests;

import water.RiverNetwork;
import water.ConfluenceSegment;
import water.SourceSegment;
import water.WaterBody;
import water.Lake;
import water.Sea;

import static org.junit.Assert.*;

import org.junit.Test;

public class RiverNetworkTest {

	@Test(expected= IllegalArgumentException.class)
	public void getNullNameTest() {
		Lake l= new Lake("Como", 222.33, "Italy");
		SourceSegment ss= new SourceSegment("SSeg", 22.25, 14.02, "TheSource"); 
		RiverNetwork rn= new RiverNetwork(null, ss, l);
		rn.getName();
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void getNullRiverTest() {
		Lake l= new Lake("Como", 222.33, "Italy"); 
		RiverNetwork rn= new RiverNetwork("Network", null, l);
		rn.getRiver();
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void getNullStillWTTest() {
		SourceSegment ss= new SourceSegment("SSeg", 22.25, 14.02, "TheSource"); 
		RiverNetwork rn= new RiverNetwork("Network", ss, null);
		rn.getFlowsInto();
	}
	
	@Test
	public void getNameTest() {
		Lake l= new Lake("Como", 222.33, "Italy");
		SourceSegment ss= new SourceSegment("SSeg", 22.25, 14.02, "TheSource"); 
		RiverNetwork rn= new RiverNetwork("Network", ss, l);
		rn.getName();
	}
	
	@Test
	public void getRiverTest() {
		Lake l= new Lake("Como", 222.33, "Italy");
		SourceSegment ss= new SourceSegment("SSeg", 22.25, 14.02, "TheSource"); 
		RiverNetwork rn= new RiverNetwork("Network", ss, l);
		rn.getRiver();
	}
	
	@Test
	public void getStillWTTest() {
		Lake l= new Lake("Como", 222.33, "Italy");
		SourceSegment ss= new SourceSegment("SSeg", 22.25, 14.02, "TheSource"); 
		RiverNetwork rn= new RiverNetwork("Network", ss, l);
		rn.getFlowsInto();
	}
	
	@Test
	public void getMaxLengthTest() {
		Lake l= new Lake("Como", 222.33, "Italy");
		SourceSegment ss= new SourceSegment("SSeg", 22.25, 14.02, "TheSource"); 
		RiverNetwork rn= new RiverNetwork("Network", ss, l);
		rn.maxLength();
	}
	
	@Test
	public void getPowerGeneratedTest() {
		Sea s= new Sea("Baltic sea", 222.33, 152.03);
		SourceSegment ss= new SourceSegment("SSeg", 27.14, 24.55, "TheSource");
		SourceSegment ss1= new SourceSegment("SSeg1", 22.25, 14.02, "TheSource1");
		SourceSegment ss2= new SourceSegment("SSeg2", 32.77, 21.33, "TheSource2");
		ConfluenceSegment cs= new ConfluenceSegment("CSeg", 33.88, 18.47, ss1, ss2);
		ConfluenceSegment cs1= new ConfluenceSegment("CSeg1", 22.25, 14.02, ss, cs); 
		RiverNetwork rn= new RiverNetwork("Network", cs1, s);
		rn.powerGenerated();
	}


}
