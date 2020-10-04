package lab_2_example_04;

import java.util.Scanner;

public class lab_2_example_04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the integer:");
		int a = in.nextInt();
		if (a>=5 && a<=10) {
			System.out.println("The number falls in the range from 5 to 10 inclusive");
		}
			else {
				System.out.println("The number does not fall in the range from 5 to 10 inclusive");
			}

	}

}
