package chapter6;

import java.util.Scanner;

public class Quiz { //PROJECT 6.9

   private final int MAX = 25;

   private Question[] questions;

   private int current;
   private int corr;
   private int wrong;

   public Quiz() {
	  questions = new Question[MAX];
	  current = 0;
	  corr = 0;
   }

   public void add(Question question) {
      if(current < MAX) {
         questions[current++] = question;
      }
   }

   public void play() {
      Scanner scan = new Scanner (System.in);
      for(int i = 0; i < current; i++) {
         System.out.println(questions[i].getQuestion());
         if(questions[i].answerCorrect(scan.nextLine())) {
            corr++;
         }else {
            wrong++;
         }
      }
   }

   public int getNumCorr() {
      return corr;
   }

   public int getNumWrong() {
      return wrong;
   }
}
