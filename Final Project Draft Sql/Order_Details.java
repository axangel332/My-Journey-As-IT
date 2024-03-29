package sheesh;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;

public class Order_Details extends JPanel {
	private JTextField textField;


	/**
	 * Create the panel.
	 */
	public Order_Details() {
		setBackground(new Color(33, 35, 35));
		setBounds(0, 0, 577, 406);
		setLayout(null);
		setVisible(true);
		
		JLabel txtWelcome = new JLabel("Order Details / Table");
		txtWelcome.setForeground(new Color(255, 255, 255));
		txtWelcome.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcome.setBounds(121, 94, 320, 39);
		add(txtWelcome);

		

		JButton btnSubmit = new JButton("Enter Order Details Tab");
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSubmit.setBackground(new Color(0, 128, 255));
		btnSubmit.setBounds(121, 176, 320, 82);
		add(btnSubmit);
					
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderDetailsApp tables = new OrderDetailsApp();
				tables.setVisible(true);
			}
		});

	}
}						