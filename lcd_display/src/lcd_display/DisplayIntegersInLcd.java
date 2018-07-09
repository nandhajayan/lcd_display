package lcd_display;

import java.util.Scanner;

public class DisplayIntegersInLcd {

	public static void main(String[] args) {
		System.out.println("Enter the input : ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		DisplayLCD dLCD = new DisplayLCD();
		dLCD.printIntegersInLcdFormat(input);

	}

}
