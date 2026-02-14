package Automation.Artifact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CSEROCKSTest {
	CSEROCKS cal=new CSEROCKS();

	@Test
	void test() {
		int result=cal.add(2,3);
		assertEquals(5,result);
	}

}
