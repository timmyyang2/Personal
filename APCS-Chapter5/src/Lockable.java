
public interface Lockable { //PROJECT 5.6

   public void setKey(int key);

   public void lock(int key);

   public void unlock(int key);

   public boolean locked();


}
