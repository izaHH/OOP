package Taxi_Reservation_System;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.text.JTextComponent;

@SuppressWarnings("serial")
public class TaxiReservation extends javax.swing.JFrame{

	public TaxiReservation() {
		getContentPane().setBackground(new Color(255, 255, 102));
		init();
	}
	private void init() {
	
		jPanel1 = new javax.swing.JPanel();
		jPanel1.setBackground(new Color(255, 255, 153));
		jrtDisplay = new javax.swing.JTextArea();
		jLabel1 = new javax.swing.JLabel();
		fname = new javax.swing.JLabel();
		carmodel = new javax.swing.JLabel();
		capacity = new javax.swing.JLabel();
		location = new javax.swing.JLabel();
		distance = new javax.swing.JLabel();
		date = new javax.swing.JLabel();
		time = new javax.swing.JLabel();
		
		fnameTxt = new javax.swing.JTextField();
		cmodelTxt = new javax.swing.JTextField();
		capacityTxt = new javax.swing.JTextField();
		locationTxt = new javax.swing.JTextField();	
		dateTxt = new javax.swing.JTextField();
		timeTxt = new javax.swing.JTextField();
		distanceTxt = new javax.swing.JTextField();

		backbtn = new javax.swing.JButton();
		checkrsvbtn = new javax.swing.JButton();
		rsvbtn = new javax.swing.JButton();
		resetbtn = new javax.swing.JButton();		
		
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Taxi Reservation");
		
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TAXI RESERVATION MENU", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel1.setToolTipText("Taxi Reservation Menu");
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(null);
        
        
 //btn-gui------------------------------------------------------------------       
      //rsvbtn-
        rsvbtn.setText("Reserve");
        rsvbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rsvbtn.setPreferredSize(new java.awt.Dimension(63, 23));
        rsvbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	rsvbtnActionPerformed(evt);
            }
        });
        jPanel1.add(rsvbtn);
        rsvbtn.setBounds(128, 334, 119, 44); 
        
//resetbtn-
        resetbtn.setText("Reset");
        resetbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resetbtn.setPreferredSize(new java.awt.Dimension(63, 23));
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	resetbtnActionPerformed(evt);
            }
        });
        jPanel1.add(resetbtn);
        resetbtn.setBounds(259, 334, 119, 44); 
        
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
        fnameTxt.setBounds(128, 60, 245, 22);
        fnameTxt.setColumns(10);
        
        jPanel1.add(cmodelTxt);
        cmodelTxt.setBounds(128, 95, 245, 22);
        cmodelTxt.setColumns(10);
        
        jPanel1.add(capacityTxt);
        capacityTxt.setBounds(128, 140, 245, 22);
        capacityTxt.setColumns(10);     
        
        jPanel1.add(locationTxt);
        locationTxt.setBounds(128, 175, 245, 22);
        locationTxt.setColumns(10);     
        
        jPanel1.add(distanceTxt);
        distanceTxt.setBounds(128, 210, 245, 22);
        distanceTxt.setColumns(10);              
        
        jPanel1.add(dateTxt);
        dateTxt.setBounds(128, 245, 245, 22);
        dateTxt.setColumns(10);     
        
        jPanel1.add(timeTxt);
        timeTxt.setBounds(128, 280, 245, 22);
        timeTxt.setColumns(10);     
        
        
        
//label-carmodel-gui-------------------------------------------------------- 
        fname.setText("Full Name:");
        fname.setBounds(16, 60, 100, 22);
        jPanel1.add(fname);
        fname.setHorizontalAlignment(SwingConstants.LEFT);
        fname.setFont(new Font("Arial Nova", Font.BOLD, 13));
        
        carmodel.setText("Taxi Car Model:");
        carmodel.setBounds(16, 95, 100, 22);
        jPanel1.add(carmodel);
		carmodel.setHorizontalAlignment(SwingConstants.LEFT);
		carmodel.setFont(new Font("Arial Nova", Font.BOLD, 13));
		
        capacity.setText("Capacity:");
        capacity.setBounds(16, 140, 100, 22);
        jPanel1.add(capacity);
        capacity.setHorizontalAlignment(SwingConstants.LEFT);
        capacity.setFont(new Font("Arial Nova", Font.BOLD, 13));   
		
        location.setText("Location:");
        location.setBounds(16, 175, 100, 22);
        jPanel1.add(location);
        location.setHorizontalAlignment(SwingConstants.LEFT);
        location.setFont(new Font("Arial Nova", Font.BOLD, 13));   
		
        distance.setText("Distance (km):");
        distance.setBounds(16, 210, 100, 22);
        jPanel1.add(distance);
        distance.setHorizontalAlignment(SwingConstants.LEFT);
        distance.setFont(new Font("Arial Nova", Font.BOLD, 13));   
		
        date.setText("Date:");
        date.setBounds(16, 245, 100, 22);
        jPanel1.add(date);
        date.setHorizontalAlignment(SwingConstants.LEFT);
        date.setFont(new Font("Arial Nova", Font.BOLD, 13));   
		
        time.setText("Time:");
        time.setBounds(16, 280, 100, 22);
        jPanel1.add(time);
        time.setHorizontalAlignment(SwingConstants.LEFT);
        time.setFont(new Font("Arial Nova", Font.BOLD, 13));   
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
 //jrtDisplay- jTextArea-------------------------------------------------------------------
        jrtDisplay = new JTextArea();
        jrtDisplay.setBounds(390, 60, 280, 245);
        jPanel1.add(jrtDisplay);       


        
        pack();

    }// </editor-fold>//GEN-END:initComponents
//evt_backbtnActionPerformed	
	private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {
		new Menu().setVisible(true);
		this.setVisible(false);
	}
 //event_resetbtnActionPerformed
	private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {
			fnameTxt.setText("");
			cmodelTxt.setText("");
			capacityTxt.setText("");
			locationTxt.setText("");
			distanceTxt.setText("");
			dateTxt.setText("");
			timeTxt.setText("");
	}
//evt_rsvbtnActionPerformed
	private void rsvbtnActionPerformed(java.awt.event.ActionEvent evt) {
		
		String fname = fnameTxt.getText().toString();
		String carmodel = cmodelTxt.getText().toString();	
		String capacity = capacityTxt.getText().toString();	
		String location = locationTxt.getText().toString();	
		String distance = distanceTxt.getText().toString();	
		String date = dateTxt.getText().toString();	
		String time = timeTxt.getText().toString();	
		
		String filepath = "Receipt.txt";
		
		try {
			
			FileWriter fw = new FileWriter(filepath, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println(fname + "," + carmodel + "," + capacity + "," + location + "," + distance + "," + date + "," + time);
			pw.flush();
			pw.close();
			
			
			

			jrtDisplay.append("\tTaxi Reservation" + "\n" +
			"-----------------------------------------------------------------------" + "\n");
			jrtDisplay.append("Renter Name: " + " " + fnameTxt.getText() + "\n");
			jrtDisplay.append("Taxi Model: " + " " + cmodelTxt.getText() + "\n");	
			jrtDisplay.append("Seater Capacity: " + " " + capacityTxt.getText() + "\n");	
			jrtDisplay.append("Destination: " + " " + locationTxt.getText() + "\n");	
			jrtDisplay.append("Distance Travel: " + " " + distanceTxt.getText() + "\n");	
			jrtDisplay.append("Date: " + " " + dateTxt.getText() + "\n");	
			jrtDisplay.append("Time: " + " " + timeTxt.getText() + "\n");	
			
			JOptionPane.showMessageDialog(rootPane, "Your have succesfully reserved a taxi!");
					
		
	}catch(Exception e) {
		//do the code
		}
	}

	public static void main(String[] args) {
       /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaxiReservation().setVisible(true);
            }
        });
		
}
	
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextArea jrtDisplay;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel fname;	
	private javax.swing.JLabel carmodel;
	private javax.swing.JLabel capacity;
	private javax.swing.JLabel location;
	private javax.swing.JLabel distance;
	private javax.swing.JLabel date;
	private javax.swing.JLabel time;
	
	private javax.swing.JTextField fnameTxt;
	private javax.swing.JTextField cmodelTxt;
	private javax.swing.JTextField capacityTxt;
	private javax.swing.JTextField locationTxt;
	private javax.swing.JTextField distanceTxt;
	private javax.swing.JTextField dateTxt;
	private javax.swing.JTextField timeTxt;
	
	private javax.swing.JButton checkrsvbtn;
	private javax.swing.JButton rsvbtn;
	private javax.swing.JButton backbtn;
	private javax.swing.JButton resetbtn;
}
