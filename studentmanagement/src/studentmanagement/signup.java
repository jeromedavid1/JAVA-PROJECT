package studentmanagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.DropMode;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Component;

public class signup {

	 JFrame signup;
	 private JTextField txtFirstname;
	 private JTextField txtlastname;
	 private JTextPane txtpnFirstName;
	 private JTextPane txtpnLastName;
	 private JTextField txtfathername;
	 private JTextField txtmothername;
	 private JTextPane txtpnFatherName;
	 private JTextPane txtpnFirstName_2;
	 private JTextPane txtpnPhoneNumber;
	 private JTextField txtphonenumber;
	 private JTextField txtemailid;
	 private JTextPane txtpnFatherName_2;
	 private JTextPane txtpnFatherName_1;
	 private JTextField txtdateofbirth;
	 private JTextPane txtpnGender;
	 private JTextPane txtpnCity;
	 private JTextPane txtpnCountry;
	 private JTextField txtcountry;
	 private JTextPane txtpnPreviousSchoolName;
	 private JTextField txtpreviousschoolname;
	 private JTextPane txtpnClass;
	 private JTextPane txtpnSection;
	 private JTextPane txtpnTotalFees;
	 private JTextField txtcreateusername;
	 private JTextPane txtpnFeesPaid;
	 private JTextField txtfeespaid;
	 private JTextPane txtpnCreateUsername;
	 private JTextField txttotalfees;
	 private JTextPane txtpnCreatePassword;
	 private JPasswordField passwordField;
	 private JComboBox comboBox_1;
	 private JComboBox comboBox_2;
	 private JComboBox comboBox_3;
	 private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup window = new signup();
					window.signup.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		signup = new JFrame();
		signup.setPreferredSize(new Dimension(10, 10));
		signup.setMaximizedBounds(new Rectangle(0, 0, 0, 0));
		signup.setSize(new Dimension(10, 10));
		signup.setAlwaysOnTop(true);
		signup.setTitle("Sign up");
		signup.setBounds(100, 100, 750, 650);
		signup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		signup.getContentPane().setLayout(null);
		
		JTextPane txtpnNewAdmission = new JTextPane();
		txtpnNewAdmission.setOpaque(false);
		txtpnNewAdmission.setDropMode(DropMode.INSERT);
		txtpnNewAdmission.setEditable(false);
		txtpnNewAdmission.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtpnNewAdmission.setBackground(new Color(0, 128, 0));
		txtpnNewAdmission.setText("                                                      Student Admission");
		txtpnNewAdmission.setBounds(20, 11, 714, 33);
		signup.getContentPane().add(txtpnNewAdmission);
		
		txtFirstname = new JTextField();
		txtFirstname.setBounds(159, 73, 124, 20);
		signup.getContentPane().add(txtFirstname);
		txtFirstname.setColumns(10);
		
		txtlastname = new JTextField();
		txtlastname.setBounds(500, 73, 124, 20);
		signup.getContentPane().add(txtlastname);
		txtlastname.setColumns(10);
		
		txtpnFirstName = new JTextPane();
		txtpnFirstName.setOpaque(false);
		txtpnFirstName.setEditable(false);
		txtpnFirstName.setText("First Name :");
		txtpnFirstName.setBounds(42, 73, 75, 20);
		signup.getContentPane().add(txtpnFirstName);
		
		txtpnLastName = new JTextPane();
		txtpnLastName.setText("Last Name :");
		txtpnLastName.setOpaque(false);
		txtpnLastName.setEditable(false);
		txtpnLastName.setBounds(376, 73, 75, 20);
		signup.getContentPane().add(txtpnLastName);
		
		txtfathername = new JTextField();
		txtfathername.setColumns(10);
		txtfathername.setBounds(159, 116, 124, 20);
		signup.getContentPane().add(txtfathername);
		
		txtmothername = new JTextField();
		txtmothername.setColumns(10);
		txtmothername.setBounds(500, 116, 124, 20);
		signup.getContentPane().add(txtmothername);
		
		txtpnFatherName = new JTextPane();
		txtpnFatherName.setText("Father Name :");
		txtpnFatherName.setOpaque(false);
		txtpnFatherName.setEditable(false);
		txtpnFatherName.setBounds(33, 116, 95, 20);
		signup.getContentPane().add(txtpnFatherName);
		
		txtpnFirstName_2 = new JTextPane();
		txtpnFirstName_2.setText("Mother Name :");
		txtpnFirstName_2.setOpaque(false);
		txtpnFirstName_2.setEditable(false);
		txtpnFirstName_2.setBounds(367, 116, 95, 20);
		signup.getContentPane().add(txtpnFirstName_2);
		
		txtpnPhoneNumber = new JTextPane();
		txtpnPhoneNumber.setOpaque(false);
		txtpnPhoneNumber.setText("Phone Number :");
		txtpnPhoneNumber.setEditable(false);
		txtpnPhoneNumber.setBounds(22, 158, 106, 20);
		signup.getContentPane().add(txtpnPhoneNumber);
		
		txtphonenumber = new JTextField();
		txtphonenumber.setColumns(10);
		txtphonenumber.setBounds(159, 158, 124, 20);
		signup.getContentPane().add(txtphonenumber);
		
		txtemailid = new JTextField();
		txtemailid.setColumns(10);
		txtemailid.setBounds(500, 158, 124, 20);
		signup.getContentPane().add(txtemailid);
		
		txtpnFatherName_2 = new JTextPane();
		txtpnFatherName_2.setText("Email ID :");
		txtpnFatherName_2.setOpaque(false);
		txtpnFatherName_2.setEditable(false);
		txtpnFatherName_2.setBounds(376, 158, 75, 20);
		signup.getContentPane().add(txtpnFatherName_2);
		
		txtpnFatherName_1 = new JTextPane();
		txtpnFatherName_1.setText("Date of Birth  :");
		txtpnFatherName_1.setOpaque(false);
		txtpnFatherName_1.setEditable(false);
		txtpnFatherName_1.setBounds(367, 202, 84, 20);
		signup.getContentPane().add(txtpnFatherName_1);
		
		txtdateofbirth = new JTextField();
		txtdateofbirth.setColumns(10);
		txtdateofbirth.setBounds(500, 202, 124, 20);
		signup.getContentPane().add(txtdateofbirth);
		
		txtpnGender = new JTextPane();
		txtpnGender.setText("Gender :");
		txtpnGender.setOpaque(false);
		txtpnGender.setEditable(false);
		txtpnGender.setBounds(42, 202, 75, 20);
		signup.getContentPane().add(txtpnGender);
		
		JTextPane txtpnAddress = new JTextPane();
		txtpnAddress.setOpaque(false);
		txtpnAddress.setEditable(false);
		txtpnAddress.setText("Address :");
		txtpnAddress.setBounds(42, 255, 84, 20);
		signup.getContentPane().add(txtpnAddress);
		
		txtpnCity = new JTextPane();
		txtpnCity.setText("State  :");
		txtpnCity.setOpaque(false);
		txtpnCity.setEditable(false);
		txtpnCity.setBounds(33, 306, 106, 20);
		signup.getContentPane().add(txtpnCity);
		
		txtpnCountry = new JTextPane();
		txtpnCountry.setText("City  :");
		txtpnCountry.setOpaque(false);
		txtpnCountry.setEditable(false);
		txtpnCountry.setBounds(376, 306, 106, 20);
		signup.getContentPane().add(txtpnCountry);
		
		txtcountry = new JTextField();
		txtcountry.setColumns(10);
		txtcountry.setBounds(500, 306, 124, 20);
		signup.getContentPane().add(txtcountry);
		
		txtpnPreviousSchoolName = new JTextPane();
		txtpnPreviousSchoolName.setOpaque(false);
		txtpnPreviousSchoolName.setText("Previous School Name :");
		txtpnPreviousSchoolName.setEditable(false);
		txtpnPreviousSchoolName.setBounds(30, 366, 154, 20);
		signup.getContentPane().add(txtpnPreviousSchoolName);
		
		txtpreviousschoolname = new JTextField();
		txtpreviousschoolname.setColumns(10);
		txtpreviousschoolname.setBounds(194, 366, 427, 20);
		signup.getContentPane().add(txtpreviousschoolname);
		
		txtpnClass = new JTextPane();
		txtpnClass.setText("Class  :");
		txtpnClass.setOpaque(false);
		txtpnClass.setEditable(false);
		txtpnClass.setBounds(33, 414, 106, 20);
		signup.getContentPane().add(txtpnClass);
		
		txtpnSection = new JTextPane();
		txtpnSection.setText("Section  :");
		txtpnSection.setOpaque(false);
		txtpnSection.setEditable(false);
		txtpnSection.setBounds(376, 414, 106, 20);
		signup.getContentPane().add(txtpnSection);
		
		txtpnTotalFees = new JTextPane();
		txtpnTotalFees.setText("Total Fees  :");
		txtpnTotalFees.setOpaque(false);
		txtpnTotalFees.setEditable(false);
		txtpnTotalFees.setBounds(22, 466, 106, 20);
		signup.getContentPane().add(txtpnTotalFees);
		
		txtcreateusername = new JTextField();
		txtcreateusername.setColumns(10);
		txtcreateusername.setBounds(159, 517, 124, 20);
		signup.getContentPane().add(txtcreateusername);
		
		txtpnFeesPaid = new JTextPane();
		txtpnFeesPaid.setText("Fees Paid   :");
		txtpnFeesPaid.setOpaque(false);
		txtpnFeesPaid.setEditable(false);
		txtpnFeesPaid.setBounds(376, 466, 106, 20);
		signup.getContentPane().add(txtpnFeesPaid);
		
		txtfeespaid = new JTextField();
		txtfeespaid.setColumns(10);
		txtfeespaid.setBounds(500, 466, 124, 20);
		signup.getContentPane().add(txtfeespaid);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(285, 566, 154, 23);
		signup.getContentPane().add(btnNewButton);
		
		txtpnCreateUsername = new JTextPane();
		txtpnCreateUsername.setText("Create Username :");
		txtpnCreateUsername.setOpaque(false);
		txtpnCreateUsername.setEditable(false);
		txtpnCreateUsername.setBounds(20, 517, 119, 20);
		signup.getContentPane().add(txtpnCreateUsername);
		
		txttotalfees = new JTextField();
		txttotalfees.setColumns(10);
		txttotalfees.setBounds(159, 466, 124, 20);
		signup.getContentPane().add(txttotalfees);
		
		txtpnCreatePassword = new JTextPane();
		txtpnCreatePassword.setText("Create Password :");
		txtpnCreatePassword.setOpaque(false);
		txtpnCreatePassword.setEditable(false);
		txtpnCreatePassword.setBounds(343, 517, 119, 20);
		signup.getContentPane().add(txtpnCreatePassword);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setOpaque(false);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Male", "Female"}));
		comboBox.setBounds(159, 201, 124, 22);
		signup.getContentPane().add(comboBox);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(500, 517, 106, 20);
		signup.getContentPane().add(passwordField);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.setToolTipText("Show Password");
		chckbxNewCheckBox.setBounds(612, 516, 122, 23);
		signup.getContentPane().add(chckbxNewCheckBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setOpaque(false);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII"}));
		comboBox_1.setBounds(159, 414, 124, 22);
		signup.getContentPane().add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select", "A", "B", "C", "D"}));
		comboBox_2.setOpaque(false);
		comboBox_2.setBounds(500, 414, 124, 22);
		signup.getContentPane().add(comboBox_2);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Select", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal"}));
		comboBox_3.setOpaque(false);
		comboBox_3.setBounds(159, 306, 124, 22);
		signup.getContentPane().add(comboBox_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(159, 255, 465, 20);
		signup.getContentPane().add(textField);
		
	}
}
