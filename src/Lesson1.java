import java.util.Scanner;

public class Lesson1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter text 1: ");
		String S1 = scanner.next();
		System.out.println("Enter text 2: ");
		String S2 = scanner.next();
		System.out.println("Enter text 3: ");
		String S3 = scanner.next();
		
		System.out.println(S1 + " "+ S3);
		System.out.println(S3 + " "+S2+" " + S1);
		System.out.println(S1 + " "+S2 +" "+ S3);

		scanner.close();
	}

}
