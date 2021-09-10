package junitProjects;

import static org.junit.jupiter.api.Assertions.*;
import cal.junitProjects.Calculator;

public class CalTest {

	public @interface Test {

	}

	@Test	
	public void calTest() {
		assertEquals("error in add()", 3, Calculator.add(1, 2));
		assertEquals("error in add()", -3, Calculator.add(-1, -2));
		assertEquals("error in add()", 8, Calculator.add(9, 0));

	}

	private void assertEquals(String string, int i, int add) {
		// TODO Auto-generated method stub
		
	}
	public void calAddFail() {
		assertEquals("error in add()", 0, Calculator.add(1, 2));

	}
	public void calSubPass() {
		assertEquals("error in sub()", 1, Calculator.add(1, 2));
		assertEquals("error in sub()", -1, Calculator.add(-1, -2));
		assertEquals("error in sub()", 0, Calculator.add(2, 1));
	}
	public void calSubFail() {
	assertEquals("error in add()", 0, Calculator.add(1, 2));

}
}