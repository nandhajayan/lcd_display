package test_lcd_display;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DisplayLCDTest {

	@Test
	void testPrintIntegersInLCD() {
		String input = "5678";
		int[][] five = { { 0, 1, 0 }, { 1, 1, 0 }, { 0, 1, 1 } };
		assertEquals(five, input.charAt(0));
	}

}
