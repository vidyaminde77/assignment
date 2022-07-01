package tddassignment.email;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Emailtest {

	@Test
	void test() {
		assertEquals(true,Email.Emailpass("vids@gmail.com", "vid@123"));
	}

}
