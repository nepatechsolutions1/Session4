import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		System.out.println("Please enter a number (1 - 999): ");
		Scanner input = new Scanner(System.in);
		
		int userNumber = input.nextInt();
		
		String word = "";
		
		int hundreth = userNumber / 100;
		int tenth = userNumber % 100;
		
		if (hundreth != 0) {
			word = getOnesWord(hundreth);
			word = word + " hundred ";
		}
		
		word = word + getTenthWord(tenth);
		
		System.out.println(word);
		
		input.close();

	}
	
	private static String getOnesWord(int ones) {
		
		String onesWord = "";
		
		switch(ones) {
			case 1:
				onesWord = "one";
				break;
			case 2:
				onesWord = "two";
				break;
			case 3:
				onesWord = "three";
				break;
			case 4:
				onesWord = "four";
				break;
			case 5:
				onesWord = "five";
				break;
			case 6:
				onesWord = "six";
				break;
			case 7:
				onesWord = "seven";
				break;
			case 8:
				onesWord = "eight";
				break;
			case 9:
				onesWord = "nine";
				break;
		}
		
		return onesWord;
	}
	
	private static String getTenthWord(int tens) {
		String word = "";
		if (tens < 20) {
			switch(tens) {
				case 19:
					word = "nineteen";
					break;
				case 18:
					word = "eighteen";
					break;
				case 17:
					word = "seventeen";
					break;
				case 16:
					word = "sixteen";
					break;
				case 15:
					word = "fifteen";
					break;
				case 14:
					word = "fourteen";
					break;
				case 13:
					word = "thirteen";
					break;
				case 12:
					word = "twelve";
					break;
				case 11:
					word = "eleven";
					break;
				case 10:
					word = "ten";
					break;
				default:
					word = getOnesWord(tens);
					break;
					
			}
		} else {
			int tensPlace = tens / 10; // 23 - 2, 3
			switch (tensPlace) {
				case 2:
					word = "twenty";
					break;
				case 3:
					word = "thirty";
					break;
				case 4:
					word = "fourty";
					break;
				case 5:
					word = "fifty";
					break;
				case 6:
					word = "sixty";
					break;
				case 7:
					word = "seventy";
					break;
				case 8:
					word = "eighty";
					break;
				case 9:
					word = "ninety";
					break;
			}
			
			int onesPlace = tens % 10;
			word = word + " " + getOnesWord(onesPlace);
		}
		
		return word;
	}
}
