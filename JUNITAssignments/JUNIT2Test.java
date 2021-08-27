import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUNIT2Test {

	@Test
	void test1() {
		JUNIT2 ob= new JUNIT2();
		int[] x= {5, 4, 87, 54 ,63 ,41 ,24 ,84 ,91};
		
		assertEquals(new Find(4, 91), ob.findMinMax(x));
	}
	
	@Test
	void test2() {
		JUNIT2 ob= new JUNIT2();
		int[] x= {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
		
		assertEquals(new Find(5, 5), ob.findMinMax(x));
	}
	
	@Test
	void test3() {
		JUNIT2 ob= new JUNIT2();
		int[] x= {-5, -4, -87, -54, -63, -41, -24, -84, -91};
		
		assertEquals(new Find(-91, -4), ob.findMinMax(x));
	}

}Test {

	@Test
	void test1() {
		JUNIT2 ob= new JUNIT2();
		int[] x= {5, 4, 87, 54 ,63 ,41 ,24 ,84 ,91};
		
		assertEquals(new Find(4, 91), ob.findMinMax(x));
	}
	
	@Test
	void test2() {
		JUNIT2 ob= new JUNIT2();
		int[] x= {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
		
		assertEquals(new Find(5, 5), ob.findMinMax(x));
	}
	
	@Test
	void test3() {
		JUNIT2 ob= new JUNIT2();
		int[] x= {-5, -4, -87, -54, -63, -41, -24, -84, -91};
		
		assertEquals(new Find(-91, -4), ob.findMinMax(x));
	}

}