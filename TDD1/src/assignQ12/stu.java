package assignQ12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class stu {

	@Test
	void test() throws CloneNotSupportedException{
		
		Student s1= new Student(101, "vidya");
		Student s2 =(Student)s1.clone();
		assertEquals(true,Student.checkClone(s1, s2));
		
		
	}

}
