package assignQ10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class concat1 {

	@Test
	void test() {
		assertEquals("apple-orange-banana-lemon",concat.con(new String[] {"apple","orange","banana","lemon"}));
	}

}
