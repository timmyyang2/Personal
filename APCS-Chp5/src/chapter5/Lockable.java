package chapter5;

public interface Lockable { //PROJECT 5.6

   public void setKey(int key); //setKey method definition

   public void lock(int key); //lock method definition

   public void unlock(int key); //unlock method definition

   public boolean locked(); //locked boolean method


}
