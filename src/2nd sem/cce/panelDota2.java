package cce;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class panelDota2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public panelDota2() {
		setBackground(new Color(33, 35, 35));
		setBounds(0, 0, 577, 406);
		setLayout(null);
		setVisible(true);
		
		
		JLabel lblNewLabel = new JLabel("WELCOME TO DOTA 2!!");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 577, 406);
		
		add(lblNewLabel);

	}

}
