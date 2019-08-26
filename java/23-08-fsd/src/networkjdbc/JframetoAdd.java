package networkjdbc;

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
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class JframetoAdd extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JframetoAdd frame = new JframetoAdd();
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
	public JframetoAdd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(25, 21, 46, 14);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(65, 15, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAdd = new JButton("get");
		btnAdd.setBounds(186, 17, 89, 23);
		contentPane.add(btnAdd);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 83, 256, 119);
		contentPane.add(scrollPane);
		
		table = new JTable( );
		scrollPane.setViewportView(table);
		btnAdd.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						Socket client = null;
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
			                String[] col= {"id","fname","lname","emiAL"};
			                // Read data from the input stream of the client socket.
			                System.out.println("Message returned from the server = " + br.readLine().toString());
			                table.setModel(new MyListTableModel(br.readLine(),col[]));
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
