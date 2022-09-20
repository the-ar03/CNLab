// ClientAddressServer
import java.net.*;
import java.io.*;
class ClientAddressServer{
public static void main(String[] args) throws Exception{ 
ServerSocket s1 = new ServerSocket(8000);
System.out.println("Server Running");
Socket s2=s1.accept();
InetAddress a=InetAddress.getLocalHost();
String add=a.getHostAddress();
BufferedReader in=new BufferedReader(new 
InputStreamReader(s2.getInputStream()));
PrintWriter out=new PrintWriter(s2.getOutputStream(),true);
System.out.println("Client Connected");
System.out.println(s2);
out.println(add);
System.out.println("Client's IP is ");
System.out.println(in.readLine());
s1.close();
s2.close();
}
}



// ClientAddressClient
import java.net.*;
import java.io.*;
class ClientAddressClient{
public static void main(String[] args) throws Exception{
InetAddress a=InetAddress.getLocalHost(); 
Socket s2 = new Socket(a,8000);
String add=a.getHostAddress();
BufferedReader in=new BufferedReader(new 
InputStreamReader(s2.getInputStream()));
PrintWriter out=new PrintWriter(new 
OutputStreamWriter(s2.getOutputStream()),true);
System.out.println(in.readLine());
out.println(add);
s2.close();
}
}





// Server Algorithm:
// 1. Create instances for socket and ServerSocket class. 
// 2. Use the port 9000 for TCP. 
// 3. Make the PrintStream object connect to the OuputStream using Socket. 
// 4. Create an instance of the Date class and write it into the Socket. 
// 5. Get the IP address of the client using the socket and getInetAddress (). 
// 6. Print the client’s IPAddress.


// Client Algorithm:
// 1. Create instances for socket class with the port number 9000. 
// 2. Create an object of DataInputStream and make it to get data from server through the socket. 
// 3. Read the Date object. 
// 4. Print the obtained date.
