package tddassignment.numberevenQ8;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class eventest {

	@Test
	void test()
	{
		assertEquals(true,Evenodd.main(new int[] {11,22,33,44,55,66}));
	}


}
