
import java.io.*;
import java.net.*;


/**
 *
 * @author karma
 */
public class Multithread implements Runnable {

	Socket client;

	public Multithread(Socket client) {
		this.client = client;

	}

	@Override
	public void run() {
		BufferedReader in = null;
		PrintWriter out = null;
		try {

			in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			out = new PrintWriter(client.getOutputStream(), true);
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				System.out.println("Client: " + inputLine);
				out.println(inputLine);
				if (inputLine.equals("Bye")) {
					break;
				}

			}

		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			in.close();
		} catch (IOException ex) {
			System.out.println(ex);
		}
		out.close();
	}

}
