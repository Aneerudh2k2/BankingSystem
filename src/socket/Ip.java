package socket;

import java.net.*;

public class Ip {

	public static void main(String[] args) throws Exception {
		InetAddress ip = InetAddress.getLocalHost();
		
		System.out.println("Local host name: "+ip.getHostName());
		System.out.println("Local IP address: "+ip.getHostAddress());
		
		ip = InetAddress.getByName(new URL("https://web.whatsapp.com/").getHost());
		System.out.println("Public host name: "+ip.getHostName());
		System.out.println("Public IP address: "+ip.getHostAddress());
	}

}
