package Array;

import java.util.ArrayList;
import java.util.Scanner;

//Ask the user for 5 numbers and store them in an array list. 
//Then find the sum, product, largest, and smallest of those numbers.

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Prompting user for a response
		System.out.println("Enter an integer:");
		// Accept user input
		Scanner input = new Scanner(System.in);
		// Declare array list variable
		ArrayList<Integer> userNumbers = new ArrayList<>();
		// Take input from user
		// For loop prompting for 5 numbers
		for (int i = 0; i < 5; i++) {
			int num = input.nextInt();
			// System taking in user number typed in and putting it back out
			System.out.println("The number you entered is: " + num);
			// Add user number to array list
			userNumbers.add(num);
		}
		input.close();
		// Print out list of numbers users input
		System.out.println(userNumbers);
		// Declaring variables for application
		int sum = 0;
		int product = 1;
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		// Sum
		for (int i = 0; i < userNumbers.size(); i++) {
			sum = sum + userNumbers.get(i);

		}
		// Output of sum of numbers put in by user
		System.out.println("Sum of numbers is: " + sum);
		// Product
		for (int i = 0; i < userNumbers.size(); i++) {
			product = product * userNumbers.get(i);
		}
		// Output of product
		System.out.println("Product of numbers is: " + product);
		// Largest
		for (int i = 0; i < userNumbers.size(); i++) {
			// largest = largest + userNumbers.get(i);
			// if-then statement
			if (userNumbers.get(i) > largest) {
				largest = userNumbers.get(i);
			}
		}
		// Output of largest
		System.out.println("The largest of numbers is: " + largest);

		// Output of smallest
		for (int i = 0; i < userNumbers.size(); i++) {
			// if-then statement
			if (userNumbers.get(i) < smallest) {
				smallest = userNumbers.get(i);
			}
		}
		// Output of smallest
		System.out.println("The smallet of numbers is: " + smallest);
	}

}
