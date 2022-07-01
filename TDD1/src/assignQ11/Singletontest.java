package assignQ11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Singletontest {

	@Test
	void test() {
		Singleton st1= Singleton.getSingleton();
		Singleton st2=Singleton.getSingleton();
		assertTrue(SingletonCheck.checksingleton(st1,st2));
	}

}
