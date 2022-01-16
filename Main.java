/*
AP Computer Science A
Programmers: Hemang Shankar
Date: 1/4/2022
*/

//Imports the scanner class
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Creates a string array of size 20
    String[] answerArray = new String[20];
  
    //Create a scanner objct
    Scanner myObj = new Scanner(System.in); 

    //Allows user to familiarize themselves with the correct input needed for the program
    System.out.println("\nThe valid answers are A, B, C, D, E");
    System.out.println("\nHit Enter/Blank if you don't have an answer");

    //Ask user to enter the student's answers one at a time
    for (int i = 0; i < 20; i++){
      System.out.println("\nWhat is the student's answer for question number " + (i+1) + "? ");
      String answer = myObj.nextLine();

      //If users input is not applicable with the correct input required for student answer
      if(!answer.isEmpty())
      {
         if ((!answer.equalsIgnoreCase("A")) && (!answer.equalsIgnoreCase("B")) && (!answer.equalsIgnoreCase("C")) && (!answer.equalsIgnoreCase("D"))&& (!answer.equalsIgnoreCase("E"))){
            System.out.println("\nThe valid answers are A, B, C, D, E, or blank");
            System.out.println("\nWhat is the student's answer for " + (i+1) + "? ");
            answer = myObj.nextLine();
         }
      }
      answerArray[i] = answer;
      System.out.println("");
    }

    //Creates a UnitTest object 
    UnitTest answers = new UnitTest(answerArray);

    //Displays the correct answers and student answers
    System.out.println(answers.toString());

    //Displays amount student's correct and incorrect answers
    System.out.println("\nNumber of Correct Answers: " + answers.totalCorrect());
    System.out.println("\nNumber of Mistakes: " + answers.totalMistakes());

    //Displays if the student passed or failed
    if(answers.isPassing() == true){
      System.out.println("The student PASSED");
    }
    else{
      System.out.println("The student FAILED");
    }

    //Closes the scanner
    myObj.close();
  }
}
