package socket;

import java.io.*;
import java.net.*;


public class SocClient {

	public static void main(String[] args) throws Exception {
		String ipAddress = "localhost";// since client and server are both in same machine
		int port = 6050;
		
		// creating a socket
		Socket soc = new Socket(ipAddress, port);
		
		String str = "BankingSystem";
	
		// sending the data to the server side
		if(str != null) {
			DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
			dos.writeUTF(str);
			dos.flush();
		}
		
		
		DataInputStream dis = new DataInputStream(soc.getInputStream());
		String serverResult = dis.readUTF();
		
		System.out.println("C : Response from Server : "+serverResult);
		
	}

}
