
public class SwitchExample {

	public static void main(String[] args) {
		
		char grade  = 'Z';
		
		switch(grade) {
			case 'A':
				System.out.println("Excellend score.. keep it up");
				break;
			case 'B':
				System.out.println("Good score, keep it up");
				break;
			case 'C':
			case 'D':
				System.out.println("Poor score, study hard");
				break;
			case 'F':
				System.out.println("You failed!!!!!!");
				break;
			default:
				System.out.println("Invalid score");
				break;
		}

	}

}
