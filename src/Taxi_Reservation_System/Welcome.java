package Taxi_Reservation_System;
import javax.swing.*;

import java.awt.*;

@SuppressWarnings("serial")
public class Welcome extends javax.swing.JFrame{
	
	public Welcome() {
		initialize();
	}
	
	private void initialize() {
		jPanel1 = new javax.swing.JPanel();
		jPanel1.setBackground(Color.YELLOW);
		jPanel1.setForeground(Color.LIGHT_GRAY);
		loginbtn = new javax.swing.JButton();
		loginbtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		loginbtn.setForeground(Color.BLACK);
		loginbtn.setBackground(new Color(255, 255, 102));
		signupbtn = new javax.swing.JButton();
		signupbtn.setFont(new Font("Arial Nova", Font.BOLD, 16));
		signupbtn.setForeground(Color.BLACK);
		signupbtn.setBackground(new Color(255, 255, 102));
		jlabel1 = new javax.swing.JLabel();
		jlabel2 = new javax.swing.JLabel();
		jlabel2.setBackground(Color.WHITE);
		taxipic = new javax.swing.JLabel();
		

		
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Taxi Reservation");
		
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TAXI RESERVATION LOGIN/REGISTER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel1.setToolTipText("Welcome");
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(null);

//loginbtn-gui        
        jPanel1.add(loginbtn);
        loginbtn.setBounds(80, 280, 240, 90);
        
        loginbtn.setText("LOGIN");
        loginbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginbtn.setPreferredSize(new java.awt.Dimension(63, 23));
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
//singupbtn-gui        
        jPanel1.add(signupbtn);
        signupbtn.setBounds(380, 280, 240, 90);

        signupbtn.setText("REGISTER");
        signupbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signupbtn.setPreferredSize(new java.awt.Dimension(63, 23));
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	signupbtnActionPerformed(evt);
            }
        });
//jlabel2-gui 
        jlabel2.setText("WELCOME TO TAXI \r\nRESERVATION");
        jlabel2.setBounds(49, 62, 600, 80);
        jPanel1.add(jlabel2);
		jlabel2.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel2.setFont(new Font("Arial Nova", Font.BOLD, 33));
        
//jlabel1-gui
        taxipic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        taxipic.setIcon(new ImageIcon("C:\\Users\\mizsb\\eclipse-workspace\\Taxi Reservation System\\src\\Taxi_Reservation_System\\taxi1.jpg")); // NOI18N
        taxipic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(taxipic);
        taxipic.setBounds(0, 0, 700, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        


        pack();
    }// </editor-fold>//GEN-END:initComponents
//evt_loginbtnActionPerformed	
	private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {
		new Login().setVisible(true);
		this.setVisible(false);
	}
//evt_singupbtnActionPerformed
	private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {
		new SignUp().setVisible(true);
		this.setVisible(false);
	}
	public static void main(String[] args) {
	
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    
    }

	//Declaration Variables
	private javax.swing.JButton loginbtn;
	private javax.swing.JButton signupbtn;
	private javax.swing.JLabel taxipic;
	private javax.swing.JLabel jlabel1;
	private javax.swing.JLabel jlabel2;
	private javax.swing.JPanel jPanel1;
}
