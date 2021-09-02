/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.*;
import java.io.*;

/**
 *
 * @author karma
 */
public class ServerConnection implements Runnable{
	Socket server;
	BufferedReader in;
	
	public ServerConnection(Socket s) throws IOException{
		server =s;
		in=new BufferedReader(new InputStreamReader(server.getInputStream()));
	}
	@Override
	public void run() {
		String input;
		try{
		while(true){
			input=in.readLine();
			System.out.println("From Server: "+input);
		}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
}
