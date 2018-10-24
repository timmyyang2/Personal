
public class TaskDriver { //PROJECT 5.5 MAY NOT BE FINISHED
	
   public static void main(String args[]) {
      Task task = new Task("Shower");
      task.setPriority(Priority.MIN_PRIORITY);
      Task task2 = new Task("Eat Breakfast");
      task2.setPriority(Priority.MAX_PRIORITY);
      Task task3 = new Task("School");
      task3.setPriority(2);
      Task task4 = new Task("Homework");
      task4.setPriority(4);
      System.out.println(task.getName() + " priority: " + task.getPriority());
      System.out.println(task2.getName() + " priority: " + task2.getPriority());
      System.out.println(task3.getName() + " priority: " + task3.getPriority());
      System.out.println(task4.getName() + " priority: " + task4.getPriority());
   }
}
