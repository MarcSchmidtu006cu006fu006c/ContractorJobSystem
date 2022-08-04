package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField usernameTextField;
	private JTextField passwordTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setTitle("Contractor Job System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel loginLabel = new JLabel("Please Login");
		loginLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 32));
		loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		loginLabel.setBounds(6, 6, 890, 38);
		contentPane.add(loginLabel);
		
		JLabel requestLabel = new JLabel("If you do not have an account please click \"Request Access\"");
		requestLabel.setBounds(268, 56, 382, 16);
		contentPane.add(requestLabel);
		
		JLabel usernameLabel = new JLabel("Username: ");
		usernameLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		usernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		usernameLabel.setBounds(245, 146, 94, 23);
		contentPane.add(usernameLabel);
		
		usernameTextField = new JTextField();
		usernameLabel.setLabelFor(usernameTextField);
		usernameTextField.setBounds(332, 144, 244, 26);
		contentPane.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		JLabel passwordLabel = new JLabel("Password: ");
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		passwordLabel.setBounds(245, 181, 94, 23);
		contentPane.add(passwordLabel);
		
		passwordTextField = new JTextField();
		passwordLabel.setLabelFor(passwordTextField);
		passwordTextField.setColumns(10);
		passwordTextField.setBounds(332, 181, 244, 26);
		contentPane.add(passwordTextField);
		
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		loginButton.setBounds(385, 219, 117, 29);
		contentPane.add(loginButton);
		
		JButton requestAccessButton = new JButton("Request Access");
		requestAccessButton.setBounds(377, 288, 147, 23);
		contentPane.add(requestAccessButton);
	}
}
