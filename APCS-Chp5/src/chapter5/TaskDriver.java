package chapter5;

public class TaskDriver { //PROJECT 5.5 driver class for task
	
   public static void main(String args[]) { //main method
	  Task task1 = new Task("eat"); //new Task object task 1 with parameter eat
      task1.setPriority(1); //set the priority to 1
      task1.setComplexity(5); //set the complexity to 5

      Task task2 = new Task("sleep"); //new Task object task2 with parameter sleep
      task2.setPriority(2); //set the priority to 2
      task2.setComplexity(1); //set the complexity to 1

      System.out.println(task1.getName()); //prints out task name
      System.out.println("priority: " + task1.getPriority() + " complexity: " + task1.getComplexity()); //prints out the priority and complexity
      System.out.println(""); //space
      System.out.println(task2.getName()); //prints out task name
      System.out.println("priority: " + task2.getPriority() + " complexity: " + task2.getComplexity()); //prints out the priority and complexity

      if (task1.compareTo(task2) == 0) { //if both tasks are the same
         System.out.println(task1.getName() + " is same priority as " + task2.getName()); //prints out same priority
      }else if (task1.compareTo(task2) > 0) { //if task1 is greater than task 2
            System.out.println(task1.getName() + " has more priority than " + task2.getName()); //prints out task1 has more priority
      }else {
            System.out.println(task2.getName() + " has more priority than " + task1.getName()); //prints out task2 has more priority
      }
   }
}
