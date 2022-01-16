  class UnitTest{ 
  
  //Instance variables 
  private String[] answerKey = {"B", "D", "C", "A", "E", "A", "B", "A", "E", "B", "B", "E", "E", "D", "D", "A", "C", "C", "A", "E"};
  private String[] studentAns;
  private int totalAnswers;
  
  //Constructor that copies each element from the parameter into the studentAns array 
  public UnitTest(String[] answers){
    totalAnswers = answers.length;
    studentAns = new String[totalAnswers];
    for(int i = 0; i < totalAnswers; i++){
      studentAns[i] = answers[i].toUpperCase();
    }
  }

  //Accesor method for student answer
  public String[] getStudentAns(){
    return studentAns;
  }

  //Returns the number of correctly answered questions by the student 
  public int totalCorrect(){
    int correctAnswers = 0;
    for (int i = 0; i < totalAnswers; i++){
      if ((!answerKey[i].isEmpty()) && (answerKey[i].equals(studentAns[i]))){
        correctAnswers++;
      }
    }
    return correctAnswers;
  }

  //Returns the number of incorrectly answered questions by the student 
  public int totalMistakes()
  {
    return (answerKey.length - totalCorrect());
  }

  //Checks if student passed or failed the exam - using ternary operator
  public boolean isPassing(){
    return (totalCorrect() >= 14)?true:false;
  }

  //Displays 2 columns with the corrent answers and the student's answers
  public String toString(){
    String titleString = "ANSWER KEY\tStudent's Answers";
    String compareAnswer = "";
    for (int i = 0; i < answerKey.length; i++){
      compareAnswer += (i+1) + ") " + answerKey[i] + "\t\t" + (i+1)+") "+ studentAns[i] + "\n";
    }
    return(titleString +"\n"+compareAnswer);
  }
}