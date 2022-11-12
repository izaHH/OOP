package Taxi_Reservation_System;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

@SuppressWarnings("serial")
public class Customer_Details extends javax.swing.JFrame{

	public Customer_Details() {
		getContentPane().setBackground(new Color(255, 255, 102));
		init();
	}
	private void init() {
	
		jPanel1 = new javax.swing.JPanel();
		jPanel1.setBackground(new Color(255, 255, 153));
		jLabel1 = new javax.swing.JLabel();
		fullname = new javax.swing.JLabel();
		address = new javax.swing.JLabel();
		contact = new javax.swing.JLabel();
		fnameTxt = new javax.swing.JTextField();
		contactTxt = new javax.swing.JTextField();
		addressTxt = new javax.swing.JTextField();

		backbtn = new javax.swing.JButton();
		clearbtn = new javax.swing.JButton();
		checksavebtn = new javax.swing.JButton();
		savebtn = new javax.swing.JButton();
		
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Customer Detail");
		
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CUSTOMER DETAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel1.setToolTipText("Customer Detail");
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(null);
        
        
 //btn-gui------------------------------------------------------------------       
      //savebtn-
        savebtn.setText("Save");
        savebtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        savebtn.setPreferredSize(new java.awt.Dimension(63, 23));
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	savebtnActionPerformed(evt);
            }
        });
        jPanel1.add(savebtn);
        savebtn.setBounds(215, 335, 119, 44); 
//clearbtn-
        clearbtn.setText("Reset");
        clearbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clearbtn.setPreferredSize(new java.awt.Dimension(63, 23));
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	clearbtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearbtn);
        clearbtn.setBounds(373, 335, 119, 44);         
        
        
 //lbackbtn-gui        
        jPanel1.add(backbtn);
        backbtn.setBounds(545, 455, 143, 32);
        
        backbtn.setText("Back to Menu");
        backbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backbtn.setPreferredSize(new java.awt.Dimension(63, 23));
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        
        
//textfield-------------------------------------------------------------------
        jPanel1.add(fnameTxt);
        fnameTxt.setBounds(215, 100, 277, 22);
        fnameTxt.setColumns(10);
        
        jPanel1.add(addressTxt);
        addressTxt.setBounds(215, 175, 277, 48);
        addressTxt.setColumns(10);     
        
        jPanel1.add(contactTxt);
        contactTxt.setBounds(215, 261, 277, 22);
        contactTxt.setColumns(10);     
            
          
        

        
        
//label-Fullname-gui-------------------------------------------------------- 
        fullname.setText("Fullname:");
        fullname.setBounds(130, 100, 79, 22);
        jPanel1.add(fullname);
        fullname.setHorizontalAlignment(SwingConstants.LEFT);
        fullname.setFont(new Font("Arial Nova", Font.BOLD, 13));
		
		address.setText("Address:");
		address.setBounds(130, 175, 79, 22);
        jPanel1.add(address);
        address.setHorizontalAlignment(SwingConstants.LEFT);
        address.setFont(new Font("Arial Nova", Font.BOLD, 13));   
		
        contact.setText("Contact:");
        contact.setBounds(130, 261, 79, 22);
        jPanel1.add(contact);
        contact.setHorizontalAlignment(SwingConstants.LEFT);
        contact.setFont(new Font("Arial Nova", Font.BOLD, 13));   
		

//label-end-----------------------------------------------------------------------		
      
      //layout--
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        //jLabel1.setIcon(new ImageIcon("C:\\Users\\mizsb\\eclipse-workspace\\Taxi Reservation System\\src\\Taxi_Reservation_System\\taxi1.jpg")); // NOI18N
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
        


        
        pack();
	}
 //event-------------------------------------------------------
      		private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {
      			String fname = fnameTxt.getText().toString();	
      			String add = addressTxt.getText().toString();
      			String contact = contactTxt.getText().toString();	
      			

      			String filepath = "UserDetails.txt";

      			try {
      			
      				FileWriter fw = new FileWriter(filepath, true);
      				BufferedWriter bw = new BufferedWriter(fw);
      				PrintWriter pw = new PrintWriter(bw);
      				
      				pw.println(fname + "," + add + "," + contact);
      				pw.flush();
      				pw.close();
      				
      					JOptionPane.showMessageDialog(rootPane, "Registered Successfully!");
      				}
      			
      			catch(Exception e) {
      			JOptionPane.showMessageDialog(rootPane,"");
      			
      			}
      		
    }// </editor-fold>//GEN-END:initComponents
//evt_backbtnActionPerformed	
	private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {
		new Menu().setVisible(true);
		this.setVisible(false);
	}
//evt_clearbtnActionPerformed
		private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {
			fnameTxt.setText("");
			addressTxt.setText("");
			contactTxt.setText("");

		}	

	public static void main(String[] args) {
       /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Details().setVisible(true);
            }
        });
		
}
	
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel fullname;
	private javax.swing.JLabel address;
	private javax.swing.JLabel contact;

	private javax.swing.JTextField fnameTxt;
	private javax.swing.JTextField addressTxt;
	private javax.swing.JTextField contactTxt;

	
	private javax.swing.JButton checksavebtn;
	private javax.swing.JButton savebtn;
	private javax.swing.JButton clearbtn;
		
	private javax.swing.JButton backbtn;
	private JTextField textField;
}
