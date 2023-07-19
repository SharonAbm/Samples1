package parallelScripts;

import org.testng.annotations.Test;

public class SampleThreeTest {
	@Test
	public void testOne() {
		long id=Thread.currentThread().getId();
		System.out.println("TestOne is SampleThree..."+id);
	}
	@Test
	public void testTwo() {
		long id=Thread.currentThread().getId();
		System.out.println("TestTwo is SampleThree..."+id);
	}
	@Test
	public void testThree() {
		long id=Thread.currentThread().getId();
		System.out.println("TestThree is SampleThree...."+id);
	}
	@Test
	public void testFour() {
		long id=Thread.currentThread().getId();
		System.out.println("TestFour is SampleThree...."+id);
	}

}
