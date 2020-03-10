import java.util.Scanner;

public class Lesson3_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		
		for (int i=0; i< s.length();i++) {
			char c = s.charAt(i);
			System.out.print(c + " ");
			scanner.close();
		}
	}

}
