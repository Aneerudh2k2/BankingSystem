package socket;

import java.net.*;
import java.io.*;

public class SocServer {

	public static void main(String[] args) throws Exception{
		// Initiating
		ServerSocket ss = new ServerSocket(6050);
		System.out.println("S : Server initiated");
		System.out.println("S : Waiting for the Client......");
		
		//accepting the client request
		Socket clientSocket = ss.accept();
		System.out.println("S : Client Request Accepted");
		
		// inorder to read data from socket
		DataInputStream dis = new DataInputStream(clientSocket.getInputStream());
		String str = dis.readUTF().substring(0, 7);
		
		// sending it to the client
		DataOutputStream dos = new DataOutputStream(clientSocket.getOutputStream());
		dos.writeUTF(str);
		dos.flush();
		
	}

}
