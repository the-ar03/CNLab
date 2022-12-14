// FTPusingUDPServer
import java.net.*;
import java.io.*;
public class FTPusingUDPServer{
public static void main(String[] args) throws Exception{
InetAddress sa=InetAddress.getByName(null);
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
String msg="",fn,tmp;
System.out.println("Enter the File name:");
fn=in.readLine();
File f=new File(fn);
if(f.isFile() && f.canRead()){
BufferedReader fil=new BufferedReader(new FileReader(fn));
while((tmp=fil.readLine())!=null)
    msg=msg+tmp+"\n";
}
else
msg="ERROR IN INPUT FILE";
System.out.println(msg);
byte data[]=new byte[msg.length()];
msg.getBytes(0,msg.length(),data,0);
DatagramSocket ds = new DatagramSocket(8000);
DatagramPacket dp=new DatagramPacket(data,data.length,sa,8001);
ds.send(dp);
}
}



// FTPusingUDPClient
import java.net.*;
import java.io.*;
public class FTPusingUDPClient{
public static void main(String[] args) throws Exception{
InetAddress sa=InetAddress.getLocalHost();
byte data[]=new byte[1024];
DatagramSocket ds = new DatagramSocket(8001);
DatagramPacket dp=new DatagramPacket(data,data.length);
ds.receive(dp);
String msg=new String(dp.getData(),0,0,dp.getLength());
System.out.println("Received data : " + msg);
}
}



// Server Algorithm:
// 1. Create instances for the serversocket class and accept the server port 
// 2. Read the filename to be opened 
// 3. Send the file to the client


// Client Algorithm:
// 1. Create instance for the Socket class and establish connectivity with the server 
// 2. Use the port number 8000. 
// 3. Receive the file from the server 
// 4. Reset the connection with the server
