package common.money;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests that make sure the Percentage class works in isolation.
 */
class PercentageTests {


	@Test
	void percentageValueOfString() {
		Percentage percentage = Percentage.valueOf("100%");
		assertEquals("100%", percentage.toString());
	}

	@Test
	void percentage() {
		assertEquals(Percentage.valueOf("0.01"), Percentage.valueOf("1%"));
	}

	@Test
	void percentageEquality() {
		Percentage percentage1 = Percentage.valueOf("25%");
		Percentage percentage2 = Percentage.valueOf("25%");
		assertEquals(percentage1, percentage2);
	}

	@Test
	void newPercentage() {
		Percentage p = new Percentage(.25);
		assertEquals("25%", p.toString());
	}

	@Test
	void newPercentageWithRounding() {
		Percentage p = new Percentage(.255555);
		assertEquals("26%", p.toString());
	}
}
