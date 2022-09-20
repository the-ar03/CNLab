// DateTimeServer
import java.net.*;
import java.io.*;
import java.util.*;
public class DateTimeServer extends Thread{
public static void main(String[] args) throws Exception{ 
ServerSocket sSocket = new ServerSocket(1000);
Socket cSocket=sSocket.accept();
BufferedReader br=new BufferedReader(new 
InputStreamReader(cSocket.getInputStream()));
PrintWriter out=new PrintWriter(cSocket.getOutputStream(),true);
Date d = new Date();
try
{
while(true)
{
d= new Date();
out.println("Time at server;" +d.toString());
System.out.println(br.readLine());
sleep(1000);
}
}
catch(IOException e)
{
System.out.println("----Client has Closed-----");
}
}
}



// DateTimeClient
import java.net.*;
import java.io.*;
public class DateTimeClient{
public static void main (String[] arg) throws Exception{
try{
Socket s=new Socket(InetAddress.getLocalHost(),1000);
BufferedReader br = new BufferedReader(new 
InputStreamReader(s.getInputStream()));
String input;
PrintWriter out=new PrintWriter(s.getOutputStream(),true);
while((input=br.readLine())!=null){
System.out.println(input);
out.println("Date and Time Received ---- client Acknowledge ----");
}
}
catch(Exception e){
}
}
}






// Server Algorithm:
// 1. Create instances for socket and server socket class.
// 2. Use the port 8020 for TCP.
// 3. Make the print stream object connect to the output stream using socket.
// 4. Create an instance of the Date class and write it into the socket.
// 5. Get IPAddress of the client using the socket and getInetAddress().


// Client Algorithm:
// 1. Create instances for socket class with the port Number 8020.
// 2. Create an object of DataInputStream and make it to get data from server through the socket.
// 3. Read the date object.
// 4. Print the obtained date.
