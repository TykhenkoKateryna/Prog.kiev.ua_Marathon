import java.util.Scanner;

public class Lesson4_2 {

	public static void main(String[] args) {
		Scanner FirstScanner = new Scanner(System.in);
		int max = 0;
		int n = 4;
		while (n>0) {
			int x = FirstScanner.nextInt();
			if (x>max)
				max = x;
			n--;
			}
		System.out.println(max);
		FirstScanner.close();
		}
				
	}


