package tests;

import water.Lake;

import static org.junit.Assert.*;

import org.junit.Test;

public class LakeTest {

	@Test(expected= IllegalArgumentException.class)
	public void getNullNameLakeTest() {
		Lake l= new Lake(null, 125.01, "UK");
		l.getName();
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void getNullLandLakeTest() {
		Lake l= new Lake("Victoria", 225.01, null);
		l.getLand();
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void getIllegalAreaLakeTest() {
		Lake l= new Lake("Victoria", 0, "Somewhere");
		l.getArea();
	}
	
	@Test
	public void getNameLakeTest() {
		Lake l= new Lake("Victoria", 125.01, "Somewhere");
		l.getName();
	}
	
	@Test
	public void getLandLakeTest() {
		Lake l= new Lake("Victoria", 225.01, "Somewhere");
		l.getLand();
	}
	
	@Test
	public void getAreaLakeTest() {
		Lake l= new Lake("Victoria", 214.55, "Somewhere");
		l.getArea();
	}


}
