/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.net.*;
import java.util.ArrayList;


/**
 *
 * @author karma
 */
public class Server {
	static ArrayList <ClientHandler> clients=new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		System.out.println("Server Started");
		ServerSocket ss = new ServerSocket(1254);
		System.out.println("Waiting for client requests");
		try {
		while (true) {
			Socket s = ss.accept();
			System.out.println("Client Connected");
			ClientHandler c=new ClientHandler(s, clients);
			clients.add(c);
			new Thread(c).start();
			
		}
		
		}catch(Exception e) {
			System.out.println(e);
			ss.close();
		}
	}
}
