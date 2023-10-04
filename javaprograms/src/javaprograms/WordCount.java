package javaprograms;

import java.util.Scanner;

public class WordCount {

		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a sentence or text: ");
	        String inputText = scanner.nextLine();

	        // Split the input text into words using space as the delimiter
	        String[] words = inputText.split(" ");

	        // Count the number of words
	        int wordCount = words.length;

	        System.out.println("Word count: " + wordCount);

	        // Close the scanner when done
	        scanner.close();
	    }
	}
