// creation of UDP server

// UDPServer
import java.net.*;
import java.io.*;
public class UDPServer{
public static int client=789;
public static int server=790;
public static void main(String arg[]) throws IOException{
String s;
InetAddress id=InetAddress.getLocalHost();
BufferedReader dis=new BufferedReader(new InputStreamReader(System.in));
DatagramSocket ds=new DatagramSocket(server);
byte b[]=new byte[1024];
System.out.println("Server Side.... Sending....");
System.out.println("\n"+id);
while(true){
s=dis.readLine();
if(s.equals("end")){
b=s.getBytes();
DatagramPacket dp=new DatagramPacket(b,s.length(),id,client);
ds.send(dp);
break;
}
else{
b=s.getBytes();
DatagramPacket dp=new DatagramPacket(b,s.length(),id,client);
ds.send(dp);
}
}
}
}


// UDPClient
import java.net.*;
import java.io.*;
public class UDPClient{
public static int client=789;
public static void main(String args[]) throws IOException{
DatagramSocket ds=new DatagramSocket(client);
byte b[]=new byte[1024];
System.out.println("client....receiving....");
while(true){
DatagramPacket dp=new DatagramPacket(b,b.length);
ds.receive(dp);
String s=new String(dp.getData(),0,dp.getLength());
if(s.equals("end")) break;
else System.out.println(s);
}
}
}




// Server Algorithm:
// 1.Create a new Datagram Socket. 
// 2.Create a new Datagram packet. 
// 3.Create a message to be sent. 
// 4.Convert into bytes 
// 5.create a packet 
// 6.send packet 
// 7.wait for acknowledgement from client 
// 8.print data from client 
// 9.stop the program 


// Client Algorithm:
// 1. Create new Datagram Socket. 
// 2.Create new Datagram packet. 
// 3.Get the packet. 
// 4.Print the content. 
// 5.Create a new packet. 
// 6.send to server 
// 7.Stop the program.
