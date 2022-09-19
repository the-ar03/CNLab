// Find IP Address of the system.

import java.net.InetAddress;
public class IPAddress{
    public static void main(String []args) throws Exception{
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println("Local Host Address: " + addr.getLocalHost());
        String hostname = addr.getHostName();
        System.out.println("Local Host Name: " + hostname);
    }
}