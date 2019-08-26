package networkjdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
/* SERVER  may enhance to work for multiple clients */
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class NetworkingServer {
    
    public static void main(String [] args) throws SQLException {
        
        ServerSocket server = null;
        Socket client;
        
        // Default port number we are going to use
        int portnumber = 1234;
       
        
        // Create Server side socket
        try {
            server = new ServerSocket(portnumber);
        } catch (IOException ie) {
            System.out.println("Cannot open socket." + ie);
            System.exit(1);
        }
        System.out.println("ServerSocket is created " + server);
        
        // Wait for the data from the client and reply
        while(true) {
            
            try {
                
                // Listens for a connection to be made to
                // this socket and accepts it. The method blocks until
                // a connection is made
                System.out.println("Waiting for connect request...");
                client = server.accept();
                
                System.out.println("Connect request is accepted...");
                String clientHost = client.getInetAddress().getHostAddress();
                int clientPort = client.getPort();
                System.out.println("Client host = " + clientHost + " Client port = " + clientPort);
                
                // Read data from the client
                InputStream clientIn = client.getInputStream();
                BufferedReader br = new BufferedReader(new
                        InputStreamReader(clientIn));
                String msgFromClient = br.readLine();
                System.out.println("Message received from client = " + msgFromClient);
                
                // Send response to the client
                if (msgFromClient != null && !msgFromClient.equalsIgnoreCase("bye")) {
                    OutputStream clientOut = client.getOutputStream();
                    PrintWriter pw = new PrintWriter(clientOut, true);
                    Employee emp=new Employee(Integer.parseInt((msgFromClient)));
                    EmployeeService service=new EmployeeServiceImpl();
    				List<Employee> list=new ArrayList<Employee>();
    				list = service.getEmployeeById(Integer.parseInt((msgFromClient)));
                    pw.println(list.toString());
                    System.out.println(list.toString());
                    
                }
                
                // Close sockets
                if (msgFromClient != null && msgFromClient.equalsIgnoreCase("bye")) {
                    server.close();
                    client.close();
                    break;
                }
                
            } catch (IOException ie) {
            }
        }
    }
}
