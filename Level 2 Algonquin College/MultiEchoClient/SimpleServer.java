
import java.net.*;
import java.io.*;

public class SimpleServer {

	public static void main(String args[]) throws IOException {

		System.out.println("Server started");
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(1254);
		} catch (IOException e) {
			System.err.println("Could not listen on port: 12345.");
			System.exit(1);
		}
		Socket clientSocket = null;
		System.out.println("Waiting for client request");
		while (true) {
			try {
				clientSocket = ss.accept();
				Multithread s = new Multithread(clientSocket);
				System.out.println("Client connected");
				new Thread(s).start();
			} catch (IOException io) {
				System.err.println("Accept failed");
				ss.close();
				System.exit(1);
			}
		}
	}
}
