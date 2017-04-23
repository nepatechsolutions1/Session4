
public class NestedForExample {

	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for (int i=0; i<5; i++) {
			for (int j=5; j>i; j--) {
				System.out.print("*");
				
				if (j==4) {
					break;
				}
			}
			System.out.println();
		}
	}

}
