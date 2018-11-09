package chapter6;

public class Grade { //PROJECT 6.7
	
	      private String grade;
	      private int cutoff;

	      public Grade(String gradeString, int cutoffValue) {
	         this.grade = gradeString;
	         this.cutoff = cutoffValue;
	      }

	      String getGrade() {
	    	  return grade;
	      }
	      
	      int getCutoff() {
	    	  return cutoff;
	      }

}
