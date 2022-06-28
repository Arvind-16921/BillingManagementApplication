import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dao.ConnectionProvider;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Product extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private CardLayout cl;
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
					Product frame = new Product();
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
	public Product() {
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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		cl = new CardLayout();
		panel.setLayout(cl);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel.add(panel_1, "name_1301435476033400");
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New Product");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 80));
		lblNewLabel.setBounds(434, 10, 538, 94);
		panel_1.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(35, 132, 1434, 515);
		panel_1.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Product Id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(551, 159, 116, 39);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ids");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(677, 159, 116, 39);
		panel_1.add(lblNewLabel_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(35, 225, 1434, 422);
		panel_1.add(separator_1);
		
		JLabel lblNewLabel_2 = new JLabel("Product Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(378, 269, 258, 39);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Rate");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(378, 346, 258, 39);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Description");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_2.setBounds(378, 418, 258, 39);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Activate");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_2_1.setBounds(378, 489, 258, 39);
		panel_1.add(lblNewLabel_2_2_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setBounds(643, 269, 313, 39);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(646, 346, 313, 39);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(646, 418, 313, 39);
		panel_1.add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(648, 491, 308, 39);
		panel_1.add(comboBox);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(35, 645, 1434, 2);
		panel_1.add(separator_2);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(35, 712, 145, 33);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(643, 712, 145, 33);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Close");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = JOptionPane.showConfirmDialog(null, "Do you really want to close", "select",JOptionPane.YES_NO_OPTION );
				if(i == 0)
					System.exit(0);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(1324, 712, 145, 33);
		panel_1.add(btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.CYAN);
		panel.add(panel_2, "name_1301442624207900");
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Update Product");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 80));
		lblNewLabel_3.setBounds(417, 30, 720, 79);
		panel_2.add(lblNewLabel_3);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(40, 140, 1433, 540);
		panel_2.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(40, 258, 1433, 422);
		panel_2.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(40, 679, 1433, 1);
		panel_2.add(separator_5);
		
		JLabel lblNewLabel_4 = new JLabel("Product Id");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(371, 177, 229, 42);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Product Name");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_1.setBounds(459, 326, 229, 42);
		panel_2.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Rate");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_1_1.setBounds(459, 411, 229, 42);
		panel_2.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Description");
		lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_1_2.setBounds(459, 491, 229, 42);
		panel_2.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("Activate");
		lblNewLabel_4_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_1_3.setBounds(459, 581, 229, 42);
		panel_2.add(lblNewLabel_4_1_3);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_3.setBounds(536, 177, 292, 42);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(677, 326, 292, 42);
		panel_2.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_5.setColumns(10);
		textField_5.setBounds(677, 411, 292, 42);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_6.setColumns(10);
		textField_6.setBounds(677, 491, 292, 42);
		panel_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_7.setColumns(10);
		textField_7.setBounds(677, 581, 292, 42);
		panel_2.add(textField_7);
		
		JButton btnNewButton_3 = new JButton("Search");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3.setBounds(872, 177, 151, 36);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Update");
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3_1.setBounds(40, 725, 151, 36);
		panel_2.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("Reset");
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3_2.setBounds(677, 725, 151, 36);
		panel_2.add(btnNewButton_3_2);
		
		JButton btnNewButton_3_3 = new JButton("Close");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = JOptionPane.showConfirmDialog(null, "Do you really want to close", "select",JOptionPane.YES_NO_OPTION );
				if(i == 0)
					System.exit(0);
			}
		});
		btnNewButton_3_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3_3.setBounds(1322, 725, 151, 36);
		panel_2.add(btnNewButton_3_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.CYAN);
		panel.add(panel_3, "name_1301444955555500");
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Product Details");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 80));
		lblNewLabel_5.setBounds(391, 21, 624, 80);
		panel_3.add(lblNewLabel_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(40, 144, 1444, 2);
		panel_3.add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(40, 687, 1444, 2);
		panel_3.add(separator_7);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 184, 1444, 470);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Product Id", "Product Name", "Rate", "Description", "Activate"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_4 = new JButton("Print");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4.setBounds(40, 731, 189, 35);
		panel_3.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Close");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = JOptionPane.showConfirmDialog(null, "Do you really want to close", "select",JOptionPane.YES_NO_OPTION );
				if(i == 0)
					System.exit(0);
			}
		});
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_1.setBounds(1295, 731, 189, 35);
		panel_3.add(btnNewButton_4_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.CYAN);
		panel.add(panel_4, "name_1301451445076400");
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("Delete Product");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 80));
		lblNewLabel_3_1.setBounds(407, 10, 720, 79);
		panel_4.add(lblNewLabel_3_1);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setBounds(65, 120, 1433, 540);
		panel_4.add(separator_3_1);
		
		JSeparator separator_4_1 = new JSeparator();
		separator_4_1.setBounds(30, 238, 1433, 422);
		panel_4.add(separator_4_1);
		
		JSeparator separator_5_1 = new JSeparator();
		separator_5_1.setBounds(30, 659, 1433, 1);
		panel_4.add(separator_5_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Product Id");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_2.setBounds(361, 157, 229, 42);
		panel_4.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_1_4 = new JLabel("Product Name");
		lblNewLabel_4_1_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_1_4.setBounds(449, 306, 229, 42);
		panel_4.add(lblNewLabel_4_1_4);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Rate");
		lblNewLabel_4_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_1_1_1.setBounds(449, 391, 229, 42);
		panel_4.add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_4_1_2_1 = new JLabel("Description");
		lblNewLabel_4_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_1_2_1.setBounds(449, 471, 229, 42);
		panel_4.add(lblNewLabel_4_1_2_1);
		
		JLabel lblNewLabel_4_1_3_1 = new JLabel("Activate");
		lblNewLabel_4_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_1_3_1.setBounds(449, 561, 229, 42);
		panel_4.add(lblNewLabel_4_1_3_1);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_8.setColumns(10);
		textField_8.setBounds(526, 157, 292, 42);
		panel_4.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_9.setColumns(10);
		textField_9.setBounds(667, 306, 292, 42);
		panel_4.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_10.setColumns(10);
		textField_10.setBounds(667, 391, 292, 42);
		panel_4.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_11.setColumns(10);
		textField_11.setBounds(667, 471, 292, 42);
		panel_4.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_12.setColumns(10);
		textField_12.setBounds(667, 561, 292, 42);
		panel_4.add(textField_12);
		
		JButton btnNewButton_3_4 = new JButton("Search");
		btnNewButton_3_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3_4.setBounds(862, 157, 151, 36);
		panel_4.add(btnNewButton_3_4);
		
		JButton btnNewButton_3_1_1 = new JButton("Delete");
		btnNewButton_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3_1_1.setBounds(30, 705, 151, 36);
		panel_4.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_3_2_1 = new JButton("Reset");
		btnNewButton_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3_2_1.setBounds(667, 705, 151, 36);
		panel_4.add(btnNewButton_3_2_1);
		
		JButton btnNewButton_3_3_1 = new JButton("Close");
		btnNewButton_3_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = JOptionPane.showConfirmDialog(null, "Do you really want to close", "select",JOptionPane.YES_NO_OPTION );
				if(i == 0)
					System.exit(0);
			}
		});
		btnNewButton_3_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3_3_1.setBounds(1312, 705, 151, 36);
		panel_4.add(btnNewButton_3_3_1);
	}
}
