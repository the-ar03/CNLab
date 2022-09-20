import java.io.*;
import java.net.*;
public class HTTP{
public static void main(String args[])throws IOException{
URL url=new URL("http://www.google.com/");
URLConnection conn=url.openConnection();
conn.connect();
InputStreamReader content= new InputStreamReader(conn.getInputStream());
FileWriter f=new FileWriter ("abc.html");
for(int i=0;i!=-1;i= content.read()){
f.write((char)i);
}
}
}


// HTTP Protpcol Implementation Algorithm:

// 1. Create the URL with Http URL Connections 
// 2. Define the Http Protocol for Client Connections. 
// 3. Get the Http Connection.
// 4. Print the URL for the Client
