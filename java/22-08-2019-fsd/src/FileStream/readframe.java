package FileStream;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class readframe extends JFrame implements ActionListener{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					readframe frame = new readframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws FileNotFoundException 
	 */
	public readframe() throws FileNotFoundException {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterText = new JLabel("enter text");
		lblEnterText.setBounds(28, 23, 70, 14);
		contentPane.add(lblEnterText);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(26, 38, 200, 100);
		contentPane.add(textArea);
		
		JButton btnSave = new JButton("save");
		btnSave.setBounds(22, 149, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnRead = new JButton("read");
		btnRead.setBounds(132, 149, 89, 23);
		contentPane.add(btnRead);
		
		btnSave.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					File outputfile=new File("outputfile.txt");
					FileOutputStream out= new FileOutputStream(outputfile);
				//System.out.println(textArea.getText());
				//FileInputStream in= new FileInputStream(textArea.getText());
				String ce=(textArea.getText());
				System.out.println(ce);
				char[] c =ce.toCharArray();
				
				for(int i=0;i<c.length;i++) {
					System.out.println(c[i]);
					out.write((int)c[i]);
				}
					out.close();
					textArea.setText(" ");
				}
				catch(Exception err)
				{
					
				}
			}
			
		});
		btnRead.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				BufferedReader reader;
				BufferedWriter writer;
				try {
					reader=new BufferedReader(new FileReader("userdata.txt"));
					
					String line=reader.readLine();
					
					while(line!=null)
					{    
						
					}
					
					reader.close();
					
				}
				catch(IOException e1)
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
