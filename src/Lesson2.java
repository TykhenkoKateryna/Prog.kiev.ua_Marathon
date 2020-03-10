import java.util.Scanner;

public class Lesson2 {

	public static void main(String[] args) {
		
		Scanner FirstScanner = new Scanner(System.in);
		System.out.println("Enter int number: ");
		int number1 = FirstScanner.nextInt();
		System.out.println("Enter int number: ");
		int number2 = FirstScanner.nextInt();

		int res = (int) (number1 + number2);
		System.out.println(res);
		int res1 = (int) (number1 - number2);
		System.out.println(res1);
		int res2 = (int) (number1 * number2);
		System.out.println(res2);
		float res3 = (float) number1 / number2;
		System.out.println(String.format("%2.2f", res3).replace(',', '.') + "\n");

		System.out.println("Enter float number: ");
		float float1 = FirstScanner.nextFloat();
		System.out.println("Enter float number: ");
		float float2 = FirstScanner.nextFloat();

		
		float resf = (float) (float1 + float2);
		System.out.println(String.format("%2.2f", resf).replace(',', '.') + "\n");
		float resf1 = (float) (float1 - float2);
		System.out.println(String.format("%2.2f", resf1).replace(',', '.') + "\n");
		float resf2 = (float) (float1 * float2);
		System.out.println(String.format("%2.2f", resf2).replace(',', '.') + "\n");
		float resf3 = (float) float1 / float2;
		System.out.println(String.format("%2.2f", resf3).replace(',', '.') + "\n");
		FirstScanner.close();
	}

}
