import java.util.*;

public class Main
{
  public static void main (String[]args)
  {

    Scanner sc = new Scanner (System.in);
      System.out.println ("Enter the string");
    String b = sc.next ();

    StringBuilder a = new StringBuilder (b);

    //set Character
      a.setCharAt (2, 'a');
      System.out.println (a);

    // insert Character
      a.insert (1, 'W');
      System.out.println (a);

    // Delete Character
      a.delete (1, 2);
      System.out.println (a);

    // Append Character
      a.append (" Thakre");
      System.out.println (a);

    //String Length
      System.out.println (a.length ());

    //reverse a string
    for (int i = 0; i <= a.length () / 2; i++)
      {
	int front = i;
	int back = a.length () - 1 - i;

	char s = a.charAt (front);
	char e = a.charAt (back);

	  a.setCharAt (front, e);
	  a.setCharAt (back, s);
      }

    System.out.println (a);
  }
}
