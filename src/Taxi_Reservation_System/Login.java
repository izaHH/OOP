package Taxi_Reservation_System;
import javax.swing.*;
import java.awt.*;
import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException; 
import java.io.RandomAccessFile;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import javax.swing.GroupLayout.Alignment;


public class Login extends javax.swing.JFrame{
	
	public Login() {
		getContentPane().setBackground(Color.YELLOW);
		initialize();

	}

	private void initialize() {
		
		jPanel1 = new javax.swing.JPanel();
		jPanel1.setBackground(new Color(255, 255, 153));
		uname = new javax.swing.JLabel();
		uname.setFont(new Font("Arial Nova", Font.BOLD, 15));
		upass = new javax.swing.JLabel();
		upass.setFont(new Font("Arial Nova", Font.BOLD, 15));
		nameTxt = new javax.swing.JTextField();
		pwdTxt = new javax.swing.JTextField();
		enterbtn = new javax.swing.JButton();
		resetbtn = new javax.swing.JButton();
		backbtn = new javax.swing.JButton();
		
		
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("LOGIN");
		
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TAXI RESERVATION LOGIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel1.setToolTipText("Login");
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(null);
        

 
//uname-gui     
        
        uname.setText("Username: ");
        jPanel1.add(uname);
        uname.setBounds(60,180,81,26);
        
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });

 //upass-gui       
        upass.setText("Password: ");
        jPanel1.add(upass);
        upass.setBounds(60, 260, 91, 14);
        
        pwdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdTxtActionPerformed(evt);
            }
        });
 //enterbtn-gui       
        enterbtn.setText("ENTER");
        enterbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterbtnActionPerformed(evt);
            }
        });
        jPanel1.add(enterbtn);
        enterbtn.setBounds(170, 339, 175, 45);
 //resetbtn 
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		resetbtnActionPerformed(evt);
        	}
        });     	
        jPanel1.add(resetbtn);
        resetbtn.setBounds(397, 339, 165, 45);
//backbtn
        backbtn.setText("BACK");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		backbtnActionPerformed(evt);
        	}
        });
        jPanel1.add(backbtn);
        backbtn.setBounds(609, 442, 166,45);
        
        
//-----
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
       // textField = new JTextField();
        nameTxt.setBounds(193, 183, 369, 22);
        jPanel1.add(nameTxt);
        nameTxt.setColumns(10);
        
       // textField_1 = new JTextField();
        pwdTxt.setColumns(10);
        pwdTxt.setBounds(193, 257, 369, 22);
        jPanel1.add(pwdTxt);
        getContentPane().setLayout(layout);

        pack();  
	}
	
	//event_enterbtnActionPerformed
		private static Scanner x;	
		private void enterbtnActionPerformed(java.awt.event.ActionEvent evt) {

			
			boolean found = false;
			String name = nameTxt.getText().toString();
			String pass = pwdTxt.getText().toString();	
			String tempName = "";
			String tempPwd = "";
			try	{
				File filename = new File("Users.txt");
				Scanner x = new Scanner(filename);
				x.useDelimiter("[,\n]");
				
				while(x.hasNextLine() && !found) {
					tempName = x.next();
					tempPwd = x.next(); 
					
					if(tempName.trim().equals(name.trim()) && tempPwd.trim().equals(pass.trim()))
					{
						found = true;

					}else if(!tempName.trim().equals(name.trim()) && !tempPwd.trim().equals(pass.trim())) {
						found = false;
					}
					else{
						
						found = false;					
					}
					
				}
				x.close();
				
				JOptionPane.showMessageDialog(rootPane, "Success! Welcome back to Taxi Reservation.");
				this.hide();
				Menu s = new Menu();
				s.setVisible(true);
			}
			catch(Exception e) {
				
				JOptionPane.showMessageDialog(rootPane, "Error. Please Try Again.");
			}
		}			
	
		
 //event_resetbtnActionPerformed
	private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {
		nameTxt.setText("");
		pwdTxt.setText("");
	}
//event_backbtnActionPerformed	
	private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {
//event_
		this.hide();
		Welcome s = new Welcome();
		s.setVisible(true);
}
//event_unameTxtActionPerformed
	private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {
	//add handling here
	}
	private void pwdTxtActionPerformed(java.awt.event.ActionEvent evt) {
	//add handling here
	}
	
public static void main(String[] args) {
	
	

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Login().setVisible(true);
        }
    });	
	
}
	

	//Declaration variables
//	private static Scanner x;

	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel uname;
	private javax.swing.JLabel upass;
	private javax.swing.JTextField nameTxt;
	private javax.swing.JTextField pwdTxt;
	private javax.swing.JButton enterbtn;
	private javax.swing.JButton resetbtn;
	private javax.swing.JButton backbtn;

}
