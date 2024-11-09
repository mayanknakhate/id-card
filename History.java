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
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.jar.Attributes.Name;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class History extends javax.swing.JFrame {
    public History() {
        initComponents();
        int td;
        p1.setVisible(false);
        p1.setBackground(Color.white);
        
        
        tin.setBorder(null);
       
        tbg.setBorder(null);
       
        tcn.setBorder(null);
   
        tname.setBorder(null);
        temail.setBorder(null);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        tf1 = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jpanal = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        tname = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbii = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tin = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        tcn = new javax.swing.JLabel();
        temail = new javax.swing.JLabel();
        doa = new javax.swing.JLabel();
        tbg = new javax.swing.JLabel();
        ta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
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
                        .addGap(105, 105, 105)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
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
                .addContainerGap(283, Short.MAX_VALUE))
        );

        jpanal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        p1.setOpaque(false);
        p1.setPreferredSize(new java.awt.Dimension(250, 882));
        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tname.setFont(new java.awt.Font("Serif", 0, 26)); // NOI18N
        p1.add(tname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 300, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Identity Card");
        p1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 150, 60));

        lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/invoice1/pngwing.com (21).png"))); // NOI18N
        p1.add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 680, 100, 80));

        jPanel1.setOpaque(false);

        lbii.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbii, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbii, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        p1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 140, 170));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel7.setText("Authorized Signatory");
        p1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 740, 170, 50));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel9.setText("ID No.          :");
        p1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 110, 40));
        p1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 2, 30, 830));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel10.setText("Blood Group   :");
        p1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 130, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel11.setText("Contact No.  :");
        p1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 110, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel12.setText("Email           :");
        p1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 110, 40));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel13.setText("D.O.A.         :");
        p1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 110, 40));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel14.setText("D.O.B.         :");
        p1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 110, 40));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel15.setText("Address      :");
        p1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 110, 40));

        tin.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        p1.add(tin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 250, 40));

        dob.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        p1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 250, 40));

        tcn.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        p1.add(tcn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 250, 40));

        temail.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        p1.add(temail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 250, 40));

        doa.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        p1.add(doa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 250, 40));

        tbg.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        p1.add(tbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 250, 40));

        ta.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        p1.add(ta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 620, 250, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Java\\Project\\Mayank\\src\\com\\idcard\\Frame 9.png")); // NOI18N
        p1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 780));

        jpanal.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 17, 474, 800));

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jpanal.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 820, 100, -1));

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jButton5.setText("Home");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jpanal.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 820, 100, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jpanal.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 820, 100, -1));

        jScrollPane2.setViewportView(jpanal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(484, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyTyped
        // TODO add your handling code here:
         try       
       {
           String name = tf1.getText();           
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/id_card","root", "");           
           String sql="select * from cust_details where name like '%"+tf1+"%'";
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
                System.out.println(id);
                ta.setText(r.getString("address"));
                tname.setText(r.getString("name"));
                tcn.setText(r.getString("phone"));
                tin.setText(r.getString("id"));
                temail.setText(r.getString("email"));
                doa.setText(r.getString("doa"));
                dob.setText(r.getString("dob"));
                tbg.setText(r.getString("blood_group"));
                Blob image = r.getBlob("photo");
                String imagename=r.getString("image");
                String path = "D:\\Project Images\\"+imagename;
                BufferedImage bi = ImageIO.read(new File(path));
                Image img = bi.getScaledInstance(140, 169, Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(img);
                lbii.setIcon(icon);
            }
            
        }
        catch(Exception we)
        {
            System.out.println("Ex:"+we);
        }
       
    }//GEN-LAST:event_tableMouseClicked

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
    }//GEN-LAST:event_tf1ActionPerformed

    private void tf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyPressed
        try       
       {
           String name = tf1.getText();           
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/id_card","root", "");           
           String sql="select * from cust_details where Name like '%"+tf1+"%'";
           PreparedStatement pst=con.prepareStatement(sql);           
           ResultSet rs=pst.executeQuery();
           table.setModel(DbUtils.resultSetToTableModel(rs));           
       }
       catch(Exception ex)      
       {
           System.out.println("Ex:"+ex);      
       }
    }//GEN-LAST:event_tf1KeyPressed

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        printRecord(jpanal);
    }//GEN-LAST:event_jButton2ActionPerformed

 
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new History().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JLabel doa;
    private javax.swing.JLabel dob;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jpanal;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lbii;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JLabel ta;
    private javax.swing.JTable table;
    private javax.swing.JLabel tbg;
    private javax.swing.JLabel tcn;
    private javax.swing.JLabel temail;
    private javax.swing.JTextField tf1;
    private javax.swing.JLabel tin;
    private javax.swing.JLabel tname;
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
