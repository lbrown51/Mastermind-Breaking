import java.awt.Dimension;
import java.awt.FlowLayout; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.util.ArrayList;

import javax.swing.JButton; 
import javax.swing.JFrame;
import javax.swing.JLabel; 
import javax.swing.JTextField; 

public class SwingBasic extends JFrame 
{ 
	JTextField one,two,three,four,five,six,seven,eight; 
	JLabel colors;
	public String[] start() {
		colors=new JLabel("   Input Colors   ");
		one = new JTextField();
		one.setPreferredSize(new Dimension(100,25));
		
		two = new JTextField();
		two.setPreferredSize(new Dimension(100,25));

		three =new JTextField();
		three.setPreferredSize(new Dimension(100,25));

		four =new JTextField();
		four.setPreferredSize(new Dimension(100,25));

		five = new JTextField();
		five.setPreferredSize(new Dimension(100,25));
		
		six = new JTextField();
		six.setPreferredSize(new Dimension(100,25));
		
		seven =new JTextField();
		seven.setPreferredSize(new Dimension(100,25));
		
		eight =new JTextField(); 
		eight.setPreferredSize(new Dimension(100,25));
		
		JLabel numberOfthings = new JLabel("How many slots?");
		JTextField numberOf =new JTextField();
		numberOf.setPreferredSize(new Dimension(100,25));
		numberOf.setText("0");
		
		JLabel listSize = new JLabel("How many elements in your list?");
		JTextField listSizeField =new JTextField();
		listSizeField.setPreferredSize(new Dimension(100,25));
		listSizeField.setText("0");
		
		JButton submit=new JButton(); 
		submit.setText("  Submit  "); 
		add(colors);
		add(one); 
		add(two); 
		add(three); 
		add(four); 
		add(five); 
		add(six); 
		add(seven); 
		add(eight);
		add(numberOfthings);
		add(numberOf);
		add(listSize);
		add(listSize);
		add(listSizeField);
		add(submit); 
		
		
		
		submit.addActionListener( new ActionListener()
		{ public void actionPerformed( ActionEvent e){ setVisible(false); 
		
		ArrayList<String> toColor = new ArrayList<String>();
		switch(Integer.parseInt(numberOf.getText())){
		
		case 1: 
			toColor.add(one.getText());
			break;
		case 2:
			toColor.add(one.getText());
			toColor.add(two.getText());
			break;
		case 3:
			toColor.add(one.getText());
			toColor.add(two.getText());
			toColor.add(three.getText());
			break;
		case 4:
			toColor.add(one.getText());
			toColor.add(two.getText());
			toColor.add(three.getText());
			toColor.add(four.getText());
			break;
		case 5:
			toColor.add(one.getText());
			toColor.add(two.getText());
			toColor.add(three.getText());
			toColor.add(four.getText());
			toColor.add(five.getText());
			break;
		case 6:
			toColor.add(one.getText());
			toColor.add(two.getText());
			toColor.add(three.getText());
			toColor.add(four.getText());
			toColor.add(five.getText());
			toColor.add(six.getText());
			break;
		case 7:
			toColor.add(one.getText());
			toColor.add(two.getText());
			toColor.add(three.getText());
			toColor.add(four.getText());
			toColor.add(five.getText());
			toColor.add(six.getText());
			toColor.add(seven.getText());
			break;
		case 8:
			toColor.add(one.getText());
			toColor.add(two.getText());
			toColor.add(three.getText());
			toColor.add(four.getText());
			toColor.add(five.getText());
			toColor.add(six.getText());
			toColor.add(seven.getText());
			toColor.add(eight.getText());
			break;
			
		}
		
		
		String[] colored = toColor.toArray(new String[toColor.size()]) ;
		Attempt test = new Attempt(colored);
		
		String[] arry = new String[Integer.parseInt(numberOf.getText())];
		  
		
		  test.generateFull(arry,0,0);
		  
	
			returnResponse Temp = new returnResponse(test.getNextGuess(),colored);
		
		} } ); 
		
		setLayout(new FlowLayout()); 
		setSize(200,450); 
		setVisible(true); 
		
		return null;

		}
	
	 } 


