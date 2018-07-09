package lcd_display;

public class DisplayLCD {

	public void printIntegersInLcdFormat(String input) {
		
		int[][][] character = new int[input.length()][3][3];
		int[][] one = { { 0, 0, 0 }, { 0, 0, 1 }, { 0, 0, 1 } };
		int[][] two = { { 0, 1, 0 }, { 0, 1, 1 }, { 1, 1, 0 } };
		int[][] three = { { 0, 1, 0 }, { 0, 1, 1 }, { 0, 1, 1 } };
		int[][] four = { { 0, 0, 0 }, { 1, 1, 1 }, { 0, 0, 1 } };
		int[][] five = { { 0, 1, 0 }, { 1, 1, 0 }, { 0, 1, 1 } };
		int[][] six = { { 0, 1, 0 }, { 1, 1, 0 }, { 1, 1, 1 } };
		int[][] seven = { { 0, 1, 0 }, { 0, 0, 1 }, { 0, 0, 1 } };
		int[][] eight = { { 0, 1, 0 }, { 1, 1, 1 }, { 1, 1, 1 } };
		int[][] nine = { { 0, 1, 0 }, { 1, 1, 1 }, { 0, 0, 1 } };
		int[][] zero = { { 0, 1, 0 }, { 1, 0, 1 }, { 1, 1, 1 } };

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '1')
				character[i] = one;
			else if (input.charAt(i) == '2')
				character[i] = two;
			else if (input.charAt(i) == '3')
				character[i] = three;
			else if (input.charAt(i) == '4')
				character[i] = four;
			else if (input.charAt(i) == '5')
				character[i] = five;
			else if (input.charAt(i) == '6')
				character[i] = six;
			else if (input.charAt(i) == '7')
				character[i] = seven;
			else if (input.charAt(i) == '8')
				character[i] = eight;
			else if (input.charAt(i) == '9')
				character[i] = nine;
			else if (input.charAt(i) == '0')
				character[i] = zero;
			else
				character[i] = four;
		}
		
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < input.length(); i++) {
				for (int k = 0; k < 3; k++) {
					if (character[i][j][k] == 1) {
						if (k == 1)
							System.out.print("_");
						else
							System.out.print("|");
					} else
						System.out.print(".");
				}
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
