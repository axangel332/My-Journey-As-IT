package kook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class calculator extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Container con = getContentPane();
	JLabel prompt = new JLabel("Type first number");
	JLabel prompt2 = new JLabel("Type second number and press a button");
	JLabel result = new JLabel();
	Font promptFont = new Font("Times", Font.BOLD, 12);
	Font resultFont = new Font("Times", Font.BOLD, 20);
	
	JTextField input = new JTextField(20);
	JTextField input2 = new JTextField(20);
	
	JButton add = new JButton("add");

	
	public calculator(){
		
		super("Calculator");
		setSize(300,300);
		con.setLayout(new FlowLayout());
		prompt.setFont(promptFont);
		prompt2.setFont(promptFont);
		result.setFont(resultFont);
		
		con.add(prompt);
		con.add(input);
		con.add(prompt2);
		con.add(input2);
		con.add(add);
		con.add(result);
		
		add.addActionListener(this);
		
	}
	
	public static void main(String[] args){
		
		calculator demo = new calculator();
		demo.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object source = e.getSource();
		if(source == add)
		{
			String ans1 = input.getText();
			int num1 = Integer.parseInt(ans1);
			String ans2 = input2.getText();
			int num2 = Integer.parseInt(ans2);	
			
			int RESULT = num1 + num2;
			String res = new Integer(RESULT).toString();
			result.setText("The result is equal to " + res);
			
				
		}
		
	}

}