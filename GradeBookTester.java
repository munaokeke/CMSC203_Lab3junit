

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

	private GradeBook g1;
	private GradeBook g2;


	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
	    g1.addScore(50.0);
	    g1.addScore(75.0);
	   
	    g2 = new GradeBook(5);
	    g2.addScore(0.0);
	    g2.addScore(0.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		System.out.print(g1.toString());
		
	      
	    assertEquals(2, g1.getScoreSize(), 0.001);
	    assertEquals(2, g2.getScoreSize(), 0.001);
	}

	@Test
	void testSum() {
		assertEquals(125.0, g1.sum(), .0001);
		assertEquals(0.0, g2.sum(), .0001);

	}

	@Test
	void testMinimum() {
	    assertEquals(50.0, g1.minimum(), .001);
	    assertEquals(0.0, g2.minimum(), .001);

	}

	@Test
	void testFinalScore() {
	    assertEquals(75.0, g1.finalScore(), .0001);
	    assertEquals(0.0, g2.finalScore(), .0001);

	}


}
