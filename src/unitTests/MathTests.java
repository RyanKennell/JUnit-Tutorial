package unitTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import src.Maths;

public class MathTests {
	
	private Maths maths;
	
	@BeforeEach
	public void setUp() throws Exception {
		maths = new Maths();
	}
	
	@Test
	@DisplayName("Summing 3 numbers")
	public void sumThreeNumbers() {
		assertEquals(6, maths.sum(new int[] {1, 2, 3} ));
	}
	
	@Test
	public void compareTwoEqualNumbers() {
		assertTrue(maths.isEqual(1, 1));
	}
	
	@Test
	public void compareTwoUnequalNumbers() {
		assertFalse(maths.isEqual(1, 2));
	}
}
