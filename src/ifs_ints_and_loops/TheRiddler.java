package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class TheRiddler { 
	public static void main(String[] args) {
	
	int score = 0; 
	
	String question = JOptionPane.showInputDialog("What goes on four legs in the morning, two legs in the noon, and three legs in the evening ");
	
	String answere = "a man";
	
	if(question.equals(answere)) {
		JOptionPane.showMessageDialog(null, "You are correct");
		score = +1;
		
	}
	else { JOptionPane.showMessageDialog(null, "YOU'RE WRONG..... and the correct answere was a man.");
	
	}
	
	JOptionPane.showMessageDialog(null, "Your score was "+ score);
	
	
	
}
	

}
