import java.util.Scanner;
public class Lesson4_1 {

	public static void main(String[] args) {
		
		int a;
		int b;
		Scanner FirstScanner = new Scanner(System.in);
		System.out.println("Enter int number 1: ");
		int number1 = FirstScanner.nextInt();
		System.out.println("Enter int number 2: ");
		int number2 = FirstScanner.nextInt();
		if (number1 > number2) {
			 a= number1;
		}else { a= number2;}
		
		System.out.println("Enter int number 3: ");
		int number3 = FirstScanner.nextInt();
		System.out.println("Enter int number 4: ");
		int number4 = FirstScanner.nextInt();
		
		if (number3 > number4) {
			 b = number3;
		}else {  b= number4;}
		if (a>b) {
			System.out.println(a);
		}else System.out.println(b);
		FirstScanner.close();

	}

}
