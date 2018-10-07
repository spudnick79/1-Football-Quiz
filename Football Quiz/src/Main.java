import java.util.Scanner;

// Nickolas Gadomski
// A Football Quiz with 2 modes Easy-simple and Hard-statistic Quiz
public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to the Football Quiz Game!");
		System.out.println("Choose your mode, either Easy or Hard");
		
		int selection;
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a menu selection");
	    System.out.println("1. Easy");
	    System.out.println("2. Hard");
	    selection = scan.nextInt();
	    
	    //Questions For Easy
	    String Q1 = "How many receivers has Tom Brady Thrown a TD too in his career?/n"
	    		+ "(a)73/n(b)71/n(c)69/n";
	    String Q2 = "How many superbowls have the Eagles won?/n"
	    		+ "(a)1/n(b)5/n(c)3";
	    
	    Question [] questions = {	//creates an array for questions
    			new Question(Q1, "b"),
    			new Question(Q2, "a")
	    };
	    takeTest(questions);
	    
	    switch (selection){
	    case 1:
	    	public static void takeTest(Question[] questions) {	//added method to start easy mode test
	    		int score = 0;
	    		Scanner keyboardInput = new Scanner(System.in);
	    		
	    		for(int i = 0; i < questions.length; i++){	//created for loop to add score
	    			System.out.println(questions[i].prompt);
	    			String answer = keyboardInput.nextLine();
	    			if(answer.equals(questions[i].answer));
	    				score++;
	    		}
	    		
	    	System.out.println("You got " + score + "/" + questions.length);
	    	}
	    break;
	    case 2:
	    	
	    }

	    	
	
	
	    
	    
	}	
}
	
	  
	
	    
	    
	
	    
	    
	    
		

