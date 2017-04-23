import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		int i = 1;
		while (i<=5) {
			System.out.println(i);
			i++;
		}
		
		
		
		//'q' to quit	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter name, press q to quit");
		String name = input.nextLine();
		
		while (!name.equals("q")) {
			System.out.println("You entered: " + name);
			name = input.nextLine();
		}
		
		System.out.println("Thanks you. Program quiting");
		
		input.close();
	}
}
