package com.idcard;
import com.toedter.calendar.JDateChooser;
import invoice1.*;
import java.awt.Image;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;



public class details11 extends javax.swing.JFrame {
    String doa;
    String imgname = null;
    String path2 = null;
    byte[] person_image;
    String name;
    String add;
    public details11() {
        initComponents();
        date();
        time();      
    }
  
     public void time()
    {
        DateTimeFormatter times=DateTimeFormatter .ofPattern("hh : mm a");
        LocalDateTime now =LocalDateTime.now();
        time.setText(times.format(now));
    }
    public void date()
    {
        DateTimeFormatter dates=DateTimeFormatter .ofPattern("dd/MM/yyyy");
        LocalDateTime now =LocalDateTime.now();
        date.setText(dates.format(now));  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb9 = new javax.swing.JLabel();
        bloodg = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        db = new com.toedter.calendar.JDateChooser();
        lb8 = new javax.swing.JLabel();
        da = new com.toedter.calendar.JDateChooser();
        lb2 = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        lb3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        lbi = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taddress = new javax.swing.JTextArea();
        lb4 = new javax.swing.JLabel();
        tphone = new javax.swing.JTextField();
        btn4 = new javax.swing.JButton();
        plb3 = new javax.swing.JLabel();
        plb4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        lb5 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        tnmsg = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lb6.setText("Select Blood Group");
        jPanel1.add(lb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 210, 40));

        lb7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lb7.setText("Date Of Admission");
        jPanel1.add(lb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 210, 40));

        lb9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lb9.setText("Upload Photograph");
        jPanel1.add(lb9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 210, 40));

        bloodg.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        bloodg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "A+", "B+", "AB+", "O+", "A-", "B-", "AB-", "O-" }));
        jPanel1.add(bloodg, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 300, 100, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 190, 70));

        jButton1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 400, 100, 40));

        db.setDateFormatString("dd/MM/yyyy");
        db.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jPanel1.add(db, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 220, 170, 40));

        lb8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lb8.setText("Date Of Birth");
        jPanel1.add(lb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 210, 40));

        da.setDateFormatString("dd/MM/yyyy");
        da.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jPanel1.add(da, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 130, 170, 40));

        lb2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lb2.setText("Name");
        jPanel1.add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 100, 40));

        tname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tnameFocusLost(evt);
            }
        });
        tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnameActionPerformed(evt);
            }
        });
        tname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tnameKeyPressed(evt);
            }
        });
        jPanel1.add(tname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 280, 50));

        lb3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lb3.setText("Address");
        jPanel1.add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 100, 40));

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 580, 70, 40));

        lbi.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        jPanel1.add(lbi, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 370, 140, 169));

        taddress.setColumns(20);
        taddress.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        taddress.setRows(5);
        taddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                taddressFocusGained(evt);
            }
        });
        taddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taddressMouseClicked(evt);
            }
        });
        taddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                taddressKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(taddress);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 280, 120));

        lb4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lb4.setText("Email");
        jPanel1.add(lb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 130, 40));

        tphone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tphoneKeyPressed(evt);
            }
        });
        jPanel1.add(tphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 280, 50));

        btn4.setBackground(new java.awt.Color(204, 204, 204));
        btn4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn4.setText("Next");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, 90, 40));

        plb3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        plb3.setText("Date :");
        jPanel1.add(plb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 80, 60));

        plb4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        plb4.setText("Time :");
        jPanel1.add(plb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 60));

        email.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 280, 50));

        lb5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lb5.setText("Phone No.");
        jPanel1.add(lb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 130, 40));

        date.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 100, 40));
        jPanel1.add(tnmsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 270, 20));

        time.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 100, 40));

        lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/idcard/ms14.jpg"))); // NOI18N
        jPanel1.add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 640));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1369, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnameActionPerformed

    
    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sdfb = new SimpleDateFormat("yyyy-MM-dd");
            String datea =sdf.format(da.getDate());
            String dateb =sdfb.format(db.getDate());
            
            
            try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/id_card", "root", "");
            String sql="insert into cust_details(name,address,phone,email,doa,dob,blood_group,image,photo)values('"+tname.getText()+"','"+taddress.getText()+"','"+tphone.getText()+"','"+email.getText()+"',+'"+datea+"','"+dateb+"','"+bloodg.getSelectedItem()+"','"+name+"','"+imgname+"')";
            PreparedStatement pst=con.prepareStatement(sql);
            JOptionPane.showMessageDialog(null, "Your ID card is generated successfully.");
            pst.execute();
        }
            catch(Exception e)
        {
            System.out.println("Ex:"+e);
        }
            extra abcd=new extra();
            abcd.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btn4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser= new JFileChooser();
        int i=chooser.showOpenDialog(this);
        if(i==JFileChooser.APPROVE_OPTION)
        {
            File file=chooser.getSelectedFile();
            String path=file.getPath();
            lbi.setIcon(new ImageIcon(path));
            imgname=file.getName();
            name=file.getName();
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tnameFocusLost
        
            
             

    }//GEN-LAST:event_tnameFocusLost

    private void taddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_taddressFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_taddressFocusGained

    private void taddressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taddressMouseClicked
        // TODO add your handling code here:
        if(tname.equals("")){
                JOptionPane.showMessageDialog(null, "gi");
            }
    }//GEN-LAST:event_taddressMouseClicked

    private void tphoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tphoneKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            JOptionPane.showMessageDialog(null, "Plese enter valid phone number.");
            tphone.setText(null);
        }
    }//GEN-LAST:event_tphoneKeyPressed

    private void tnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tnameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            JOptionPane.showMessageDialog(null, "Plese enter valid name.");
            tname.setText(null);
        }
    }//GEN-LAST:event_tnameKeyPressed

    private void taddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taddressKeyPressed
        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            JOptionPane.showMessageDialog(null, "Plese enter valid address.");
            taddress.setText(null);
        }
    }//GEN-LAST:event_taddressKeyPressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(details11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(details11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(details11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(details11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new details11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox bloodg;
    private javax.swing.JButton btn4;
    private com.toedter.calendar.JDateChooser da;
    private javax.swing.JLabel date;
    private com.toedter.calendar.JDateChooser db;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private javax.swing.JLabel lbi;
    private javax.swing.JLabel plb3;
    private javax.swing.JLabel plb4;
    private javax.swing.JTextArea taddress;
    private javax.swing.JLabel time;
    private javax.swing.JTextField tname;
    private javax.swing.JLabel tnmsg;
    private javax.swing.JTextField tphone;
    // End of variables declaration//GEN-END:variables
    private ImageIcon format =null;
  
}
