
public class Task3 implements Priority, Complexity, Comparable { //PROJECT 5.5
	
	private int priority;
	private String name;
	private int complexity;

	public Task3(String task) {
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
    
    public int compareTo(Object rational){
      Task3 r = (Task3)rational;
      if (r.priority == this.priority) {
         return 0;
      }else if (r.priority > this.priority) {
            return -1;
      }else {
            return 1;
      }
   }
}
