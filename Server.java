/** 
    Created by Spencer Kinney
    IT386 Homework 05
    Dr. Rosangela Follmann
*/
import java.rmi.Naming;

public class Server {
    public static void main(String args[])
    {
        try
        {
            /* Creating new remote object and binding the name */
            ComputeImpl obj = new ComputeImpl();
            Naming.rebind("//localhost/Server", obj);
            System.out.println("Server is ready");
        }
        catch (Exception e)
        {
            System.out.println("Server failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}