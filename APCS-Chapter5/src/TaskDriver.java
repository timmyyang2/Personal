
public class TaskDriver { //PROJECT 5.5 driver class for task
	
   public static void main(String args[]) {
	  Task task1 = new Task("eat");
      task1.setPriority(7);
      task1.setComplexity(10);

      Task task2 = new Task("sleep");
      task2.setPriority(1);
      task2.setComplexity(1);

      System.out.println(task1.getName());
      System.out.println("priority: " + task1.getPriority() + " complexity: " + task1.getComplexity());
      System.out.println("");
      System.out.println(task2.getName());
      System.out.println("priority: " + task2.getPriority() + " complexity: " + task2.getComplexity());
      System.out.println("");

      if (task1.compareTo(task2) == 0) {
         System.out.println(task1.getName() + " is same priority as " + task2.getName());
      }else if (task1.compareTo(task2) > 0) {
            System.out.println(task1.getName() + " has more priority than " + task2.getName());
      }else {
            System.out.println(task2.getName() + " has more priority than " + task1.getName());
      }
   }
}
