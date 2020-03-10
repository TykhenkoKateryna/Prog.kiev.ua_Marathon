import java.util.Scanner;

public class Lesson3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String StringNumber = "";
		int NumberLength = 0;
		while (NumberLength != 5) {
			System.out.println("Enter int number with 5 digits: ");
			int number = scanner.nextInt();
			StringNumber = "" + number;
			NumberLength = StringNumber.length();
		}
		for (int i = 0; i < NumberLength; i++) {
			String sub1 = StringNumber.substring(i, i + 1);
			int sub2 = Integer.parseInt(sub1);
			System.out.print(sub2 + " ");
			
		}

		scanner.close();
	}

}
