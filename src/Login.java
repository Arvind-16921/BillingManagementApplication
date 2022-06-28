import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dao.ConnectionProvider;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
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
					Login frame = new Login();
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
	public Login() {
		try {
			cn = ConnectionProvider.getConnection();
			st = cn.createStatement();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1450, 800);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(486, 191, 173, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(487, 264, 172, 35);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setBounds(695, 189, 402, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		char defaultCharacter = passwordField.getEchoChar();
		passwordField.setEchoChar(defaultCharacter);
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 16));
		passwordField.setBounds(695, 266, 402, 35);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String name = textField.getText();
					String password = new String(passwordField.getPassword());
					rs = st.executeQuery("select *from user where name='"+name+"' and password='"+password+"'");
					if(rs.next()) {
						new Home().setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Wrong credentials");
						textField.setText("");
						passwordField.setText("");
					}
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(527, 415, 199, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = JOptionPane.showConfirmDialog(null, "Do you really want to close", "select",JOptionPane.YES_NO_OPTION );
				if(i == 0)
					System.exit(0);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(847, 415, 190, 35);
		contentPane.add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("show password");
		chckbxNewCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(chckbxNewCheckBox.isSelected())
					passwordField.setEchoChar((char)0);
				else
					passwordField.setEchoChar(defaultCharacter);
			}
		});
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxNewCheckBox.setBounds(695, 332, 137, 25);
		contentPane.add(chckbxNewCheckBox);
	}
}
// create table User(name varchar(30), password varchar(30));