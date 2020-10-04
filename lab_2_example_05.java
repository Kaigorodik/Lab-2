package lab_2_example_05;

import java.util.Scanner;

public class lab_2_example_05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the integer:");
		int a = in.nextInt();
		int result = ((a / 1000) % 10);
	
		System.out.println("The fourth digit on the right in the decimal representation of the number: " +result);

	}

}
