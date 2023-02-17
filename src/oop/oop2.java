package oop;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class oop2 extends JPanel {	

	public oop2() {
		setBackground(new Color(33, 35, 35));
		setBounds(0, 0, 577, 406);
		setLayout(null);
		setVisible(true);
		
		JLabel lblWelcome = new JLabel("DOG & CAT PAT CORNER");
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
			}
		});
		
		JButton btnPlay = new JButton("PET THE DOG");
		btnPlay.setForeground(Color.WHITE);
		btnPlay.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnPlay.setBackground(new Color(0, 128, 255));
		btnPlay.setBounds(206, 118, 179, 54);
		add(btnPlay);
	
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Playing.setText("===DOG PETTED===");
				Playing_1.setText("ROLF!!! ROLF!!!   ( ̿❍ ᴥ ̿❍)ʋ ");
				System.out.println("===DOG PETTED===");
				System.out.println("ROLF!!! ROLF!!!   ( ̿❍ ᴥ ̿❍)ʋ ");
				int counter = 1;
				try {
					FileWriter writer = new FileWriter("CATDOG.txt");
					writer.write("\n-----CATDOG #" + counter + "------" + "\n");
					writer.write("DOG PETTED\n");
					writer.write("DOG BARKS AT YOU!!  ( ̿❍ ᴥ ̿❍)ʋ \n");
					counter++;
					writer.close();

					JOptionPane.showMessageDialog(null, "User information saved.");
				} catch (IOException ex) {
					JOptionPane.showMessageDialog(null, "Error writing user information to file.");
					}		
			}
		});

		JButton btnStop = new JButton("PET THE CAT");
		btnStop.setForeground(Color.WHITE);
		btnStop.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnStop.setBackground(new Color(0, 128, 255));
		btnStop.setBounds(206, 248, 179, 54);
		add(btnStop);
		
	
		
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Playing.setText("===CAT PETTED===");
				Playing_1.setText("MEOW!! MEOWW!! (๑ↀᆺↀ๑) ");
				System.out.println("===CAT PETTED===");
				System.out.println("MEOW!! MEOWW!! (๑ↀᆺↀ๑) ");
				int counter = 1;
				try {
					FileWriter writer = new FileWriter("CATDOG.txt");
					writer.write("\n-----CATDOG #" + counter + "------" + "\n");
					writer.write("CAT PETTED\n");
					writer.write("CAT MEOWED AT YOU. (๑ↀᆺↀ๑)");
					counter++;
					writer.close();

					JOptionPane.showMessageDialog(null, "User information saved.");
				} catch (IOException ex) {
					JOptionPane.showMessageDialog(null, "Error writing user information to file.");
					}		
			}
		});
	}
}