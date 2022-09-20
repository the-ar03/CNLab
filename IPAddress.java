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



// IPAddress Algorithm:
// 1. Start
// 2. Import the required packages.
// 3. Create a class IPAddress.
// 4. Inatialize InetAddredd class and create object addr.
// 5. Get IPAddress of the system using getHostAddress() method.
// 6. Print the IPAddress.
// 7. Get hostname of the system using getHostName() method
// 8. Print the hostname.
// 9. Stop
