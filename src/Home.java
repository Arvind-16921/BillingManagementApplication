import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Home extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4,btnNewButton_5,btnNewButton_6,btnNewButton_7,btnNewButton_8;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	int flag = 0;
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1550, 850);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Scroll");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flag == 0) {
					try {
						Thread.sleep(300);
						btnNewButton_1.setVisible(true);
						btnNewButton_5.setVisible(true);
					} catch (InterruptedException e1) {
						JOptionPane.showMessageDialog(null, e1);
					}
					
				}
				else {
					btnNewButton_1.setVisible(false);
					btnNewButton_2.setVisible(false);
					btnNewButton_3.setVisible(false);
					btnNewButton_4.setVisible(false);
					btnNewButton_5.setVisible(false);
					btnNewButton_6.setVisible(false);
					btnNewButton_7.setVisible(false);
					btnNewButton_8.setVisible(false);
					flag = 0;
				}
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton.setBounds(27, 47, 164, 163);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("New Buyer");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Buyer b = new Buyer();
				b.cl.show(b.panel, "panel_1");
				b.setVisible(true);
			}
		});
		btnNewButton_1.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				try {
					Thread.sleep(300);
					btnNewButton_2.setVisible(true);
					btnNewButton_6.setVisible(true);
				} catch (InterruptedException e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_1.setBounds(237, 47, 241, 44);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Update Buyer");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Buyer b = new Buyer();
				b.cl.show(b.panel, "panel_2");
				b.setVisible(true);
			}
		});
		btnNewButton_2.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				try {
					Thread.sleep(300);
					btnNewButton_3.setVisible(true);
					btnNewButton_7.setVisible(true);
				} catch (InterruptedException e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_2.setBounds(529, 47, 290, 44);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Buyer Details");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Buyer b = new Buyer();
				b.cl.show(b.panel, "panel_3");
				b.setVisible(true);
			}
		});
		btnNewButton_3.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				try {
					Thread.sleep(300);
					btnNewButton_4.setVisible(true);
					btnNewButton_8.setVisible(true);
				} catch (InterruptedException e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_3.setBounds(858, 47, 290, 44);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Delete Buyer");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Buyer b = new Buyer();
				b.cl.show(b.panel, "panel_4");
				b.setVisible(true);
			}
		});
		btnNewButton_4.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				flag = 1;
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_4.setBounds(1190, 47, 310, 44);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("New Product");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Product product = new Product();
				product.cl.show(product.panel, "panel_1");
				product.setVisible(true);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_5.setBounds(237, 166, 244, 44);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("Update Product");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Product product = new Product();
				product.cl.show(product.panel, "panel_2");
				product.setVisible(true);
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_6.setBounds(529, 166, 290, 44);
		contentPane.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("Product Details");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Product product = new Product();
				product.cl.show(product.panel, "panel_3");
				product.setVisible(true);
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_7.setBounds(860, 166, 288, 44);
		contentPane.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("Delete Product");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Product product = new Product();
				product.cl.show(product.panel, "panel_4");
				product.setVisible(true);
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_8.setBounds(1190, 166, 310, 44);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Logout");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Login().setVisible(true);
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_9.setBounds(27, 720, 205, 37);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Close");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = JOptionPane.showConfirmDialog(null, "Do you really want to close", "select",JOptionPane.YES_NO_OPTION );
				if(i == 0)
					System.exit(0);
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_10.setBounds(1268, 716, 232, 44);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("Generate Bill");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GenerateBill().setVisible(true);
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 80));
		btnNewButton_11.setBounds(481, 339, 556, 210);
		contentPane.add(btnNewButton_11);
		
		btnNewButton_1.setVisible(false);
		btnNewButton_2.setVisible(false);
		btnNewButton_3.setVisible(false);
		btnNewButton_4.setVisible(false);
		btnNewButton_5.setVisible(false);
		btnNewButton_6.setVisible(false);
		btnNewButton_7.setVisible(false);
		btnNewButton_8.setVisible(false);
	}

}
