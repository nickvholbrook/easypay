package uk.nhvc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddPayment {

	JFrame frmApppayDeposit;
	private JTextField txtBalance;
	public int depositAmount;
	public int currentBalance;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AddPayment window = new AddPayment();
//					window.frmApppayDeposit.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public AddPayment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmApppayDeposit = new JFrame();
		frmApppayDeposit.setTitle("AppPay Deposit");
		frmApppayDeposit.setBounds(100, 100, 450, 300);
		frmApppayDeposit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmApppayDeposit.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Current Balance");
		lblNewLabel.setBounds(86, 97, 108, 16);
		frmApppayDeposit.getContentPane().add(lblNewLabel);
		
		txtBalance = new JTextField();
		txtBalance.setBounds(194, 92, 130, 26);
		frmApppayDeposit.getContentPane().add(txtBalance);
		txtBalance.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Deposit Amount");
		lblNewLabel_1.setBounds(86, 141, 108, 16);
		frmApppayDeposit.getContentPane().add(lblNewLabel_1);
		
		JLabel lblDepositSum = new JLabel("");
		lblDepositSum.setBounds(343, 141, 61, 16);
		frmApppayDeposit.getContentPane().add(lblDepositSum);
		
		JSlider sdrDeposit = new JSlider();
		sdrDeposit.setMaximum(10000);
		sdrDeposit.setMinimum(1);
		sdrDeposit.setBounds(194, 138, 137, 29);
		frmApppayDeposit.getContentPane().add(sdrDeposit);
		
		currentBalance = 100;
		txtBalance.setText(Integer.toString(currentBalance));
		
		
		sdrDeposit.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				depositAmount = ((JSlider)e.getSource()).getValue();
				String s = Integer.toString(depositAmount);
				lblDepositSum.setText(s);
				txtBalance.setText(Integer.toString(currentBalance));				
			}
		});
		
		

		
		JButton btnNewButton = new JButton("Add Money");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//depositAmount = ((JSlider)e.getSource()).getValue();
				currentBalance = currentBalance + depositAmount;
				txtBalance.setText(Integer.toString(currentBalance));
			}
		});
		btnNewButton.setBounds(134, 192, 117, 29);
		frmApppayDeposit.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(263, 192, 117, 29);
		frmApppayDeposit.getContentPane().add(btnNewButton_1);
	}
}
