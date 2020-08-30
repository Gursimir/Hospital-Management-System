package hospital;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AdminLogin extends JFrame {

    JButton jButton1;
    JLabel jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6;
    JPanel jPanel1,jPanel2,jPanel3;
    JPasswordField jPasswordField1;
    JTextField jTextField1;
   
    public AdminLogin() {

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jLabel2 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jPanel3 = new JPanel();
        jTextField1 = new JTextField();
        jPasswordField1 = new JPasswordField();
        jLabel1 = new JLabel();
        jLabel3 = new JLabel();
        jButton1 = new JButton();
        jLabel4 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new Color(59, 98, 114));

        jLabel2.setIcon(new ImageIcon("C:\\javaProgram\\Hospital\\src\\main\\resources\\back.png")); 
        jLabel2.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                jLabel2MousePressed(e);
            }
        });

        jLabel5.setFont(new Font("Segoe UI Symbol", 0, 14)); 
        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setText("Your health is Your priority");

        jLabel6.setFont(new Font("Constantia", 0, 48)); 
        jLabel6.setForeground(new Color(255, 255, 255));
        jLabel6.setText(" Quality  Care");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(129, 129, 129)
                .addComponent(jLabel5)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new Color(255, 255, 255));
        jPanel3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new Color(239, 234, 234));
        jTextField1.setForeground(new Color(187, 182, 187));
        jTextField1.setText("  Username");
        jTextField1.setBorder(null);
        
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 232, 251, 33));

        jPasswordField1.setBackground(new Color(239, 234, 234));
        jPasswordField1.setForeground(new Color(187, 187, 187));
        jPasswordField1.setText("  Password");
        jPasswordField1.setBorder(null);
        jPanel3.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 296, 251, 33));

        jLabel1.setIcon(new ImageIcon("C:\\javaProgram\\Hospital\\src\\main\\resources\\User.png")); 
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 50));

        jLabel3.setIcon(new ImageIcon("C:\\javaProgram\\Hospital\\src\\main\\resources\\lock.png")); 
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jButton1.setIcon(new ImageIcon("C:\\javaProgram\\Hospital\\src\\main\\resources\\button4.png")); 
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton1ActionPerformed(e);
            }
        });
        
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));
        
        jLabel4.setFont(new Font("Segoe UI Semilight", 1, 24)); 
        jLabel4.setForeground(new Color(59, 98, 114));
        jLabel4.setText("Admin Login Panel");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, 30));

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 501, GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );

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
                        
     private void jButton1ActionPerformed(ActionEvent e){
       if(e.getSource()== jButton1){
          if((jTextField1.getText().equals("Admin"))&&(jPasswordField1.getText().equals("12345678"))){
              AdminPortal ACP = new AdminPortal();
              ACP.setVisible(true);
              this.dispose();
          }
          else{
             JOptionPane.showMessageDialog(null,"Enter the valid Username and password");
          }
       }
     }
                                     
     private void jLabel2MousePressed(MouseEvent e) {                                     
       new HomePage().show();
    }   
   
    
    public static void main(String args[]) {
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }
                      
}
