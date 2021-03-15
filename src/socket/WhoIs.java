package socket;

import java.io.*;
import java.net.*;

public class WhoIs {

	public static void main(String[] args) throws Exception {
		 
        String domainName = "tce.edu";
 
        String hostname = "whois.educause.edu";//whois.educause.edu for tce.edu
        int port = 43;// whois.corporatedomains.com for apple.com
 
        try (Socket socket = new Socket(hostname, port)) {
            // sending information to the whois server
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            writer.println(domainName);
            
            // getting the response from server and printitng it
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
 
            String line;
            FileWriter f = new FileWriter("Websitedata.txt");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                f.write(line);
            }
            f.close();
            reader.close();
        } catch (UnknownHostException ex) {
 
            System.out.println("Server not found: " + ex.getMessage());
 
        } catch (IOException ex) {
 
            System.out.println("I/O error: " + ex.getMessage());
        }
	}

}
