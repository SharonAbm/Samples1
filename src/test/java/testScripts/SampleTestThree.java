package testScripts;

import org.testng.annotations.Test;

public class SampleTestThree {
	@Test(groups="featureOne")
	public void testOne() {
		System.out.println("Test31 is SampleThree");
	}
	@Test(groups="featureTwo")
	public void testTwo() {
		System.out.println("Test32 is SampleThree");
	}
	@Test(groups="featureThree")
	public void testThree() {
		System.out.println("Test33 is SampleThree");
	}
	@Test(groups="featureFour")
	public void testFour() {
		System.out.println("Test34 is SampleThree");
	}

}
