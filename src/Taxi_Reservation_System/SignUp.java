package Taxi_Reservation_System;
import javax.swing.*;
import java.awt.*;
import java.awt.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.*;
import javax.swing.GroupLayout.Alignment;

import Taxi_Reservation_System.Menu;


public class SignUp extends javax.swing.JFrame{

	
	public SignUp() {
		initialize();
	}
		private void initialize() {
		
		jPanel1 = new javax.swing.JPanel();
		jPanel1.setBackground(new Color(255, 255, 102));
		uname = new javax.swing.JLabel();
		uname.setFont(new Font("Arial Nova", Font.BOLD, 15));
		pass = new javax.swing.JLabel();
		pass.setFont(new Font("Arial Nova", Font.BOLD, 15));
		nameTxt = new javax.swing.JTextField();
		pwdTxt = new javax.swing.JTextField();

		savebtn = new javax.swing.JButton();
		resetbtn = new javax.swing.JButton();
		backbtn = new javax.swing.JButton();
		
		//passwordField1 = new javax.swing.JPasswordField();
		//passwordField2 = new javax.swing.JPasswordField();


		
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("SIGNUP");
		
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TAXI RESERVATION SIGN UP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel1.setToolTipText("Sign Up");
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(null);
//gui------------------------------------------------------------------------------------        
//JLabel 
        uname.setText("Username: ");
        jPanel1.add(uname);
        uname.setBounds(100,145,120,26);
        
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameTxtActionPerformed(evt);
            }
        });

        pass.setText("Password: ");
        jPanel1.add(pass);
        pass.setBounds(100,210,120,26);
        
        pwdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdTxtActionPerformed(evt);
            }
        });
 // password----

				
 
// textField = new JTextField();
        nameTxt.setBounds(221, 147, 369, 22);
        jPanel1.add(nameTxt);
        nameTxt.setColumns(10);

        pwdTxt.setBounds(221, 212, 369, 22);
        jPanel1.add(pwdTxt);
        pwdTxt.setColumns(10);
       
//savebtn       
        savebtn.setText("Save");       
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               savebtnActionPerformed(evt);
            }
        });   
        jPanel1.add(savebtn);
        savebtn.setBounds(231, 403, 166,45);
 //backbtn       
        backbtn.setText("BACK");       
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               backbtnActionPerformed(evt);
            }
        });
        jPanel1.add(backbtn);
        backbtn.setBounds(12, 461, 126,26);
//resetbtn 
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		resetbtnActionPerformed(evt);
        	}
        }); 
        jPanel1.add(resetbtn);
        resetbtn.setBounds(424, 403, 166,45);
        
 //gui-end----------------------------------------------------      
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
      /*  
        passwordField1 = new JPasswordField();
        passwordField1.setBounds(232, 212, 358, 22);
        jPanel1.add(passwordField1);
        
        passwordField2 = new JPasswordField();
        passwordField2.setBounds(232, 276, 358, 22);
        jPanel1.add(passwordField2);
        
*/
        




        
     pack();   
	}
//event-------------------------------------------------------
		private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {
			String uname = nameTxt.getText().toString();	
			String upass = pwdTxt.getText().toString();	
			

			String filepath = "Users.txt";

			try {
			
				FileWriter fw = new FileWriter(filepath, true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				
				pw.println(uname + "," + upass);
				pw.flush();
				pw.close();
				
					JOptionPane.showMessageDialog(rootPane, "Registered Successfully!");
				}
			
			catch(Exception e) {
			JOptionPane.showMessageDialog(rootPane,"");
			
			}
		}
		
		
		private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {
		//event_
				this.hide();
				Welcome b = new Welcome();
				b.setVisible(true);
		}	
	
	
	//event_unameTxtActionPerformed
		private void unameTxtActionPerformed(java.awt.event.ActionEvent evt) {
		//add handling here
		}
		private void pwdTxtActionPerformed(java.awt.event.ActionEvent evt) {
		//add handling here
		}



 //event_resetbtnActionPerformed
		private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {
			nameTxt.setText("");
			pwdTxt.setText("");

		}	
		
//event-end---------------------------------------------------	
	public static void main(String[] args) {
		

	    /* Create and display the form */
	    java.awt.EventQueue.invokeLater(new Runnable() {
	        public void run() {
	            new SignUp().setVisible(true);
	        }
	    });	
		
	}
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel uname;
	private javax.swing.JLabel pass;
	
	private javax.swing.JTextField nameTxt;
	private javax.swing.JTextField pwdTxt;
	private javax.swing.JButton savebtn;
	private javax.swing.JButton resetbtn;
	private javax.swing.JButton backbtn;
	private JPasswordField passwordField1;
	private JPasswordField passwordField2;
}
