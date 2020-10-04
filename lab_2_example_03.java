package lab_2_example_03;

import java.util.Scanner;

public class lab_2_example_03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the integer:");
		int a = in.nextInt();
		if (a%4==0 && a>10) {
			System.out.println("The number meets the specified criteria");
		}
			else {
				System.out.println("The number does not meet the specified criteria");
			}

	}

}
