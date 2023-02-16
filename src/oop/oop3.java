package oop;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class oop3 extends JPanel {

	/**
	 * Create the panel.
	 */
	public oop3() {
		setBackground(new Color(33, 35, 35));
		setBounds(0, 0, 577, 406);
		setLayout(null);
		setVisible(true);
		
		JLabel lblWelcome = new JLabel("LIGHT SWITCH");
		lblWelcome.setForeground(new Color(255, 255, 255));
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBounds(123, 29, 344, 89);
		add(lblWelcome);
		
		JLabel Playing = new JLabel("");
		Playing.setForeground(Color.WHITE);
		Playing.setFont(new Font("Tahoma", Font.BOLD, 15));
		Playing.setHorizontalAlignment(SwingConstants.CENTER);
		Playing.setBounds(177, 183, 231, 54);
		add(Playing);
		
		JLabel Playing_1 = new JLabel("");
		Playing_1.setHorizontalAlignment(SwingConstants.CENTER);
		Playing_1.setForeground(Color.WHITE);
		Playing_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		Playing_1.setBounds(0, 313, 577, 54);
		add(Playing_1);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnClear.setBackground(new Color(0, 128, 255));
		btnClear.setBounds(472, 372, 95, 23);
		add(btnClear);
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Playing.setText(" ");
				Playing_1.setText(" ");
				setBackground(new Color(33, 35, 35));
			}
		});
		
		JButton btnPlay = new JButton("TURN ON");
		btnPlay.setForeground(Color.WHITE);
		btnPlay.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnPlay.setBackground(new Color(0, 128, 255));
		btnPlay.setBounds(206, 118, 179, 54);
		add(btnPlay);
	
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblWelcome.setForeground(Color.BLACK);
				Playing.setForeground(Color.BLACK);
				Playing_1.setForeground(Color.BLACK);
				Playing.setText("===LIGHTS ON===");
				Playing_1.setText("AAA SOO BRIGHTT!!");
				setBackground(new Color(255, 255, 255));
				
			}
		});

		JButton btnStop = new JButton("TURN OFF");
		btnStop.setForeground(Color.WHITE);
		btnStop.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnStop.setBackground(new Color(0, 128, 255));
		btnStop.setBounds(206, 248, 179, 54);
		add(btnStop);
		
	
		
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblWelcome.setForeground(Color.WHITE);
				Playing.setForeground(Color.WHITE);
				Playing_1.setForeground(Color.WHITE);
				Playing.setText("===LIGHTS OFF===");
				Playing_1.setText("AAA SOO DARK!!  ");
				setBackground(new Color(0, 0, 0));
			
			}
		});


	}

}