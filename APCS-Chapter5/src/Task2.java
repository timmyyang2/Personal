
public class Task2 implements Priority, Complexity { //PROJECT 5.4
	
   private int priority;
   private String name;
   private int complexity;

   public Task2(String task) {
      this.name = name;
      this.priority = MIN_PRIORITY;
   }

   public String getName() {
      return name;
   }

   public void setPriority(int num) {
      priority = num;
   }

   public int getPriority() {
      return priority;
   }
   
   public void setComplexity(int complexity) {
      this.complexity = complexity;
   }
   
   public int getComplexity() {
      return complexity;
   }
}

