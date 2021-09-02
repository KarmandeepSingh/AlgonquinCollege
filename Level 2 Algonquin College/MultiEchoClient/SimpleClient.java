
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		String ip ="127.0.0.1";
		int port=1254;

		Socket s = null;
		PrintWriter dout = null;
		BufferedReader din = null;
		
		try {
			s=new Socket(ip,port);
			dout=new PrintWriter(s.getOutputStream(),true);
			din=new BufferedReader(new InputStreamReader(s.getInputStream()));
		}catch (UnknownHostException e) {
            System.err.println("Don't know about host: " + ip);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for "
                               + "the connection to: " + ip);
            System.exit(1);
        }
		
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		
		String userInput;
		
		System.out.print("Input: ");
		
		while((userInput=input.readLine())!=null) {
			dout.println(userInput);
			System.out.println("Echo: "+din.readLine());
			System.out.print("Input: ");
		}
		
		
		dout.close();
		din.close();
		s.close();

	}

}
