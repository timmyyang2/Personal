
public class Task implements Priority { //PROJECT 5.3
	
   private int priority;
   private String name = "Timothy";

   public Task(String task) {
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
}
