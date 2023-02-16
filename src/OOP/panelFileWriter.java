package OOP;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.io.FileWriter;

public class panelFileWriter extends JPanel {

	public panelFileWriter() {
		setBackground(new Color(33, 35, 35));
		setBounds(0, 0, 577, 406);
		setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Welcome To FileWriter");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 577, 406);
		add(lblNewLabel);

	}

}
