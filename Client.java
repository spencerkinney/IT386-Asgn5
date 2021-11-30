/** 
    Created by Spencer Kinney
    IT386 - Homework 05
    Dr. Rosangela Follmann
*/
import java.rmi.Naming;

/** Client class that will use the remote service */
public class Client{
  
public static void main (String[] args) {
    try {
      long a = Long.parseLong(args[0]);
      long b = Long.parseLong(args[1]);
      Compute obj =
        (Compute) Naming.lookup("//localhost/Server");
      System.out.println ("The sum of "+a+" and "+b+":" + obj.add(a, b));
      System.out.println ("The difference of "+a+" and "+b+":" + obj.subtract(a, b));
      System.out.println ("The product of "+a+" and "+b+":" + obj.multiply(a, b));
      System.out.println ("The integer quotient of "+a+" and "+b+":" + obj.divisionWithFloor(a, b));
      System.out.println ("The GCD of "+a+" and "+b+":" + obj.gcd(a, b));

    } catch (Exception e) {
      System.out.println ("Client exception: " + e);
      System.out.println ("Make sure you the proper format:");
      System.out.println ("java Client <a> <b>");
    }
  }
}