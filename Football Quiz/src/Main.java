import java.util.Scanner;
import java.util.Random;

// Nickolas Gadomski
// A Football Quiz with 2 modes Easy-simple and Hard-statistic Quiz
// Data types used: String for questions, Char random for loop
public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to the Football Quiz Game!");
		System.out.println("Choose your mode, either Easy or Hard");

		int selection; // integer cast on selection variable
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a menu selection");
		System.out.println("1. Easy");
		System.out.println("2. Hard");
		selection = scan.nextInt();
		scan.nextLine();
		
		
		switch (selection) {
		case 1:
			
			// Questions For Easy
			
			String Q1 = "How many receivers has Tom Brady Thrown a TD too in his career?\n" + "(a)73\n(b)71\n(c)69\n";
			String Q2 = "How many superbowls have the Eagles won?\n" + "(a)1\n(b)5\n(c)3";
			String randomString = "";
			int length = 3;
			Random rand = new Random();	//random class for question strings
			char[] text  = new char[length];	//character array
			
			for (int i = 0; i < length; i++){		//for loop for length 
				text[i] = Q1.charAt(rand.nextInt(Q1.length()));
			}
				
			for (int i = 0; i < text.length; i++){	//for loop for text
				randomString += text[i];
				}
			
			final String[] answers = new String[2];	//creates an array for answers //finals used to keep arrays constant
			answers[0] = "b";
			answers[1] = "a";
			
			final String[] questions = new String[2]; // creates an array for questions
			questions[0] = Q1;
			questions[1] = Q2;
			
			takeTest(questions, scan); // call to array of questions
			break;	
			
		}
	}
	//takeTest method header and String and Scanner parameter
	public static int takeTest(String[] answers, Scanner keyboardInput) { // added method to start easy mode test
		int score = 0;
		for (int i = 0; i < answers.length; i++) { // created for loop to add score
			
			System.out.println(answers[i]);
			String userAnswers = keyboardInput.nextLine();
			if (userAnswers.equals(answers[i])) {

			score++;	//++ used to increment score
			
			}
			
		}System.out.println("You got " + score + "/" + answers.length);
		return score; // return score from method
		
	}
}
