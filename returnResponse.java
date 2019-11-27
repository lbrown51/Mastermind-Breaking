import java.awt.Dimension;
import java.awt.FlowLayout; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.util.ArrayList;

import javax.swing.JButton; 
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel; 
import javax.swing.JTextField; 


public class returnResponse extends JFrame{
	public returnResponse(ArrayList<String> guess,String[] colored){
		tryer(guess,colored);
	}
	
	public void responseInts(ArrayList<String> guess, Integer black, Integer white, String[] colored){
		Attempt test = new Attempt(colored);
		int[] newInts = new int[]{black,white};
		test.delete(guess, newInts);
		
		
		 new returnResponse(test.getNextGuess(),colored);

	}
	
	public void tryer(ArrayList<String> guess,String[] colored){
		System.out.println(guess);
		JLabel myGuess = new JLabel("My Guess" );
		myGuess.setPreferredSize(new Dimension(100,25));

		JLabel myGuessVariable = new JLabel(""+ guess );
		JLabel black = new JLabel ("Blacks?");
		black.setPreferredSize(new Dimension(100,25));

		JLabel white = new JLabel("Whites?");
		//white.setPreferredSize(new Dimension(100,25));

		JFormattedTextField blackField = new JFormattedTextField();
		blackField.setPreferredSize(new Dimension(100,25));
		blackField.setText("0");
		JFormattedTextField whiteField = new JFormattedTextField();
		whiteField.setText("0");
		whiteField.setPreferredSize(new Dimension(100,25));
		
		JButton submit=new JButton(); 
		submit.setText("  Submit  "); 
		
		JButton newGame = new JButton();
		newGame.setText ("    New Game?   ");
		
		add(myGuess);
		add(myGuessVariable);
		add(black);
		add(blackField);
		add(white);
		add(whiteField);
		add(submit);
		add(newGame);
		
		
		
		submit.addActionListener( new ActionListener()
		{ public void actionPerformed( ActionEvent e){ setVisible(false); 
		responseInts(guess, Integer.parseInt(blackField.getText()),Integer.parseInt(whiteField.getText()),colored);
				
		} } ); 
		
		
		newGame.addActionListener( new ActionListener()
		{ public void actionPerformed( ActionEvent e){ setVisible(false); 
				SwingBasic testFrame = new SwingBasic();
				testFrame.start();
		} } ); 
		setLayout(new FlowLayout()); 
		setSize(400,400); 
		setVisible(true); 
	}
	
	

}
