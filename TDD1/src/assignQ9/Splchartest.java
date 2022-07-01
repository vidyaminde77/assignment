package assignQ9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Splchartest {

	@Test
	void test() {
		assertEquals("Thiscar",SpecialChar.splchar("This$%^car"));
	}

}
