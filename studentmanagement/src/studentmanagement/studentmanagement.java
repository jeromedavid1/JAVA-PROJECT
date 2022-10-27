package studentmanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.Font;
import java.awt.Window;

import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class studentmanagement {

	protected static final Window frame = null;
	private JFrame frmStudentsPortal;
	private JPasswordField txtpassword;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtusername;
	private JTextPane txtpnUsername;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentmanagement window = new studentmanagement();
					window.frmStudentsPortal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public studentmanagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentsPortal = new JFrame();
		frmStudentsPortal.getContentPane().setEnabled(false);
		frmStudentsPortal.getContentPane().setBackground(UIManager.getColor("CheckBox.interiorBackground"));
		frmStudentsPortal.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 26));
		frmStudentsPortal.setTitle("Students Portal");
		frmStudentsPortal.setBounds(100, 100, 550, 550);
		frmStudentsPortal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentsPortal.getContentPane().setLayout(null);
		
		JTextPane txtpnLoginCredentials = new JTextPane();
		txtpnLoginCredentials.setOpaque(false);
		txtpnLoginCredentials.setBackground(SystemColor.info);
		txtpnLoginCredentials.setContentType("text");
		txtpnLoginCredentials.setEditable(false);
		txtpnLoginCredentials.setFont(new Font("Times New Roman", Font.BOLD, 30));
		txtpnLoginCredentials.setText("Welcome to Students Portal");
		txtpnLoginCredentials.setBounds(91, 60, 458, 56);
		frmStudentsPortal.getContentPane().add(txtpnLoginCredentials);
		
		txtpassword = new JPasswordField();
		txtpassword.setBounds(157, 219, 209, 20);
		frmStudentsPortal.getContentPane().add(txtpassword);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBackground(SystemColor.info);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblPassword.setBounds(157, 206, 65, 14);
		frmStudentsPortal.getContentPane().add(lblPassword);
		
		txtusername = new JTextField();
		txtusername.setBounds(157, 160, 209, 20);
		frmStudentsPortal.getContentPane().add(txtusername);
		txtusername.setColumns(10);
		
		txtpnUsername = new JTextPane();
		txtpnUsername.setBackground(SystemColor.info);
		txtpnUsername.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		txtpnUsername.setText("Username");
		txtpnUsername.setBounds(157, 140, 65, 14);
		frmStudentsPortal.getContentPane().add(txtpnUsername);
		
		JButton btnNewButton =   new JButton("Sign in");
		btnNewButton.setBackground(SystemColor.info);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(157, 274, 209, 35);
		frmStudentsPortal.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Sign up");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			signup su= new signup();
			su.signup.setVisible(true);
			frame.dispose();
			

			}
		});
		btnNewButton_1.setBounds(212, 344, 107, 23);
		frmStudentsPortal.getContentPane().add(btnNewButton_1);
		

	}
}
