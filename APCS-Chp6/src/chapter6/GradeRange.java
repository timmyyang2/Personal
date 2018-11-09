package chapter6;

public class GradeRange { //PROJECT 6.7
	
	   public static void main (String[] args)
	   {
	      String[] gradeString = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-",
	                         "D+", "D", "D-", "F"};

	      int[] cutoff = {95, 90, 87, 83, 80, 77, 73, 70, 67, 63, 60, 0};

	      final int num = 12;

	      Grade[] grades = new Grade[num];

	      for (int i=0; i<num; i++)
	         grades[i] = new Grade (gradeString[i], cutoff[i]);

	      for (int level = 0; level < num; level++)
	         System.out.println (grades[level].getGrade() + "   " + grades[level].getCutoff());
	   }
}
