import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.ConnectionProvider;

public class GenerateBill extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTable table;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private Connection cn;
	private Statement st;
	private ResultSet rs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GenerateBill frame = new GenerateBill();
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
	public GenerateBill() {
		try {
			cn = ConnectionProvider.getConnection();
			st = cn.createStatement();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1550, 850);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Billing");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(24, 31, 258, 54);
		contentPane.add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setBounds(24, 120, 1474, 2);
		contentPane.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(24, 264, 1474, 2);
		contentPane.add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(24, 452, 1474, 2);
		contentPane.add(separator_2);

		JLabel lblNewLabel_1 = new JLabel("Buyer Details");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(24, 137, 258, 34);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Product Details");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(24, 276, 258, 34);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_2 = new JLabel(" Date :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(1231, 31, 69, 34);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Time :");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(1231, 76, 69, 34);
		contentPane.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("Time Unit");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_1_1.setBounds(1310, 76, 188, 34);
		contentPane.add(lblNewLabel_2_1_1);

		JLabel lblNewLabel_2_2 = new JLabel("Date Unit");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_2.setBounds(1310, 31, 188, 34);
		contentPane.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_3 = new JLabel("Name");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_3.setBounds(26, 199, 63, 34);
		contentPane.add(lblNewLabel_2_3);

		JLabel lblNewLabel_2_3_1 = new JLabel("Contact Number");
		lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_3_1.setBounds(345, 199, 152, 34);
		contentPane.add(lblNewLabel_2_3_1);

		JLabel lblNewLabel_2_3_1_1 = new JLabel("Email Id");
		lblNewLabel_2_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_3_1_1.setBounds(751, 199, 88, 34);
		contentPane.add(lblNewLabel_2_3_1_1);

		JLabel lblNewLabel_2_3_1_1_1 = new JLabel("Address");
		lblNewLabel_2_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_3_1_1_1.setBounds(1122, 199, 82, 34);
		contentPane.add(lblNewLabel_2_3_1_1_1);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setBounds(99, 199, 229, 34);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(498, 199, 229, 34);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(838, 199, 229, 34);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(1231, 199, 258, 34);
		contentPane.add(textField_3);

		JLabel lblNewLabel_2_3_2 = new JLabel("Product Id");
		lblNewLabel_2_3_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_3_2.setBounds(24, 333, 104, 34);
		contentPane.add(lblNewLabel_2_3_2);

		JLabel lblNewLabel_2_3_2_1 = new JLabel("Product Name");
		lblNewLabel_2_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_3_2_1.setBounds(282, 333, 132, 34);
		contentPane.add(lblNewLabel_2_3_2_1);

		JLabel lblNewLabel_2_3_2_1_1 = new JLabel("Rate");
		lblNewLabel_2_3_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_3_2_1_1.setBounds(643, 333, 52, 34);
		contentPane.add(lblNewLabel_2_3_2_1_1);

		JLabel lblNewLabel_2_3_2_1_2 = new JLabel("Quantity");
		lblNewLabel_2_3_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_3_2_1_2.setBounds(859, 333, 88, 34);
		contentPane.add(lblNewLabel_2_3_2_1_2);

		JLabel lblNewLabel_2_3_2_1_3 = new JLabel("Description");
		lblNewLabel_2_3_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_3_2_1_3.setBounds(1106, 333, 104, 34);
		contentPane.add(lblNewLabel_2_3_2_1_3);

		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(121, 333, 132, 34);
		contentPane.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_5.setColumns(10);
		textField_5.setBounds(408, 333, 211, 34);
		contentPane.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_6.setColumns(10);
		textField_6.setBounds(693, 333, 132, 34);
		contentPane.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_7.setColumns(10);
		textField_7.setBounds(943, 333, 132, 34);
		contentPane.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_8.setColumns(10);
		textField_8.setBounds(1215, 333, 274, 34);
		contentPane.add(textField_8);

		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(1401, 390, 88, 34);
		contentPane.add(btnNewButton);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 476, 947, 305);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Product Name", "Description", "Rate", "Quantity", "Total" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);

		JLabel lblNewLabel_3 = new JLabel("Calculations:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(1001, 483, 205, 34);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Total");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(1001, 563, 137, 34);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_4_1 = new JLabel("Paid Amount");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_1.setBounds(1001, 644, 137, 34);
		contentPane.add(lblNewLabel_4_1);

		JLabel lblNewLabel_4_1_1 = new JLabel("Refund Amount");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_1_1.setBounds(1001, 728, 137, 34);
		contentPane.add(lblNewLabel_4_1_1);

		textField_9 = new JTextField();
		textField_9.setBounds(1148, 563, 165, 39);
		contentPane.add(textField_9);
		textField_9.setColumns(10);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(1148, 639, 165, 39);
		contentPane.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(1148, 723, 165, 39);
		contentPane.add(textField_11);

		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(1361, 507, 132, 39);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("Reset");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_1.setBounds(1357, 614, 132, 39);
		contentPane.add(btnNewButton_1_1);

		JButton btnNewButton_1_2 = new JButton("Close");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = JOptionPane.showConfirmDialog(null, "Do you really want to close", "select",
						JOptionPane.YES_NO_OPTION);
				if (i == 0)
					System.exit(0);
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_2.setBounds(1357, 728, 132, 39);
		contentPane.add(btnNewButton_1_2);
	}

}
