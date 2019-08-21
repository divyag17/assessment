package swing;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MyFrame  extends JFrame implements ActionListener{
private JLabel label1;
private JTextField textfield;
private JButton button;
public MyFrame() throws HeadlessException
{
	super();
	label1=new JLabel();
	label1.setText("enter");
	textfield =new JTextField(20);
	button =new JButton();
	button.setText("say hi");
	this.setTitle("my frame");
	this.setSize(400,400);
	this.setLayout(new FlowLayout());
	this.add(label1);
	this.add(textfield);
	this.add(button);
	button.addActionListener(this);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(this,"hello"+textfield.getText().toString());
}

}
