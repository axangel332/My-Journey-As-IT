package oop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class tryers extends javax.swing.JFrame {

	/**
	 * Creates new form ThisFrame
	 */
	public tryers() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
		javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
		JPanel jPanel3 = new javax.swing.JPanel();
		jPanel3.setForeground(new Color(224, 155, 128));
		jPanel3.setBackground(new Color(224, 155, 128));
		javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
		txfname = new javax.swing.JTextField();
		javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
		javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
		javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
		txfemail = new javax.swing.JTextField();
		javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
		txfphone = new javax.swing.JTextField();
		javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
		txfaddress = new javax.swing.JTextField();
		javax.swing.JButton btnadd = new javax.swing.JButton();
		javax.swing.JButton btnclear = new javax.swing.JButton();
		javax.swing.JButton btndelete = new javax.swing.JButton();
		javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
		tableClients = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Dashboard");
		setBackground(new java.awt.Color(153, 255, 153));
		setMinimumSize(new java.awt.Dimension(841, 522));
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}

			public void windowOpened(java.awt.event.WindowEvent evt) {
				formWindowOpened(evt);
			}
		});

		jPanel1.setBackground(new Color(182, 81, 73));

		jLabel1.setFont(new Font("Times New Roman", Font.BOLD, 22)); // NOI18N
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setIcon(null); // NOI18N
		jLabel1.setText("Student Grade List");

		jPanel3.setBorder(null);

		jLabel2.setFont(new Font("Times New Roman", Font.BOLD, 12)); // NOI18N
		jLabel2.setText("Student ID Number:");

		txfname.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

		jLabel3.setFont(new Font("Times New Roman", Font.BOLD, 12)); // NOI18N
		jLabel3.setText("Student Name:");

		jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

		jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N

		txfemail.setFont(new Font("Times New Roman", Font.BOLD, 12)); // NOI18N

		jLabel6.setFont(new Font("Times New Roman", Font.BOLD, 12)); // NOI18N
		jLabel6.setText("Course:");

		txfphone.setFont(new Font("Times New Roman", Font.BOLD, 12)); // NOI18N

		jLabel7.setFont(new Font("Times New Roman", Font.BOLD, 12)); // NOI18N
		jLabel7.setText("Equivalent Grade:");

		txfaddress.setFont(new Font("Times New Roman", Font.BOLD, 12)); // NOI18N

		btnadd.setFont(new Font("Times New Roman", Font.BOLD, 12)); // NOI18N
		btnadd.setIcon(null); // NOI18N
		btnadd.setText("Add");
		btnadd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnaddActionPerformed(evt);
			}
		});

		btnclear.setFont(new Font("Times New Roman", Font.BOLD, 12)); // NOI18N
		btnclear.setIcon(null); // NOI18N
		btnclear.setText("Clear");
		btnclear.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnclearActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout gl_jPanel3 = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(gl_jPanel3);
		gl_jPanel3.setHorizontalGroup(gl_jPanel3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addGroup(gl_jPanel3.createSequentialGroup().addGap(30, 30, 30).addComponent(btnadd)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(btnclear)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_jPanel3.createSequentialGroup()
						.addGroup(gl_jPanel3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(txfaddress)
								.addGroup(gl_jPanel3.createSequentialGroup()
										.addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(0, 172, Short.MAX_VALUE))
								.addComponent(txfemail, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_jPanel3.createSequentialGroup().addComponent(jLabel6)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(txfname).addComponent(txfphone))
						.addContainerGap()));
		gl_jPanel3.setVerticalGroup(gl_jPanel3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(gl_jPanel3.createSequentialGroup().addComponent(jLabel2)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(txfname, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel3)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(txfemail, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel5)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel6)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel4)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(txfphone, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel7)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(txfaddress, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(40, 40, 40)
						.addGroup(gl_jPanel3.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnadd).addComponent(btnclear))
						.addGap(0, 18, Short.MAX_VALUE)));

		btndelete.setFont(new Font("Times New Roman", Font.BOLD, 12)); // NOI18N
		btndelete.setIcon(null); // NOI18N
		btndelete.setText("Delete");
		btndelete.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btndeleteActionPerformed(evt);
			}
		});

		tableClients.setFont(new Font("Times New Roman", Font.BOLD, 12)); // NOI18N
		tableClients.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Student ID Number", "Student Name", "Course", "Equivalent Grade" }));
		jScrollPane1.setViewportView(tableClients);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(btndelete)
						.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE))
					.addContainerGap())
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addComponent(jLabel1)
					.addPreferredGap(ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
					.addComponent(btndelete)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
						.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26))
		);
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addComponent(jPanel1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
		);
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>

	private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {
		String name = txfname.getText();
		String email = txfemail.getText();
		String phone = txfphone.getText();
		String address = txfaddress.getText();

		if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Please enter all fields", "Try again", JOptionPane.ERROR_MESSAGE);
		} else {
			DefaultTableModel model = (DefaultTableModel) tableClients.getModel();
			model.addRow(new Object[] { name, email, phone, address });

			txfname.setText(" ");
			txfemail.setText(" ");
			txfphone.setText(" ");
			txfaddress.setText(" ");

		}
	}

	private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {
		txfname.setText(" ");
		txfemail.setText(" ");
		txfphone.setText(" ");
		txfaddress.setText(" ");
	}

	private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {

		int row = tableClients.getSelectedRow();
		if (row < 0) {
			JOptionPane.showMessageDialog(this, "No row is selected!, please select row", "Select row",
					JOptionPane.ERROR_MESSAGE);
		} else {
			DefaultTableModel model = (DefaultTableModel) tableClients.getModel();
			model.removeRow(row);
		}
	}

	private void formWindowClosing(java.awt.event.WindowEvent evt) {
		DefaultTableModel model = (DefaultTableModel) tableClients.getModel();
		Vector<Vector> tableData = model.getDataVector();

		// Saving of object in a file
		try {
			FileOutputStream file = new FileOutputStream("file.txt");
			ObjectOutputStream output = new ObjectOutputStream(file);

			output.writeObject(tableData);
			output.close();
			file.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	private void formWindowOpened(java.awt.event.WindowEvent evt) {
		try {
			FileInputStream file = new FileInputStream("file.txt");
			ObjectInputStream input = new ObjectInputStream(file);

			Vector<Vector> tableData = (Vector<Vector>) input.readObject();
			input.close();
			file.close();

			DefaultTableModel model = (DefaultTableModel) tableClients.getModel();
			for (int i = 0; i < tableData.size(); i++) {
				Vector row = tableData.get(i);
				model.addRow(new Object[] { row.get(0), row.get(1), row.get(2), row.get(3) });
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new tryers().setVisible(true);
			}
		});
	}

	private javax.swing.JTable tableClients;
	private javax.swing.JTextField txfaddress;
	private javax.swing.JTextField txfemail;
	private javax.swing.JTextField txfname;
	private javax.swing.JTextField txfphone;
	// End of variables declaration
}