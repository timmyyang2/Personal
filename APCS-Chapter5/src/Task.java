
public class Task implements Priority, Complexity, Comparable { //COVERS PROJECT 5.3-5.5
	
   private int priority; //priority variable (5.3)
   private String name; //name variable (5.3)
   private int complexity; //complexity variable (5.4)

   public Task(String name) { //class constructor (5.3)
      this.name = name; //assigns this name to name (5.3)
      this.priority = 1; //assigns this priority to 1 (5.3)
   }

   public String getName() { //getName method (5.3)
      return name; //returns name (5.3)
   }

   public void setPriority(int num) { //setPriority method (5.3)
      priority = num; //sets priority as num (5.3)
   }

   public int getPriority() { //getPriority method (5.3)
      return priority; //returns priority (5.3)
   }
   
    public void setComplexity(int complexity) { // setComplexity method (5.4)
       this.complexity = complexity; //assigns this complexity to complexity (5.4)
    }
   
    public int getComplexity() { //getComplexity method (5.4)
       return complexity; //returns complexity (5.4)
    }
    
    public int compareTo(Object rational){ //implements comparable interface (5.5)
      Task r = (Task)rational; //assigns Task r to (Task)rational (5.5)
      if (r.priority == this.priority) { //if both priorities are equal (5.5)
         return 0; //return 0 (5.5)
      }else if (r.priority > this.priority) { //else if the first priority is greater (5.5)
            return -1; //return -1 (5.5)
      }else { //else (5.5)
            return 1; //return 1 (5.5)
      }
   }
}
