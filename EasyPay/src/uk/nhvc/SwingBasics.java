package uk.nhvc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class SwingBasics {

	private JFrame frmLogin;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTextField txtLoginError;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingBasics window = new SwingBasics();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingBasics() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(239, 94, 82, 26);
		frmLogin.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(239, 132, 82, 26);
		frmLogin.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(144, 99, 93, 16);
		frmLogin.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(144, 137, 61, 16);
		frmLogin.getContentPane().add(lblPassword);
		
		JLabel lblLoginError = new JLabel("");
		lblLoginError.setForeground(Color.RED);
		lblLoginError.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblLoginError.setBounds(104, 40, 281, 16);
		frmLogin.getContentPane().add(lblLoginError);
		

		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Username is: " + txtUsername.getText());
				System.out.println("Password is: " + txtPassword.getText());
				if (txtUsername.getText().equals("Nick") && (txtPassword.getText().equals("Password1234"))) {
					try {
						AddPayment window = new AddPayment();
						window.frmApppayDeposit.setVisible(true);
					} catch (Exception f) {
						f.printStackTrace();
					}
					frmLogin.setVisible(false);
				}
				else {
					lblLoginError.setText("Invalid Username or Password!");
				}

				//dispose();
				//System.exit(0);
			}
		});
		btnSubmit.setBounds(110, 215, 117, 29);
		frmLogin.getContentPane().add(btnSubmit);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(252, 215, 117, 29);
		frmLogin.getContentPane().add(btnExit);
		

		

	}
}
