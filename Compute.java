/** 
    Created by Spencer Kinney
    IT386 Homework 05
    Dr. Rosangela Follmann
*/
import java.rmi.*;

public interface Compute extends Remote {
  long add (long a, long b) throws RemoteException;
  long subtract (long a, long b) throws RemoteException;
  long multiply (long a, long b) throws RemoteException;
  long divisionWithFloor (long a, long b) throws RemoteException;
  long gcd (long a, long b) throws RemoteException;
}