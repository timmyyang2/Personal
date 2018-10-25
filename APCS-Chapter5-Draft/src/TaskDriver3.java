public class TaskDriver3
{
   public static void main(String args[])
   {
      Task3 task1 = new Task3("Write another Java program");
      task1.setPriority(7);
      task1.setComplexity(Complexity.MAX_COMPLEXITY);

      Task3 task2 = new Task3("Eat");
      task2.setPriority(Priority.MIN_PRIORITY);
      task2.setComplexity(Complexity.MIN_COMPLEXITY);

      Task3 task3 = new Task3("Attend class");
      task3.setPriority(Priority.MAX_PRIORITY);
      task3.setComplexity(Complexity.MED_COMPLEXITY);

      Task3 task4 = new Task3("Sleep");
      task4.setPriority(4);
      task4.setComplexity(Complexity.MIN_COMPLEXITY);

      System.out.println("  TO-DO\n------------");
      System.out.println(task1.getName());
      System.out.println("\tpriority: " + task1.getPriority() + ", complexity: " + task1.getComplexity());
      System.out.println("");
      System.out.println(task2.getName());
      System.out.println("\tpriority: " + task2.getPriority() + ", complexity: " + task2.getComplexity());
      System.out.println("");
      System.out.println(task3.getName());
      System.out.println("\tpriority: " + task3.getPriority() + ", complexity: " + task3.getComplexity());
      System.out.println("");
      System.out.println(task4.getName());
      System.out.println("\tpriority: " + task4.getPriority() + ", complexity: " + task4.getComplexity());

      System.out.print("\nTASK:");
      if (task1.compareTo(task2) == 0)
         System.out.println(task1.getName() + " has the same priority as TASK:" + task2.getName());
      else
         if (task1.compareTo(task2) > 0)
            System.out.println(task1.getName() + " has greater priority than TASK:" + task2.getName());
         else
            System.out.println(task2.getName() + " has greater priority than TASK:" + task1.getName());

      System.out.print("\nTASK:");
      if (task3.compareTo(task4) == 0)
         System.out.println(task3.getName() + " has the same priority as TASK:" + task4.getName());
      else
         if (task3.compareTo(task4) > 0)
            System.out.println(task3.getName() + " has greater priority than TASK:" + task4.getName());
         else
            System.out.println(task4.getName() + " has greater priority than TASK:" + task3.getName());


   }
}

