//task: get numbers from 1 to 60, that are divided by 6 and then 4
public class Lesson6 {
	public static void main(String[] args) {

		for (int i = 1; i <= 60; i++) {
			if (i % 6 == 0)
				System.out.print(i + " ");
		}
		System.out.println(" ");
		for (int a = 4; a <= 60; a += 4) {
			System.out.print(a + " ");
		}
	}
}
