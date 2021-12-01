/** 
    Created by Spencer Kinney
    IT386 Homework 05
    Dr. Rosangela Follmann
*/
import java.rmi.*;
import java.rmi.server.*;

public class ComputeImpl extends UnicastRemoteObject implements Compute {
  ComputeImpl() throws RemoteException {}
  /** Returns sum of two long integers */
  public long add (long a, long b) throws RemoteException {
    return a + b;
  }
  /** Returns difference of two long integers */
  public long subtract (long a, long b) throws RemoteException {
    return a - b;
  }
  /** Returns product of two long integers */
  public long multiply (long a, long b) throws RemoteException {
    return a * b;
  }
  /** Returns integer floor quotient of two long integers */
  public long divisionWithFloor (long a, long b) throws RemoteException {
    return a / b;
  }
  /** Returns greatest common divisor of two long integers using Euclidean Algorithm */
  public long gcd (long a, long b) throws RemoteException {
    if (b == 0) return a;
    return gcd (b, a % b);
  }
}