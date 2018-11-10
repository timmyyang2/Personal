package chapter6;

	public class Contact implements Comparable
	{ //PROJECT 6.12
	   private String firstName, lastName, phone;

	   public Contact (String first, String last, String telephone)
	   {
	      firstName = first;
	      lastName = last;
	      phone = telephone;
	   }

	   public String toString ()
	   {
	      return lastName + ", " + firstName + "\t" + phone;
	   }

	   public int compareTo (Object other)
	   {
	      int result;

	      if (lastName.equals(((Contact)other).lastName))
	         result = firstName.compareTo(((Contact)other).firstName);
	      else
	         result = lastName.compareTo(((Contact)other).lastName);

	      return result;
	   }
}
