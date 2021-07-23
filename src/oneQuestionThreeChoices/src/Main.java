import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
       String question = "What year was the American Civil War?";
       String choiceOne = "1900";
       String choiceTwo = "1861";
       String choiceThree = "1764";

       String correctAnswer = choiceTwo;


       System.out.println(question);
       System.out.println("Choose one of the following: " +choiceOne+" "+ choiceTwo+" or "+ choiceThree);
       Scanner scanner = new Scanner(System.in);
       String input = scanner.next();
       if(correctAnswer.equals(input)) {
          System.out.println("Congratulations! Thats the correct answer");
       } else {
          System.out.println("You are incorrect, the correct answer is"+ " "+ correctAnswer);
       }




        // Write a print statement asking the question
        // Write a print statement giving the answer choices

        // Have the user input an answer
        // Retrieve the user's input

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is
        // incorrect as well as what the correct choice was.

    }
}