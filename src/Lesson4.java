import java.util.Scanner;

public class Lesson4 {

	public static void main(String[] args) {
		Scanner FirstScanner = new Scanner(System.in);
		int userNumber;
		int maxNumber =-10000; //initialize max number with some random int. It will be redefined on first iteration of for loop anyway
		for (int i = 1; i <= 4; i++) { //We will ask for 4 numbers
			System.out.println("Enter int number "+ i +": ");
			userNumber = FirstScanner.nextInt();
			if (userNumber>maxNumber || i==1) { //in case user number is larger then max number it becomes new max number. First user number always = max number
				maxNumber = userNumber;
			}
		}
		System.out.println("Largest number is " + maxNumber); //output max number
		FirstScanner.close(); 
		
		}
	}


