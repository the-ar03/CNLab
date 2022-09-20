// ChatServer
import java.net.*;
import java.io.*;
import java.util.*;
public class ChatServer extends Thread{
public static void main(String arg[])throws Exception{
ServerSocket ssocket=new ServerSocket(4000);
Socket csocket=ssocket.accept();
BufferedReader br=new BufferedReader(new 
InputStreamReader(csocket.getInputStream()));
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
PrintWriter out=new PrintWriter(csocket.getOutputStream(),true);
String s,t;
try{
    while(true){
System.out.println("server");
s=in.readLine();
out.println("server:"+s);
System.out.println(br.readLine());
}
}
catch(IOException e){
System.out.println("client has closed");
}
}
}




// ChatClient
import java.net.*;
import java.io.*;
public class ChatClient{
public static void main(String arg[])throws Exception{
Socket s=new Socket(InetAddress.getLocalHost(),4000);
BufferedReader br=new BufferedReader(new 
InputStreamReader(s.getInputStream()));
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
PrintWriter out=new PrintWriter(s.getOutputStream(),true);
String input,t;
while(true){
System.out.println("client");
out.println("client:"+in.readLine());
System.out.println(br.readLine());
}
}
}




// Server Algorithm:
// 1. Instances of vector class is used to keep track of number of clients that can be connected and currently logged. 
// 2. The method that is responsible for sending the message to the clients is made synchronized. 
// 3. Server is capable of keeping into account the number of users. It adds and removes the client from the vector list as and when the connections are established and terminated.


// Client Algorithm:
// 1. The client receives the name of the user and message of that user and sends it to client. Server then passes it on to all clients connected.
