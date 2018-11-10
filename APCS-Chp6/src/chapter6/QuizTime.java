package chapter6;

public class QuizTime { //PROJECT 6.9
	
	public static void main(String[] args) {
      Quiz quiz = new Quiz();
      quiz.add(new Question("What is my favorite class?", "Comp Sci"));
      quiz.add(new Question("What is thanos car?", "meme"));
      quiz.add(new Question("What's my favorite programming language?", "Fortran"));
      quiz.add(new Question("Tom Brady or Aaron Rodgers?", "Nate Peterman"));
      quiz.add(new Question("Thanos is coming", "Bruce Banner"));	
      quiz.play();
      System.out.print("\nResults:\n\tCorrect: " + quiz.getNumCorr());
      System.out.println("\tIncorrect: " + quiz.getNumWrong());
	}
}
