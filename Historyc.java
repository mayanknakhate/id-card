/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.idcard;

import invoice1.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.jar.Attributes.Name;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Mayank Nakhate
 */
public class Historyc extends javax.swing.JFrame {

    /**
     * Creates new form History
     */
    public Historyc() {
        initComponents();
        int td;
        p1.setVisible(false);
        p1.setBackground(Color.white);
        
      
       
      
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        tf1 = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        p1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        temail = new javax.swing.JTextField();
        tname = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        lbii = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tcn = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tbg = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tdoa = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tdob = new javax.swing.JTextField();
        tfa = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        tf1.setText("Search For....");
        tf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf1FocusGained(evt);
            }
        });
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf1KeyTyped(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btn1.setText("View");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
            .addGroup(p2Layout.createSequentialGroup()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        p1.setPreferredSize(new java.awt.Dimension(250, 882));
        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Identity Card");
        p1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 150, 60));

        lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/invoice1/tick2.jpg"))); // NOI18N
        p1.add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 670, 90, 80));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Authorized Signatory");
        p1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 740, 170, 50));

        tin.setEditable(false);
        tin.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        tin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinActionPerformed(evt);
            }
        });
        p1.add(tin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 270, 40));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("ID No.          :");
        p1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 110, 40));

        temail.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        temail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temailActionPerformed(evt);
            }
        });
        p1.add(temail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 270, 40));

        tname.setFont(new java.awt.Font("Serif", 0, 26)); // NOI18N
        p1.add(tname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 340, 70));
        p1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 2, 30, 830));

        lbii.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbii, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbii, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        p1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 140, 170));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Blood Group    :");
        p1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 120, 40));

        tcn.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        tcn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcnActionPerformed(evt);
            }
        });
        p1.add(tcn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 270, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Contact No.   :");
        p1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 110, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Email            :");
        p1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 110, 40));

        tbg.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        tbg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbgActionPerformed(evt);
            }
        });
        p1.add(tbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, 270, 40));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("D.O.A.          :");
        p1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 110, 40));

        tdoa.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        tdoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdoaActionPerformed(evt);
            }
        });
        p1.add(tdoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 270, 40));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("D.O.B.          :");
        p1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 110, 40));

        tdob.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        tdob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdobActionPerformed(evt);
            }
        });
        p1.add(tdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 270, 40));

        tfa.setColumns(20);
        tfa.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        tfa.setRows(5);
        p1.add(tfa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 620, 270, 80));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Address         :");
        p1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 110, 40));

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jButton5.setText("Home");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        p1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, -1, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        p1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 680, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        p1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 630, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 276, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(444, 444, 444)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(445, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(70, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyTyped
        // TODO add your handling code here:
         try       
       {
           String name = tf1.getText();           
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/invoice","root", "");           
           String sql="select * from invdata where Name like '%"+tf1+"%'";
           PreparedStatement pst=con.prepareStatement(sql);           
           ResultSet rs=pst.executeQuery();
           table.setModel(DbUtils.resultSetToTableModel(rs));           
       }
       catch(Exception ex)      
       {
           System.out.println("Ex:"+ex);      
       }
    }//GEN-LAST:event_tf1KeyTyped

    private void tf1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusGained
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tf1FocusGained
    
    
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/id_card","root","");
            
            String sql="Select * from cust_details";
            
            PreparedStatement pst=con.prepareStatement(sql);
            
            ResultSet rs=pst.executeQuery();
            
            table.setModel(DbUtils.resultSetToTableModel(rs));   //show database data in table
            
        }
        catch(Exception e)
        {
            System.out.println("Ex:"+e);
        }
    }//GEN-LAST:event_btn1ActionPerformed

    
     public class SharedData {

    public int id;

    public SharedData() {
    }

    /**
     * @return the LoginName
     */
    public int getLoginName() {
        return id;
    }

    /**
     * @param LoginName the LoginName to set
     */
    public void setLoginName(int tid) {
        this.id = tid;
    }
}
    
    
    
    
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        TableModel model=table.getModel();
        int row=table.getSelectedRow();
        int tid=(int) model.getValueAt(row,0);
        p2.setVisible(false);
        p1.setVisible(true);
       
        
         try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/id_card", "root", "");
            PreparedStatement pst = con.prepareStatement("select * from cust_details where id="+tid); 
            ResultSet rs = pst.executeQuery();
            ResultSet r = pst.executeQuery();
            while (r.next())
            {
                int id = r.getInt("id");
            }
            
        }
        catch(Exception we)
        {
            System.out.println("Ex:"+we);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void tf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyPressed
        // TODO add your handling code here:
        try       
       {
           String name = tf1.getText();           
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/invoice","root", "");           
           String sql="select * from invdata where Name like '%"+tf1+"%'";
           PreparedStatement pst=con.prepareStatement(sql);           
           ResultSet rs=pst.executeQuery();
           table.setModel(DbUtils.resultSetToTableModel(rs));           
       }
       catch(Exception ex)      
       {
           System.out.println("Ex:"+ex);      
       }
    }//GEN-LAST:event_tf1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        printRecord(p1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        idcard ac=new idcard();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tdobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdobActionPerformed

    private void tdoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdoaActionPerformed

    private void tbgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbgActionPerformed

    private void tcnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcnActionPerformed

    private void temailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temailActionPerformed

    private void tinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tinActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historyc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lbii;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JTable table;
    private javax.swing.JTextField tbg;
    private javax.swing.JTextField tcn;
    private javax.swing.JTextField tdoa;
    private javax.swing.JTextField tdob;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextArea tfa;
    private javax.swing.JTextField tin;
    private javax.swing.JTextField tname;
    // End of variables declaration//GEN-END:variables
public void printRecord(JPanel Panel)
{
    
    
    PrinterJob printerJob = PrinterJob.getPrinterJob();
    printerJob.setPrintable(new Printable() {

        @Override
        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException 
        {
           if(pageIndex > 0){
               return Printable.NO_SUCH_PAGE;
           }
           Graphics2D graphics2D = (Graphics2D)graphics;
           graphics2D.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
           p1.paint(graphics2D);
           return Printable.PAGE_EXISTS;
        }
    });
    boolean returningResult = printerJob.printDialog();
    if(returningResult){
        try{
            printerJob.print();
        }
        catch(PrinterException printerException)
                {
            JOptionPane.showMessageDialog(this, "Print Error : "+ printerException.getMessage());
        }
    }
}
}
