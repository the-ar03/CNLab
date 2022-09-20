import java.io.*;
public class Ping{
public static void runSystemCommand(String Command){
try{
Process p=Runtime.getRuntime().exec(Command);
BufferedReader InputStream=new BufferedReader(new InputStreamReader(p.getInputStream()));
String s="vvv";
while((s=InputStream.readLine())!=null){
System.out.println(s);
}
}
catch(Exception e){
e.printStackTrace();
}
}
public static void main(String[]args){
String Ip="localhost";
runSystemCommand("ping " +Ip);
java.util.Date date=new java.util.Date();
System.out.println(date);
}
}


// Ping Command Algorithm:
// 1. Import necessary packages.
// 2. Initialize class Ping.
// 3. getRuntime().exec(Command) returns the runtime object.
// 4. BufferedReader function read each byte line to line.
// 5. printStackTrace() function used to handle exceptions and errors.
// 6. Enter the required website to ping.
// 7. Stop the program.
