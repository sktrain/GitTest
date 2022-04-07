package sk.train;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArithmeticTestJupiter {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() {
		//assertEquals("falsche Berechnung", 0.2, ar.add(0.1, 0.1), 0.0);
		Assertions.assertEquals( 0.2, Arithmetic.add(0.1, 0.1), 0.0, "falsche Berechnung");
	}

	@Test
	public void testFakultaet() {
		assertEquals(120, Arithmetic.fakultaet(5), "falsche Berechnung");
	}

}
