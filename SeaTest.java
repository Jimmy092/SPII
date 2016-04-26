package tests;

import water.Lake;
import water.Sea;

import static org.junit.Assert.*;

import org.junit.Test;

public class SeaTest {

	@Test(expected= IllegalArgumentException.class)
	public void getNullNameSeaTest() {
		Sea s= new Sea(null, 125.01, 19.36);
		s.getName();
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void getIllegalAreaSeaTest() {
		Sea s= new Sea("Baltic Sea", -125.01, 19.36);
		s.getArea();
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void getIllegalPowerSeaTest() {
		Sea s= new Sea("Baltic Sea", 125.01, -19.36);
		s.getPower();
	}
	
	@Test
	public void getNameSeaTest() {
		Sea s= new Sea("Mediterranean Sea", 125.01, 19.36);
		s.getName();
	}
	
	@Test
	public void getAreaSeaTest() {
		Sea s= new Sea("Baltic Sea", 125.01, 19.36);
		s.getArea();
	}
	
	@Test
	public void getPowerSeaTest() {
		Sea s= new Sea("Baltic Sea", 125.01, 19.36);
		s.getPower();
	}


}
