package classwork13.kryvenkosergii_lv44;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTasks {

	@Test
	void test1() {
		assertEquals(17710, Task1.getNumber(20));
	}
	
	@Test
	void test2() {
		assertTrue(Task5.checkPalindrom("abababa"));
	}
	
	@Test
	void test3() {
		assertSame(5, Task6.countWords("abcd1 qwe 98786 asd 8qw656"));
	}
}
