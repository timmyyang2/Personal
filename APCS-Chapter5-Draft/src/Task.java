
public class Task implements Priority { //PROJECT 5.3
	
   private int priority; //priority variable
   private String name = "Timothy"; //initializes name as Timothy

   public Task(String task) { //class constructor
      this.name = name; //assigns this name to name
      this.priority = 1; //assigns this priority to 1
   }

   public String getName() { //getName method
      return name; //returns name
   }

   public void setPriority(int num) { //setPriority method
      priority = num; //sets priority as num
   }

   public int getPriority() { //getPriority method
      return priority; //returns priority
   }
}
