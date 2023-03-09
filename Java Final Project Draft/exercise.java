package oop;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class exercise extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BusTicketSystem_SecondClass frame = new BusTicketSystem_SecondClass();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public exercise() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(("/Buslogo.jpg"))));
		setTitle("Davao City Bus Ticket System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 51, 0));
		panel.setBounds(0, 0, 794, 461);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PURCHASE A TICKET");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 150, 25);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 50, 46, 14);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("SansSerif", Font.PLAIN, 12));
		textField.setBounds(10, 65, 170, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Guardian Name");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 90, 84, 14);
		panel.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(10, 105, 170, 20);
		panel.add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image busticketlogo = new ImageIcon(this.getClass().getResource("/busticketlogo.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(busticketlogo));
		lblNewLabel_2.setBounds(205, 11, 89, 85);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Guardian Mobile Name");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(10, 130, 123, 14);
		panel.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(10, 145, 170, 20);
		panel.add(textField_2);
		
		JButton Clear = new JButton("Clear");
		Clear.setBounds(205, 105, 89, 23);
		panel.add(Clear);
		
		JButton Submit = new JButton("Submit");
		Submit.setBounds(205, 145, 89, 23);
		panel.add(Submit);
		
		JPanel ticket = new JPanel();
		ticket.setBorder(null);
		ticket.setBackground(new Color(102, 51, 0));
		ticket.setBounds(304, 11, 480, 439);
		panel.add(ticket);
		ticket.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"ROUTE 1", "FARE"},
				{"Quezon Blvd", "20"},
				{"Mabini Public Market", "22"},
				{"121 Aurora St", "25"},
				{"Ramon Magsaysay Park", "26"},
				{"Agdao", "27"},
				{"R.Castillo St", "28"},
				{"Daang Maharlika Hwy", "30"},
				{"J.P Laurel Ave ", "32"},
				{"Sasa Barge", "34"},
				{"Osmena ", "35"},
				{"Panacan", "42"},
				{"Ilang OverPass ", "45"},
				{"Tibungco Gaisano Mall", "47"},
				{"Bunawan Proper", "50"},
				{"Lasang OverPass", "55"},
				{"Panabo Terminal", "60"},
			},
			new String[] {
				"ROUTE 1", "FARE 1"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(120);
		table.getColumnModel().getColumn(1).setPreferredWidth(46);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setToolTipText("");
		table.setBounds(10, 11, 230, 272);
		ticket.add(table);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"Route 2", "Fare"},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Route 2", "Fare 2"
			}
		));
		table_2.setToolTipText("");
		table_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		table_2.setBounds(250, 11, 230, 272);
		ticket.add(table_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(56, 369, 402, 34);
		ticket.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("SAKAY NA");
		btnNewButton.setBounds(183, 294, 130, 48);
		ticket.add(btnNewButton);
		ticket.setVisible(false);
		
	
		});
	}
}
