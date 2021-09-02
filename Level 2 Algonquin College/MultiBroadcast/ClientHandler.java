/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.*;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author karma
 */
public class ClientHandler implements Runnable {

	ArrayList <ClientHandler> clients=new ArrayList<>();
	private final Socket clientSocket;

	PrintWriter dout = null;
	BufferedReader br = null;
	

	
	public ClientHandler(Socket socket, ArrayList<ClientHandler> clients) throws IOException {
		this.clientSocket = socket;
		this.clients=clients;

		dout = new PrintWriter(clientSocket.getOutputStream(),true);
		
		br = new BufferedReader(
			new InputStreamReader(System.in));
	}

	public void run() {
		String str2 = "";
		try{
			while(true){
			
				

			System.out.print("Enter: ");
			str2 = br.readLine();
			outToAll(str2);
			
			
			
			
			}
		}catch(Exception e){
			System.out.println(e);
		}
		
		try{
		
		dout.close();
		br.close();
		clientSocket.close();
		}catch(Exception e){
			System.out.println(e);
		}

	/**
	 *
	 * @param msg
	 */
	
	}
	public void outToAll(String msg){
			for(ClientHandler c:clients){
				c.dout.println(msg);
			}
		}
}
