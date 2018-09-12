package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class SecretMessageBox {public static void main(String[] args) {
	
	String password= "12345";
	
	
	String message= JOptionPane.showInputDialog("What is the secret message?");
	
	JOptionPane.showMessageDialog(null, "You can only see the message, if you can see guess the passcode");
	String userpassword = JOptionPane.showInputDialog("Whats the passcode");
	if (userpassword.equals(password)) {
		JOptionPane.showMessageDialog(null, "the message is "+ message); 
		}
		else { 
			JOptionPane.showMessageDialog(null, "INTRUDER!");
			
		}
	}
		
	
	
	

	
	
	
	
	
	
}


