package networking;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class networkframe extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnFindFactorial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					networkframe frame = new networkframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public networkframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(40, 30, 119, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSend = new JButton("send");
		btnSend.setBounds(52, 98, 89, 23);
		contentPane.add(btnSend);
		
		textField_1 = new JTextField();
		textField_1.setBounds(221, 39, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		btnFindFactorial = new JButton("find factorial");
		btnFindFactorial.setBounds(221, 80, 89, 23);
		contentPane.add(btnFindFactorial);
		btnSend.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Socket client = null;
		        
		        // Default port number we are going to use
		        int portnumber = 1234;
		        try {
		        	client = new Socket(InetAddress.getLocalHost(), portnumber);
	                System.out.println("Client socket is created " + client);
	                
	                // Create an output stream of the client socket
	                OutputStream clientOut = client.getOutputStream();
	                PrintWriter pw = new PrintWriter(clientOut, true);
	                
	                // Create an input stream of the client socket
	                InputStream clientIn = client.getInputStream();
	                BufferedReader br = new BufferedReader(new
	                        InputStreamReader(clientIn));
	                
	                // Create BufferedReader for a standard input
	                BufferedReader stdIn = new BufferedReader(new
	                        InputStreamReader(System.in));
	                
	                
	                
	                // Read data from standard input device and write it
	                // to the output stream of the client socket.
	                String msg = textField.getText();
	                pw.println(msg);
	                textField.setText(" ");
	                // Read data from the input stream of the client socket.
	                
	                textField_1.setText(br.readLine().toString());
	                pw.close();
	                br.close();
	                client.close();
		        }
		        catch(Exception ex)
		        {
		        	
		        }
			}
			
		});
		btnFindFactorial.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Socket client = null;
		        
		        // Default port number we are going to use
		        int portnumber = 1234;
		        try {
		        	client = new Socket(InetAddress.getLocalHost(), portnumber);
	                System.out.println("Client socket is created " + client);
	                
	                // Create an output stream of the client socket
	                OutputStream clientOut = client.getOutputStream();
	                PrintWriter pw = new PrintWriter(clientOut, true);
	                
	                // Create an input stream of the client socket
	                InputStream clientIn = client.getInputStream();
	                BufferedReader br = new BufferedReader(new
	                        InputStreamReader(clientIn));
	                
	                // Create BufferedReader for a standard input
	                BufferedReader stdIn = new BufferedReader(new
	                        InputStreamReader(System.in));
	                
	                
	                
	                // Read data from standard input device and write it
	                // to the output stream of the client socket.
	                int sum=1;
	                int msg = Integer.parseInt(textField_1.getText());
	                for(int i=1;i<=msg;i++)
	                {
	                	sum= sum*i;
	                }
	                pw.println(sum);
	                
	                // Read data from the input stream of the client socket.
	                
	                textField.setText(br.readLine().toString());
	                pw.close();
	                br.close();
	                client.close();
		        }
		        catch(Exception ex)
		        {
		        	
		        }
			
				
			}
			
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
