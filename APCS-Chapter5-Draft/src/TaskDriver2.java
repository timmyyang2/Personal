public class TaskDriver2
{
   public static void main(String args[])
   {
      Task2 task1 = new Task2("Write another Java program");
      task1.setPriority(7);
      task1.setComplexity(Complexity.MAX_COMPLEXITY);

      Task2 task2 = new Task2("Eat");
      task2.setPriority(Priority.MIN_PRIORITY);
      task2.setComplexity(Complexity.MIN_COMPLEXITY);

      Task2 task3 = new Task2("Attend class");
      task3.setPriority(Priority.MAX_PRIORITY);
      task3.setComplexity(Complexity.MED_COMPLEXITY);

      Task2 task4 = new Task2("Sleep");
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

   }
}
