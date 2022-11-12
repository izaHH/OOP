package Taxi_Reservation_System;
import javax.swing.*;
import java.awt.*;
import javax.swing.GroupLayout.Alignment;

@SuppressWarnings("serial")
public class Menu extends javax.swing.JFrame{

	public Menu() {
	init();
		}
	private void init() {
		
		jPanel1 = new javax.swing.JPanel();
		jPanel1.setBackground(Color.WHITE);
		jLabel1 = new javax.swing.JLabel();
		custbtn = new javax.swing.JButton();
		custbtn.setBackground(new Color(255, 255, 102));
		taxirsvbtn = new javax.swing.JButton();
		taxirsvbtn.setBackground(new Color(255, 255, 102));
		logoutbtn = new javax.swing.JButton();
		logoutbtn.setForeground(Color.WHITE);
		logoutbtn.setBackground(Color.GRAY);
			
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Menu");
		
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MENU", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel1.setToolTipText("Menu");
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(null);
		
//GUI-------------------------------------------------	
//custbtn-
        custbtn.setText("Customer Details");
        custbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        custbtn.setPreferredSize(new java.awt.Dimension(63, 23));
        custbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custbtnActionPerformed(evt);
            }
        });
        jPanel1.add(custbtn);
        custbtn.setBounds(204, 267, 240, 90);
//taxirsvbtn-
        taxirsvbtn.setText("Taxi Reservation");
        taxirsvbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        taxirsvbtn.setPreferredSize(new java.awt.Dimension(63, 23));
        taxirsvbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxirsvbtnActionPerformed(evt);
            }
        });
        jPanel1.add(taxirsvbtn);
        taxirsvbtn.setBounds(204, 147, 240, 90);       

//logoutbtn-
        logoutbtn.setText("Logout");
        logoutbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoutbtn.setPreferredSize(new java.awt.Dimension(63, 23));
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	logoutbtnActionPerformed(evt);
            }
        });
        jPanel1.add(logoutbtn);
        logoutbtn.setBounds(576, 464, 112, 23);
//layout--
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new ImageIcon("C:\\Users\\mizsb\\eclipse-workspace\\Taxi Reservation System\\src\\Taxi_Reservation_System\\taxi1.jpg")); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        getContentPane().setLayout(layout);
        
        pack();
        setLocationRelativeTo(null);
	}
//ACTIONPERFORMED-------------------------------------------------

    private void taxirsvbtnActionPerformed(java.awt.event.ActionEvent evt) {
    	new TaxiReservation().setVisible(true);
    	this.setVisible(false);
    }

    private void custbtnActionPerformed(java.awt.event.ActionEvent evt) {
    	new Customer_Details().setVisible(true);
    	this.setVisible(false);
    }	
    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {
    	new Welcome().setVisible(true);
    	this.setVisible(false);
    }
	
	public static void main(String[] args) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
	}
	
//variable declaration	
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JButton custbtn;
	private javax.swing.JButton taxirsvbtn;
	private javax.swing.JButton logoutbtn;

}
