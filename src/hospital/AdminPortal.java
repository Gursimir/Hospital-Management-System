package hospital;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminPortal extends JFrame {
    
    JButton jButton1;
    JLabel jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9,jLabel10,jLabel11,jLabel12,jLabel13;
    JPanel jPanel1,jPanel2,jPanel3,jPanel4,jPanel5,jPanel6,jPanel7;

    public AdminPortal() {

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        jButton1 = new JButton();
        jPanel3 = new JPanel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jPanel4 = new JPanel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jPanel5 = new JPanel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jPanel6 = new JPanel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jPanel7 = new JPanel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jLabel5 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setMaximumSize(new Dimension(1366, 700));
        jPanel1.setPreferredSize(new Dimension(1366, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new Color(59, 98, 114));
        jPanel2.setMaximumSize(new Dimension(1366, 80));
        jPanel2.setMinimumSize(new Dimension(100, 80));
        jPanel2.setPreferredSize(new Dimension(1366, 80));

        jLabel1.setFont(new Font("Trebuchet MS", 0, 36)); 
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("Admin Portal");

        jButton1.setIcon(new ImageIcon("D:\\Hospital\\src\\hospital\\images\\button5.png"));
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton1ActionPerformed(e);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(356, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(478, 478, 478)
                .addComponent(jButton1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 1240, -1));

        jPanel3.setBackground(new Color(59, 98, 114));

        jLabel2.setFont(new Font("Trebuchet MS", 0, 48));
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText("Welcome");

        jLabel3.setFont(new Font("Trebuchet MS", 0, 18));
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText("to");

        jLabel4.setFont(new Font("Trebuchet MS", 0, 36));
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setText("Admin Portal");

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(jLabel4))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 450, 460));
        
        jPanel4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                jPanel4MouseEntered(e);
            }
            public void mouseExited(MouseEvent e) {
                jPanel4MouseExited(e);
            }
            public void mousePressed(MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        
        jLabel6.setIcon(new ImageIcon("D:\\Hospital\\src\\hospital\\images\\patient1.png"));

        jLabel7.setFont(new Font("Segoe UI", 0, 24));
        jLabel7.setForeground(new Color(59, 98, 114));
        jLabel7.setText("Patient Details");

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 300, 230));
        
        jPanel5.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                jPanel5MouseEntered(e);
            }
            public void mouseExited(MouseEvent e) {
                jPanel5MouseExited(e);
            }
            public void mousePressed(MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });
     
        jLabel10.setIcon(new ImageIcon("D:\\Hospital\\src\\hospital\\images\\receptionist1.png"));

        jLabel11.setFont(new Font("Segoe UI", 0, 24));
        jLabel11.setForeground(new Color(59, 98, 114));
        jLabel11.setText("Receptionist Details");

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel10))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel11)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 300, 210));
        
        jPanel6.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                jPanel6MouseEntered(e);
            }
            public void mouseExited(MouseEvent e) {
                jPanel6MouseExited(e);
            }
            public void mousePressed(MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });

        jLabel8.setFont(new Font("Segoe UI", 0, 24));
        jLabel8.setForeground(new Color(59, 98, 114));
        jLabel8.setIcon(new ImageIcon("D:\\Hospital\\src\\hospital\\images\\doctor1.png"));

        jLabel9.setFont(new Font("Segoe UI", 0, 24));
        jLabel9.setForeground(new Color(59, 98, 114));
        jLabel9.setText("Doctor Details");

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel8))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel9)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 160, 270, 230));
        
        jPanel7.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                jPanel7MouseEntered(e);
            }
            public void mouseExited(MouseEvent e) {
                jPanel7MouseExited(e);
            }
            public void mousePressed(MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
        });

        jLabel12.setIcon(new ImageIcon("D:\\Hospital\\src\\hospital\\images\\staff.png"));

        jLabel13.setFont(new Font("Segoe UI", 0, 24));
        jLabel13.setForeground(new Color(59, 98, 114));
        jLabel13.setText("Lower Staff Details");

        GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel12))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel13)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel12)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 410, 270, 220));

        jLabel5.setIcon(new ImageIcon("D:\\Hospital\\src\\hospital\\images\\admin1.png"));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }                      

   public void jButton1ActionPerformed(ActionEvent e){
        HomePage HP = new HomePage();
        HP.setVisible(true);
        this.dispose();
   }
   
   public void setColor(JPanel panel){
      panel.setBackground(new Color(156,156,156));
   }
   
   public void resetColor(JPanel panel){
      panel.setBackground(new Color(240,240,240));
   }
   
    private void jPanel4MouseEntered(MouseEvent e) {   
        setColor(jPanel4);
    }                                    
    private void jPanel4MouseExited(MouseEvent e) {                                    
        resetColor(jPanel4);
    } 
    private void jPanel4MousePressed(MouseEvent evt) {                                     
        AdminPD APD = new AdminPD();
        APD.setVisible(true);
        this.dispose();
    } 
    
    private void jPanel5MouseEntered(MouseEvent e) {   
        setColor(jPanel5);
    }                                    
    private void jPanel5MouseExited(MouseEvent e) {                                    
        resetColor(jPanel5);
    } 
    private void jPanel5MousePressed(MouseEvent evt) {  
        AdminRD ARD = new AdminRD();
       ARD.setVisible(true);
       this.dispose();
      
    } 
    
    private void jPanel6MouseEntered(MouseEvent e) {   
        setColor(jPanel6);
    }                                    
    private void jPanel6MouseExited(MouseEvent e) {                                    
        resetColor(jPanel6);
    }   
    private void jPanel6MousePressed(MouseEvent evt) {                                     
      AdminDD ADD = new AdminDD();
       ADD.setVisible(true);
       this.dispose();
    } 
    
    private void jPanel7MouseEntered(MouseEvent e) {   
        setColor(jPanel7);
    }                                    
    private void jPanel7MouseExited(MouseEvent e) {                                    
        resetColor(jPanel7);
    }
    private void jPanel7MousePressed(MouseEvent evt) {                                     
        AdminSD ASD = new AdminSD();
        ASD.setVisible(true);
        this.dispose();
    } 
    
    
    public static void main(String args[]) {
      
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPortal().setVisible(true);
            }
        });
    }

                       
    
                   
}
