package lab_2_example_06;

import java.util.Scanner;

public class lab_2_example_06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the integer:");
		int a = in.nextInt();
		int result = (a / 8) % 8;
		System.out.println("The second digit on the right is the octal representation of the number: " +result);

	}

}
