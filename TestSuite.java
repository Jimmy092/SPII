package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
   ConfluenceSegmentTest.class,
   SourceSegmentTest.class,
   LakeTest.class,
   RiverNetworkTest.class,
   SeaTest.class,
   WaterBodyTest.class
})
public class TestSuite {   
} 
