import java.util.Scanner;
//task: to print digits from 0 to 50 with different loops
public class Lesson5 {

	public static void main(String[] args) {
		int a = 0;
		while (a < 50) {

			a++;
			System.out.println(a);
		}
		for (int i = 0; i <= 50; i++) {
			System.out.println(i);
		}

		int d;
		d = 0;
		do {
			d++;
			System.out.println(d);
		} while (d < 50);

	}

}
