package socket;

import java.io.*;
import java.net.*;

public class WhoIs {

	public static void main(String[] args) throws Exception {
		 
        String domainName = "apple.com";
 
        String hostname = "whois.corporatedomains.com";//whois.educause.edu for tce.edu
        int port = 43;
 
        try (Socket socket = new Socket(hostname, port)) {
 
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            writer.println(domainName);
 
            InputStream input = socket.getInputStream();
 
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
 
            String line;
 
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (UnknownHostException ex) {
 
            System.out.println("Server not found: " + ex.getMessage());
 
        } catch (IOException ex) {
 
            System.out.println("I/O error: " + ex.getMessage());
        }
	}

}
