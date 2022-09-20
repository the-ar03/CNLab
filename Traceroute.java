import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Traceroute{
public static void runSystemCommand(String command){
try{
Process p = Runtime.getRuntime().exec(command);
BufferedReader inputStream = new BufferedReader(
new InputStreamReader(p.getInputStream()));
String s = "";
while ((s = inputStream.readLine()) != null)
System.out.println(s);
}
catch (Exception e){
}
}
public static void main(String[] args){
// String ip = "www.google.co.in";
// String ip = "127.0.0.1";
String ip = "www.drranurekha.com";
runSystemCommand("tracert " + ip);
}
}


// Traceroute Algorithm:
// 1. Import all the necessary packages.
// 2. Create the class Traceroute.
// 3. the getRuntime() command returns the runtime object associated with current java application.
// 4. Which website you want to see the trace enters the command to the server.
// 5. Stop the program.
