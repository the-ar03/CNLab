// FTPusingTCPServer
import java.net.*;
import java.io.*;
public class FTPusingTCPServer extends Thread{
public static void main(String args[]){
try{
ServerSocket ss=new ServerSocket(4000);
Socket s=ss.accept();
BufferedReader br=new BufferedReader(new 
InputStreamReader(s.getInputStream()));
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
PrintWriter out=new PrintWriter(s.getOutputStream(),true);
String fn,contents=" ",temp;
System.out.println("enter the file name to open: ");
fn=in.readLine();
File f=new File(fn);
if(f.isFile()&&f.canRead()){
BufferedReader fil=new BufferedReader(new FileReader(fn));
while((temp=fil.readLine())!=null)
contents=contents+temp+"\n";
}
else
contents="error in input file";
System.out.println(" the contents of the file is:\n"+contents);
System.out.println("sending the file to the client....");
out.println(contents);
}
catch(Exception e){
System.out.println(e);
} 
} 
}




// FTPusingTCPClient
import java.net.*;
import java.io.*;
public class FTPusingTCPClient {
public static void main(String args[]){
try{
Socket s=new Socket(InetAddress.getLocalHost(),4000);
BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
String str;
while((str=br.readLine())!=null)
System.out.println(str);}
catch(Exception e){
System.out.println("The connection to the server has been reset");
} 
} 
}




// Server Algorithm:
// 1. Create instances for the serversocket class and accept the server port 
// 2. Read the filename to be opened 
// 3. Send the file to the client



// Client Algorithm:
// 1. Create instance for the Socket class and establish connectivity with the server 
// 2. Use the port number 4000
// 3. Receive the file from the server
// 4. Reset the connection with the server
