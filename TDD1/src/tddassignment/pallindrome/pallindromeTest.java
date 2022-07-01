package tddassignment.pallindrome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pallindromeTest {

	@Test
	void test() {
		assertEquals(true,pallindrome.palin1("mom", "mom") );
	}

}
