package homework3.kryvenkosergii_lv444;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class App1Test {

//	App1 app1 = new App1();

	@Test // 3 float numbers which are they belong to the range [-5,5]
	public void testCheckFloatNumber() {
		float actual1 = 5;
		float actual2 = -5;
		float actual3 = 0f;
		CheckNumber checkNumberFloat = new CheckNumber(5f, -5f, 6f);

		assertEquals(actual1, checkNumberFloat.getNumberF1());
		assertEquals(actual2, checkNumberFloat.getNumberF2());
		assertEquals(actual3, checkNumberFloat.getNumberF3());
	}

	@Test // checking integer number and determine min and max
	public void testCheckIntNumber() {
		int actualMax = 565;
		int actualMin = 16;
		CheckNumber checkNumberInteger = new CheckNumber(25, 565, 16);

		assertEquals(actualMax, checkNumberInteger.getMaxNumberI());
		assertEquals(actualMin, checkNumberInteger.getMinNumberI());
	}

	@Test // checking name of HTTP Error
	public void testHTTPError() {
		String actual403 = "Forbidden";
		assertSame(actual403, HTTPError.ERROR403.getNameError());

	}

}
