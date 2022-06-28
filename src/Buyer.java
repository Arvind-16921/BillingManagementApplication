import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import dao.ConnectionProvider;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.print.PrinterException;

public class Buyer extends JFrame {

	private JPanel contentPane;
	public static CardLayout cl;
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
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private Connection cn;
	private Statement st;
	private ResultSet rs;
	public JPanel panel,panel_1,panel_2,panel_3,panel_4;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buyer frame = new Buyer();
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
	public Buyer() {
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
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		cl = new CardLayout();
		panel.setLayout(cl);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel.add(panel_1, "panel_1");
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New Buyer");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 80));
		lblNewLabel.setBounds(514, 20, 454, 100);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(366, 239, 171, 35);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contact Number");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(366, 316, 171, 35);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email Id");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(366, 408, 171, 35);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Address");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(366, 485, 171, 35);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gender");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setBounds(366, 570, 171, 35);
		panel_1.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setBounds(605, 239, 440, 35);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(605, 318, 440, 35);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(605, 408, 440, 35);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(605, 485, 440, 35);
		panel_1.add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Other"}));
		comboBox.setBounds(605, 570, 440, 35);
		panel_1.add(comboBox);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String name = textField.getText();
					String contactNo = textField_1.getText();
					String emailId = textField_2.getText();
					String address = textField_3.getText();
					String gender = (String)comboBox.getSelectedItem();
					st.executeUpdate("insert into buyer values ('"+name+"','"+contactNo+"','"+emailId+"','"+address+"','"+gender+"')");
					JOptionPane.showMessageDialog(null, "Submitted successfully");
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null,e1);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(50, 714, 171, 35);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				comboBox.setSelectedIndex(0);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(699, 714, 171, 35);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Close");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = JOptionPane.showConfirmDialog(null, "Do you really want to close", "select",JOptionPane.YES_NO_OPTION );
				if(i == 0)
					dispose();
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_1.setBounds(1306, 714, 171, 35);
		panel_1.add(btnNewButton_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(50, 153, 1427, 9);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(50, 657, 1427, 9);
		panel_1.add(separator_1);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.CYAN);
		panel.add(panel_2, "panel_2");
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Update Buyer");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 80));
		lblNewLabel_6.setBounds(484, 34, 553, 84);
		panel_2.add(lblNewLabel_6);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(34, 159, 1452, 2);
		panel_2.add(separator_2);
		
		JLabel lblNewLabel_7 = new JLabel("Contact Number");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_7.setBounds(343, 202, 143, 36);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Name");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_7_1.setBounds(418, 311, 184, 36);
		panel_2.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("Contact Number");
		lblNewLabel_7_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_7_1_1.setBounds(418, 380, 184, 36);
		panel_2.add(lblNewLabel_7_1_1);
		
		JLabel lblNewLabel_7_1_1_1 = new JLabel("Email Id");
		lblNewLabel_7_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_7_1_1_1.setBounds(418, 440, 184, 36);
		panel_2.add(lblNewLabel_7_1_1_1);
		
		JLabel lblNewLabel_7_1_1_1_1 = new JLabel("Address");
		lblNewLabel_7_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_7_1_1_1_1.setBounds(418, 509, 184, 36);
		panel_2.add(lblNewLabel_7_1_1_1_1);
		
		JLabel lblNewLabel_7_1_1_1_1_1 = new JLabel("Gender");
		lblNewLabel_7_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_7_1_1_1_1_1.setBounds(418, 574, 184, 36);
		panel_2.add(lblNewLabel_7_1_1_1_1_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(34, 263, 1452, 2);
		panel_2.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(34, 653, 1452, 8);
		panel_2.add(separator_4);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_4.setBounds(636, 314, 363, 36);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_5.setColumns(10);
		textField_5.setBounds(636, 380, 363, 36);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_6.setColumns(10);
		textField_6.setBounds(634, 443, 363, 36);
		panel_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_7.setColumns(10);
		textField_7.setBounds(634, 509, 363, 36);
		panel_2.add(textField_7);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Other"}));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_1.setBounds(636, 576, 363, 36);
		panel_2.add(comboBox_1);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_8.setBounds(543, 204, 303, 33);
		panel_2.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Search");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String contactNo = textField_8.getText();
					rs = st.executeQuery("select *from buyer where contactNo='"+contactNo+"'");
					if(rs.next()) {
						textField_4.setText(rs.getString(1));
						textField_5.setText(rs.getString(2));
						textField_6.setText(rs.getString(3));
						textField_7.setText(rs.getString(4));
						comboBox_1.setSelectedItem(rs.getString(5));
					}
					else {
						JOptionPane.showMessageDialog(null, "Data not available");
					}
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
			
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(901, 204, 194, 34);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Save");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String name = textField_4.getText();
					String contactNo = textField_5.getText();
					String emailId = textField_6.getText();
					String address = textField_7.getText();
					String gender = (String)comboBox_1.getSelectedItem();
					st.executeUpdate("update buyer set name='"+name+"', contactNo='"+contactNo+"', emailId='"+emailId+"', address='"+address+"', gender='"+gender+"'");
					JOptionPane.showMessageDialog(null, "Record updated");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
					textField_7.setText("");
					comboBox_1.setSelectedIndex(0);
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3.setBounds(34, 699, 184, 36);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Reset");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_8.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				comboBox_1.setSelectedIndex(0);
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3_1.setBounds(679, 699, 184, 36);
		panel_2.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_1_1 = new JButton("Close");
		btnNewButton_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = JOptionPane.showConfirmDialog(null, "Do you really want to close", "select",JOptionPane.YES_NO_OPTION );
				if(i == 0)
					dispose();
			}
		});
		btnNewButton_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3_1_1.setBounds(1302, 699, 184, 36);
		panel_2.add(btnNewButton_3_1_1);
		
		panel_3 = new JPanel();
		panel_3.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				try {
					rs = st.executeQuery("select *from buyer");
					DefaultTableModel tableModel = (DefaultTableModel)table.getModel(); 
					while(rs.next()) {
						tableModel.addRow(new String[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
					}
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		panel_3.setBackground(Color.CYAN);
		panel.add(panel_3, "panel_3");
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Buyer Details");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 80));
		lblNewLabel_8.setBounds(459, 31, 596, 82);
		panel_3.add(lblNewLabel_8);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(40, 147, 1433, 2);
		panel_3.add(separator_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 188, 1433, 461);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Contact Number", "Email Id", "Address", "Gender"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		JTableHeader tableHeader = table.getTableHeader();
		tableHeader.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) tableHeader.getDefaultRenderer();
		renderer.setHorizontalAlignment(SwingConstants.LEFT);
		
		table.setShowGrid(false);
		
		JButton btnNewButton_4 = new JButton("Close");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = JOptionPane.showConfirmDialog(null, "Do you really want to close", "select",JOptionPane.YES_NO_OPTION );
				if(i == 0)
					dispose();
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4.setBounds(1288, 727, 185, 37);
		panel_3.add(btnNewButton_4);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(40, 692, 1433, 2);
		panel_3.add(separator_6);
		
		JButton btnNewButton_7 = new JButton("Print");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					table.print(JTable.PrintMode.FIT_WIDTH);
				} catch (PrinterException e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_7.setBounds(40, 727, 156, 37);
		panel_3.add(btnNewButton_7);
		
		panel_4 = new JPanel();
		panel_4.setBackground(Color.CYAN);
		panel.add(panel_4, "panel_4");
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Delete Buyer");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 80));
		lblNewLabel_9.setBounds(511, 20, 546, 88);
		panel_4.add(lblNewLabel_9);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(26, 135, 1467, 7);
		panel_4.add(separator_7);
		
		JLabel lblNewLabel_10 = new JLabel("Contact Number");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_10.setBounds(376, 165, 169, 32);
		panel_4.add(lblNewLabel_10);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_9.setBounds(596, 165, 328, 32);
		panel_4.add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("Search");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String contactNo = textField_9.getText();
					rs = st.executeQuery("select *from buyer where contactNo='"+contactNo+"'");
					if(rs.next())
					{
						textField_10.setText(rs.getString(1));
						textField_11.setText(rs.getString(2));
						textField_12.setText(rs.getString(3));
						textField_13.setText(rs.getString(4));
						textField_14.setText(rs.getString(5));
					}
					else
						JOptionPane.showMessageDialog(null,"No such record");
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_5.setBounds(966, 165, 180, 38);
		panel_4.add(btnNewButton_5);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(26, 226, 1467, 7);
		panel_4.add(separator_8);
		
		JLabel lblNewLabel_11 = new JLabel("Name");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_11.setBounds(419, 256, 203, 32);
		panel_4.add(lblNewLabel_11);
		
		JLabel lblNewLabel_11_1 = new JLabel("Contact Number");
		lblNewLabel_11_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_11_1.setBounds(419, 320, 203, 32);
		panel_4.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_11_1_1 = new JLabel("Email Id");
		lblNewLabel_11_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_11_1_1.setBounds(419, 388, 203, 32);
		panel_4.add(lblNewLabel_11_1_1);
		
		JLabel lblNewLabel_11_1_1_1 = new JLabel("Address");
		lblNewLabel_11_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_11_1_1_1.setBounds(419, 461, 203, 32);
		panel_4.add(lblNewLabel_11_1_1_1);
		
		JLabel lblNewLabel_11_1_1_2 = new JLabel("Gender");
		lblNewLabel_11_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_11_1_1_2.setBounds(419, 532, 203, 32);
		panel_4.add(lblNewLabel_11_1_1_2);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_10.setBounds(632, 256, 376, 32);
		panel_4.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_11.setColumns(10);
		textField_11.setBounds(632, 320, 376, 32);
		panel_4.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_12.setColumns(10);
		textField_12.setBounds(632, 388, 376, 32);
		panel_4.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_13.setColumns(10);
		textField_13.setBounds(632, 461, 376, 32);
		panel_4.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_14.setColumns(10);
		textField_14.setBounds(632, 532, 376, 32);
		panel_4.add(textField_14);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setBounds(26, 606, 1467, 7);
		panel_4.add(separator_9);
		
		JButton btnNewButton_6 = new JButton("Delete");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String contactNo = textField_9.getText();
					st.executeUpdate("delete from buyer where contactNo='"+contactNo+"'");
					JOptionPane.showMessageDialog(null, "Record deleted");
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_6.setBounds(26, 641, 155, 32);
		panel_4.add(btnNewButton_6);
		
		JButton btnNewButton_6_1 = new JButton("Reset");
		btnNewButton_6_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_6_1.setBounds(659, 641, 155, 32);
		panel_4.add(btnNewButton_6_1);
		
		JButton btnNewButton_6_1_1 = new JButton("Close");
		btnNewButton_6_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = JOptionPane.showConfirmDialog(null, "Do you really want to close", "select",JOptionPane.YES_NO_OPTION );
				if(i == 0)
					dispose();
			}
		});
		btnNewButton_6_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_6_1_1.setBounds(1338, 641, 155, 32);
		panel_4.add(btnNewButton_6_1_1);
	}
}

//create table buyer (name varchar(30), contactNo varchar(10), emailId varchar(30), address varchar(200), gender varchar(10));
