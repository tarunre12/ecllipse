package Automation.Artifact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cserocksTest {

	CSEROCKS cal=new CSEROCKS();
	@Test
	void test1() {
		int result=cal.add(2, 3);
		assertEquals(5,result);
	}
	@Test
	void test2() {
		int result=cal.mul(2, 3);
		assertEquals(6,result);
	}

}