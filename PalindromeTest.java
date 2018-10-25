import java.util.Stack;
import java.util.Scanner;

public class PalindromeTest {

    public static void main(String[] args) {
		
		boolean testing = true;
		Scanner input = new Scanner(System.in);
        Stack<Character> stack = new Stack<Character>();
		
		while(testing==true){
			
			System.out.print("Enter any string:");
			String inputString = input.nextLine();
			String reverseInput = "";
			
			for (int i = 0; i < inputString.length(); i++) {
				stack.push(inputString.charAt(i));
			}

			while (!stack.isEmpty()) {
				reverseInput += stack.pop();
			}

			if (inputString.equals(reverseInput)){
				System.out.println("Yes, '" + inputString + "' is a palindrome.");
			}
			else{
				System.out.println("No, '" + inputString + "' is not a palindrome.");
			}
			
			System.out.print("Test another palindrome(Y/N): ");
			String answer = input.nextLine();
			testing = answer.equalsIgnoreCase("y");
		}
    }
}