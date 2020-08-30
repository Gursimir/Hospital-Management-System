package hospital;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.*;

public class AdminSD extends JFrame {

    JComboBox<String> jComboBox1,jComboBox2,jComboBox3,jComboBox4,jComboBox5,jComboBox6,jComboBox7,jComboBox8;
    JLabel jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9,jLabel10,
                               jLabel11,jLabel12,jLabel13,jLabel14,jLabel15,jLabel16,jLabel17,jLabel18,jLabel19,jLabel20,
                               jLabel21,jLabel22,jLabel23,jLabel24,jLabel25,jLabel26,jLabel27,jLabel28,jLabel29,jLabel30,
                               jLabel31,jLabel32,jLabel33,jLabel34,jLabel35,jLabel36,jLabel37,jLabel38,jLabel39,jLabel40,
                               jLabel41,jLabel42,jLabel43,jLabel44,jLabel45,jLabel46,jLabel47,jLabel48,jLabel49,jLabel50,
                               jLabel51,jLabel52,jLabel53,jLabel54,jLabel55,jLabel56,jLabel57,jLabel58,jLabel59,jLabel60,
                               jLabel61,jLabel62,jLabel63,jLabel64,jLabel65,jLabel66,jLabel67,jLabel68,jLabel69,jLabel70,
                               jLabel71,jLabel72,jLabel73,jLabel74,jLabel75,jLabel76,jLabel77,jLabel78,jLabel79,jLabel80,
                               jLabel81,jLabel82,jLabel83,jLabel84,jLabel85,jLabel86,jLabel87,jLabel88,jLabel89,jLabel90,jLabel91;
   
    JPanel jPanel1,jPanel2,jPanel3,jPanel4,jPanel5,jPanel6,jPanel7,jPanel8,jPanel9,jPanel10,
                               jPanel11,jPanel12,jPanel13,jPanel14,jPanel15,jPanel16,jPanel17;
    JScrollPane jScrollPane2;
    JTabbedPane jTabbedPane1;
    JTable jTable1;
    JTextField jTextField1,jTextField2,jTextField3,jTextField4,jTextField5,jTextField6,jTextField7,jTextField8,jTextField9,jTextField10,
                                   jTextField11,jTextField12,jTextField13,jTextField14,jTextField15,jTextField16,jTextField17,jTextField18,jTextField19,jTextField20,
                                   jTextField21,jTextField22,jTextField23,jTextField24,jTextField25,jTextField26,jTextField27,jTextField28,jTextField29,jTextField30,
                                   jTextField31,jTextField32,jTextField33,jTextField34,jTextField35,jTextField36,jTextField37,jTextField38,jTextField39,jTextField40,
                                   jTextField41,jTextField42,jTextField43,jTextField44,jTextField45,jTextField46,jTextField47,jTextField48,jTextField49,jTextField50;
                    
    public AdminSD() {

        jTabbedPane1 = new JTabbedPane();
        jPanel1 = new JPanel();
        jPanel6 = new JPanel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel1 = new JLabel();
        jLabel5 = new JLabel();
        jTextField1 = new JTextField();
        jLabel6 = new JLabel();
        jTextField2 = new JTextField();
        jLabel9 = new JLabel();
        jTextField5 = new JTextField();
        jTextField6 = new JTextField();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jTextField8 = new JTextField();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jTextField9 = new JTextField();
        jTextField10 = new JTextField();
        jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        jTextField11 = new JTextField();
        jTextField12 = new JTextField();
        jLabel16 = new JLabel();
        jLabel17 = new JLabel();
        jTextField13 = new JTextField();
        jLabel19 = new JLabel();
        jLabel7 = new JLabel();
        jPanel7 = new JPanel();
        jLabel8 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jComboBox2 = new JComboBox<>();
        jPanel2 = new JPanel();
        jPanel9 = new JPanel();
        jLabel22 = new JLabel();
        jLabel23 = new JLabel();
        jLabel24 = new JLabel();
        jLabel25 = new JLabel();
        jLabel26 = new JLabel();
        jTextField3 = new JTextField();
        jLabel27 = new JLabel();
        jTextField4 = new JTextField();
        jLabel28 = new JLabel();
        jTextField18 = new JTextField();
        jTextField19 = new JTextField();
        jLabel29 = new JLabel();
        jLabel30 = new JLabel();
        jTextField21 = new JTextField();
        jLabel31 = new JLabel();
        jLabel32 = new JLabel();
        jTextField22 = new JTextField();
        jTextField23 = new JTextField();
        jLabel33 = new JLabel();
        jLabel34 = new JLabel();
        jTextField24 = new JTextField();
        jTextField25 = new JTextField();
        jLabel35 = new JLabel();
        jLabel36 = new JLabel();
        jTextField26 = new JTextField();
        jLabel38 = new JLabel();
        jLabel41 = new JLabel();
        jPanel10 = new JPanel();
        jLabel42 = new JLabel();
        jPanel11 = new JPanel();
        jLabel43 = new JLabel();
        jComboBox3 = new JComboBox<>();
        jComboBox4 = new JComboBox<>();
        jPanel3 = new JPanel();
        jPanel12 = new JPanel();
        jLabel44 = new JLabel();
        jLabel45 = new JLabel();
        jLabel46 = new JLabel();
        jLabel47 = new JLabel();
        jLabel48 = new JLabel();
        jTextField7 = new JTextField();
        jLabel49 = new JLabel();
        jTextField15 = new JTextField();
        jLabel50 = new JLabel();
        jTextField31 = new JTextField();
        jTextField32 = new JTextField();
        jLabel51 = new JLabel();
        jLabel52 = new JLabel();
        jTextField33 = new JTextField();
        jLabel53 = new JLabel();
        jLabel54 = new JLabel();
        jTextField34 = new JTextField();
        jTextField35 = new JTextField();
        jLabel55 = new JLabel();
        jLabel56 = new JLabel();
        jTextField36 = new JTextField();
        jTextField37 = new JTextField();
        jLabel57 = new JLabel();
        jLabel58 = new JLabel();
        jTextField38 = new JTextField();
        jLabel60 = new JLabel();
        jLabel63 = new JLabel();
        jPanel13 = new JPanel();
        jLabel64 = new JLabel();
        jPanel14 = new JPanel();
        jLabel65 = new JLabel();
        jComboBox5 = new JComboBox<>();
        jComboBox6 = new JComboBox<>();
        jPanel5 = new JPanel();
        jPanel16 = new JPanel();
        jLabel70 = new JLabel();
        jLabel71 = new JLabel();
        jLabel72 = new JLabel();
        jLabel73 = new JLabel();
        jLabel74 = new JLabel();
        jTextField16 = new JTextField();
        jLabel75 = new JLabel();
        jTextField20 = new JTextField();
        jLabel76 = new JLabel();
        jTextField41 = new JTextField();
        jTextField42 = new JTextField();
        jLabel77 = new JLabel();
        jLabel78 = new JLabel();
        jTextField43 = new JTextField();
        jLabel79 = new JLabel();
        jLabel80 = new JLabel();
        jTextField44 = new JTextField();
        jTextField45 = new JTextField();
        jLabel81 = new JLabel();
        jLabel82 = new JLabel();
        jTextField46 = new JTextField();
        jTextField47 = new JTextField();
        jLabel83 = new JLabel();
        jLabel84 = new JLabel();
        jTextField48 = new JTextField();
        jLabel86 = new JLabel();
        jLabel89 = new JLabel();
        jPanel17 = new JPanel();
        jLabel91 = new JLabel();
        jComboBox7 = new JComboBox<>();
        jComboBox8 = new JComboBox<>();
        jPanel4 = new JPanel();
        jPanel15 = new JPanel();
        jLabel66 = new JLabel();
        jLabel67 = new JLabel();
        jLabel68 = new JLabel();
        jLabel69 = new JLabel();
        jScrollPane2 = new JScrollPane();
        jTable1 = new JTable();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new Dimension(1366, 700));
        setMinimumSize(new Dimension(200, 200));
        setPreferredSize(new Dimension(1366, 700));

        jTabbedPane1.setBorder(BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new Color(59, 98, 114));

        jLabel2.setFont(new Font("Tahoma", 0, 36)); 
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText("Add Employee");

        jLabel3.setIcon(new ImageIcon("C:\\javaProgram\\Hospital\\src\\main\\resources\\home.png")); 
        jLabel3.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jLabel4.setIcon(new ImageIcon("C:\\javaProgram\\Hospital\\src\\main\\resources\\logout.png")); 
        jLabel4.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 862, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addGap(26, 26, 26))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 1220, 70));

        jLabel1.setIcon(new ImageIcon("C:\\javaProgram\\Hospital\\src\\main\\resources\\staff.png")); 
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 130));

        jLabel5.setFont(new Font("Tahoma", 0, 24)); 
        jLabel5.setForeground(new Color(59, 98, 114));
        jLabel5.setText("Staff ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 110, 50));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 260, 30));

        jLabel6.setFont(new Font("Tahoma", 0, 18)); 
        jLabel6.setForeground(new Color(59, 98, 114));
        jLabel6.setText("First Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 90, 50));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 260, 30));

        jLabel9.setFont(new Font("Tahoma", 0, 18)); 
        jLabel9.setForeground(new Color(59, 98, 114));
        jLabel9.setText("Last Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 90, 50));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 260, 30));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 260, 30));

        jLabel10.setFont(new Font("Tahoma", 0, 18)); 
        jLabel10.setForeground(new Color(59, 98, 114));
        jLabel10.setText("Age");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 90, 50));

        jLabel11.setFont(new Font("Tahoma", 0, 18)); 
        jLabel11.setForeground(new Color(59, 98, 114));
        jLabel11.setText("Gender");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 90, 50));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 260, 30));

        jLabel12.setFont(new Font("Tahoma", 0, 18)); 
        jLabel12.setForeground(new Color(59, 98, 114));
        jLabel12.setText("Phone No.");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 90, 50));

        jLabel13.setFont(new Font("Tahoma", 0, 18)); 
        jLabel13.setForeground(new Color(59, 98, 114));
        jLabel13.setText("Joining Date");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 110, 50));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 260, 30));
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 630, 40));

        jLabel14.setFont(new Font("Tahoma", 0, 18)); 
        jLabel14.setForeground(new Color(59, 98, 114));
        jLabel14.setText("Address");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 90, 50));

        jLabel15.setFont(new Font("Tahoma", 0, 18)); 
        jLabel15.setForeground(new Color(59, 98, 114));
        jLabel15.setText("City");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 90, 50));
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 260, 30));
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 260, 30));

        jLabel16.setFont(new Font("Tahoma", 0, 18)); 
        jLabel16.setForeground(new Color(59, 98, 114));
        jLabel16.setText("State");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 90, 50));

        jLabel17.setFont(new Font("Tahoma", 0, 18)); 
        jLabel17.setForeground(new Color(59, 98, 114));
        jLabel17.setText("Pin");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 90, 50));
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 260, 30));

        jLabel19.setFont(new Font("Tahoma", 0, 18)); 
        jLabel19.setForeground(new Color(59, 98, 114));
        jLabel19.setText("Staff Type");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 550, 100, 50));

        jLabel7.setBorder(BorderFactory.createLineBorder(new Color(59, 98, 114)));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 260, 200, 200));

        jPanel7.setBackground(new Color(59, 98, 114));
        jPanel7.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
        });

        jLabel8.setFont(new Font("Tahoma", 0, 24)); 
        jLabel8.setForeground(new Color(255, 255, 255));
        jLabel8.setText("Add ");

        GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(48, 48, 48))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1206, 150, 150, 50));

        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "", "Male", "Female", "Other" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 260, 30));

        jComboBox2.setModel(new DefaultComboBoxModel<>(new String[] { "Select", "House Staff", "Nurse", "Patient Advocate", "Patient Care", "Social Worker" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, 250, 30));

        jTabbedPane1.addTab("Add Employee", jPanel1);

        jPanel2.setBackground(new Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new Color(59, 98, 114));

        jLabel22.setFont(new Font("Tahoma", 0, 36)); 
        jLabel22.setForeground(new Color(255, 255, 255));
        jLabel22.setText("Delete Employee");

        jLabel23.setIcon(new ImageIcon("C:\\javaProgram\\Hospital\\src\\main\\resources\\home.png")); 
        jLabel23.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                jLabel23MousePressed(evt);
            }
        });

        jLabel24.setIcon(new ImageIcon("C:\\javaProgram\\Hospital\\src\\main\\resources\\logout.png")); 
        jLabel24.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                jLabel24MousePressed(evt);
            }
        });

        GroupLayout jPanel9Layout = new GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 823, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(31, 31, 31)
                .addComponent(jLabel24)
                .addGap(26, 26, 26))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addGap(26, 26, 26))
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 1220, 70));

        jLabel25.setIcon(new ImageIcon("C:\\javaProgram\\Hospital\\src\\main\\resources\\staff.png")); 
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 130));

        jLabel26.setFont(new Font("Tahoma", 0, 24)); 
        jLabel26.setForeground(new Color(59, 98, 114));
        jLabel26.setText("Staff ID");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 110, 50));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 260, 30));

        jLabel27.setFont(new Font("Tahoma", 0, 18)); 
        jLabel27.setForeground(new Color(59, 98, 114));
        jLabel27.setText("First Name");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 90, 50));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 260, 30));

        jLabel28.setFont(new Font("Tahoma", 0, 18)); 
        jLabel28.setForeground(new Color(59, 98, 114));
        jLabel28.setText("Last Name");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 90, 50));
        jPanel2.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 260, 30));
        jPanel2.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 260, 30));

        jLabel29.setFont(new Font("Tahoma", 0, 18)); 
        jLabel29.setForeground(new Color(59, 98, 114));
        jLabel29.setText("Age");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 90, 50));

        jLabel30.setFont(new Font("Tahoma", 0, 18)); 
        jLabel30.setForeground(new Color(59, 98, 114));
        jLabel30.setText("Gender");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 90, 50));
        jPanel2.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 260, 30));

        jLabel31.setFont(new Font("Tahoma", 0, 18)); 
        jLabel31.setForeground(new Color(59, 98, 114));
        jLabel31.setText("Phone No.");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 90, 50));

        jLabel32.setFont(new Font("Tahoma", 0, 18)); 
        jLabel32.setForeground(new Color(59, 98, 114));
        jLabel32.setText("Joining Date");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 120, 50));
        jPanel2.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 260, 30));
        jPanel2.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 630, 40));

        jLabel33.setFont(new Font("Tahoma", 0, 18)); 
        jLabel33.setForeground(new Color(59, 98, 114));
        jLabel33.setText("Address");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 90, 50));

        jLabel34.setFont(new Font("Tahoma", 0, 18)); 
        jLabel34.setForeground(new Color(59, 98, 114));
        jLabel34.setText("City");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 90, 50));
        jPanel2.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 260, 30));
        jPanel2.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 260, 30));

        jLabel35.setFont(new Font("Tahoma", 0, 18)); 
        jLabel35.setForeground(new Color(59, 98, 114));
        jLabel35.setText("State");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 90, 50));

        jLabel36.setFont(new Font("Tahoma", 0, 18)); 
        jLabel36.setForeground(new Color(59, 98, 114));
        jLabel36.setText("Pin");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 90, 50));
        jPanel2.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 260, 30));

        jLabel38.setFont(new Font("Tahoma", 0, 18)); 
        jLabel38.setForeground(new Color(59, 98, 114));
        jLabel38.setText("Staff Type");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 100, 50));

        jLabel41.setBorder(BorderFactory.createLineBorder(new Color(59, 98, 114)));
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 260, 200, 200));

        jPanel10.setBackground(new Color(59, 98, 114));
        jPanel10.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                jPanel10MousePressed(evt);
            }
        });

        jLabel42.setFont(new Font("Tahoma", 0, 24)); 
        jLabel42.setForeground(new Color(255, 255, 255));
        jLabel42.setText("Delete");

        GroupLayout jPanel10Layout = new GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel42)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 150, 150, 50));

        jPanel11.setBackground(new Color(59, 98, 114));
        jPanel11.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                jPanel11MousePressed(evt);
            }
        });

        jLabel43.setFont(new Font("Tahoma", 0, 24)); 
        jLabel43.setForeground(new Color(255, 255, 255));
        jLabel43.setText("Search");

        GroupLayout jPanel11Layout = new GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel43)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, -1, 50));

        jComboBox3.setModel(new DefaultComboBoxModel<>(new String[] { "", "House Staff", "Nurse", "Patient Advocate", "Patient Care", "Social Worker" }));
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, 260, 30));

        jComboBox4.setModel(new DefaultComboBoxModel<>(new String[] { "", "Male", "Female", "Other" }));
        jPanel2.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 260, 30));

        jTabbedPane1.addTab("Delete Employee", jPanel2);

        jPanel3.setBackground(new Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new Color(59, 98, 114));

        jLabel44.setFont(new Font("Tahoma", 0, 36)); 
        jLabel44.setForeground(new Color(255, 255, 255));
        jLabel44.setText("Update Employee");

        jLabel45.setIcon(new ImageIcon("C:\\javaProgram\\Hospital\\src\\main\\resources\\home.png")); 
        jLabel45.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                jLabel45MousePressed(evt);
            }
        });

        jLabel46.setIcon(new ImageIcon("C:\\javaProgram\\Hospital\\src\\main\\resources\\logout.png")); 
        jLabel46.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                jLabel46MousePressed(evt);
            }
        });

        GroupLayout jPanel12Layout = new GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 810, Short.MAX_VALUE)
                .addComponent(jLabel45)
                .addGap(31, 31, 31)
                .addComponent(jLabel46)
                .addGap(26, 26, 26))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel46)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45))
                .addGap(26, 26, 26))
        );

        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 1220, 70));

        jLabel47.setIcon(new ImageIcon("C:\\javaProgram\\Hospital\\src\\main\\resources\\staff.png")); 
        jPanel3.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 130));

        jLabel48.setFont(new Font("Tahoma", 0, 24)); 
        jLabel48.setForeground(new Color(59, 98, 114));
        jLabel48.setText("Staff ID");
        jPanel3.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 110, 50));
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 260, 30));

        jLabel49.setFont(new Font("Tahoma", 0, 18)); 
        jLabel49.setForeground(new Color(59, 98, 114));
        jLabel49.setText("First Name");
        jPanel3.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 90, 50));
        jPanel3.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 260, 30));

        jLabel50.setFont(new Font("Tahoma", 0, 18)); 
        jLabel50.setForeground(new Color(59, 98, 114));
        jLabel50.setText("Last Name");
        jPanel3.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 90, 50));
        jPanel3.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 260, 30));
        jPanel3.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 260, 30));

        jLabel51.setFont(new Font("Tahoma", 0, 18)); 
        jLabel51.setForeground(new Color(59, 98, 114));
        jLabel51.setText("Age");
        jPanel3.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 90, 50));

        jLabel52.setFont(new Font("Tahoma", 0, 18)); 
        jLabel52.setForeground(new Color(59, 98, 114));
        jLabel52.setText("Gender");
        jPanel3.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 90, 50));
        jPanel3.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 260, 30));

        jLabel53.setFont(new Font("Tahoma", 0, 18)); 
        jLabel53.setForeground(new Color(59, 98, 114));
        jLabel53.setText("Phone No.");
        jPanel3.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 90, 50));

        jLabel54.setFont(new Font("Tahoma", 0, 18)); 
        jLabel54.setForeground(new Color(59, 98, 114));
        jLabel54.setText("Joining Date");
        jPanel3.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 100, 50));
        jPanel3.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 260, 30));
        jPanel3.add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 630, 40));

        jLabel55.setFont(new Font("Tahoma", 0, 18)); 
        jLabel55.setForeground(new Color(59, 98, 114));
        jLabel55.setText("Address");
        jPanel3.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 90, 50));

        jLabel56.setFont(new Font("Tahoma", 0, 18)); 
        jLabel56.setForeground(new Color(59, 98, 114));
        jLabel56.setText("City");
        jPanel3.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 90, 50));
        jPanel3.add(jTextField36, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 260, 30));
        jPanel3.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 260, 30));

        jLabel57.setFont(new Font("Tahoma", 0, 18)); 
        jLabel57.setForeground(new Color(59, 98, 114));
        jLabel57.setText("State");
        jPanel3.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 90, 50));

        jLabel58.setFont(new Font("Tahoma", 0, 18)); 
        jLabel58.setForeground(new Color(59, 98, 114));
        jLabel58.setText("Pin");
        jPanel3.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 90, 50));
        jPanel3.add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 260, 30));

        jLabel60.setFont(new Font("Tahoma", 0, 18)); 
        jLabel60.setForeground(new Color(59, 98, 114));
        jLabel60.setText("Staff Type");
        jPanel3.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 100, 50));

        jLabel63.setBorder(BorderFactory.createLineBorder(new Color(59, 98, 114)));
        jPanel3.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 260, 200, 200));

        jPanel13.setBackground(new Color(59, 98, 114));
        jPanel13.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                jPanel13MousePressed(evt);
            }
        });

        jLabel64.setFont(new Font("Tahoma", 0, 24)); 
        jLabel64.setForeground(new Color(255, 255, 255));
        jLabel64.setText("Update");

        GroupLayout jPanel13Layout = new GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel64)
                .addGap(39, 39, 39))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 150, 150, 50));

        jPanel14.setBackground(new Color(59, 98, 114));
        jPanel14.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                jPanel14MousePressed(evt);
            }
        });

        jLabel65.setFont(new Font("Tahoma", 0, 24)); 
        jLabel65.setForeground(new Color(255, 255, 255));
        jLabel65.setText("Search");

        GroupLayout jPanel14Layout = new GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel65)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel65)
                .addContainerGap())
        );

        jPanel3.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, -1, 50));

        jComboBox5.setModel(new DefaultComboBoxModel<>(new String[] { "Select", "House Staff", "Nurse", "Patient Advocate", "Patient Care", "Social Worker" }));
        jPanel3.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, 260, 30));

        jComboBox6.setModel(new DefaultComboBoxModel<>(new String[] { "", "Male", "Female", "Other" }));
        jPanel3.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 260, 30));

        jTabbedPane1.addTab("Update Employee", jPanel3);

        jPanel5.setBackground(new Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new Color(59, 98, 114));

        jLabel70.setFont(new Font("Tahoma", 0, 36)); 
        jLabel70.setForeground(new Color(255, 255, 255));
        jLabel70.setText("Search Employee");

        jLabel71.setIcon(new ImageIcon("C:\\javaProgram\\Hospital\\src\\main\\resources\\home.png")); 
        jLabel71.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                jLabel71MousePressed(evt);
            }
        });

        jLabel72.setIcon(new ImageIcon("C:\\javaProgram\\Hospital\\src\\main\\resources\\logout.png")); 
        jLabel72.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                jLabel72MousePressed(evt);
            }
        });

        GroupLayout jPanel16Layout = new GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel70)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 816, Short.MAX_VALUE)
                .addComponent(jLabel71)
                .addGap(31, 31, 31)
                .addComponent(jLabel72)
                .addGap(26, 26, 26))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel72)
                    .addComponent(jLabel70)
                    .addComponent(jLabel71))
                .addGap(26, 26, 26))
        );

        jPanel5.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 1220, 70));

        jLabel73.setIcon(new ImageIcon("C:\\javaProgram\\Hospital\\src\\main\\resources\\staff.png")); 
        jPanel5.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 130));

        jLabel74.setFont(new Font("Tahoma", 0, 24)); 
        jLabel74.setForeground(new Color(59, 98, 114));
        jLabel74.setText("Staff ID");
        jPanel5.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 110, 50));
        jPanel5.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 260, 30));

        jLabel75.setFont(new Font("Tahoma", 0, 18)); 
        jLabel75.setForeground(new Color(59, 98, 114));
        jLabel75.setText("First Name");
        jPanel5.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 90, 50));
        jPanel5.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 260, 30));

        jLabel76.setFont(new Font("Tahoma", 0, 18)); 
        jLabel76.setForeground(new Color(59, 98, 114));
        jLabel76.setText("Last Name");
        jPanel5.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 90, 50));
        jPanel5.add(jTextField41, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 260, 30));
        jPanel5.add(jTextField42, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 260, 30));

        jLabel77.setFont(new Font("Tahoma", 0, 18)); 
        jLabel77.setForeground(new Color(59, 98, 114));
        jLabel77.setText("Age");
        jPanel5.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 90, 50));

        jLabel78.setFont(new Font("Tahoma", 0, 18)); 
        jLabel78.setForeground(new Color(59, 98, 114));
        jLabel78.setText("Gender");
        jPanel5.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 90, 50));
        jPanel5.add(jTextField43, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 260, 30));

        jLabel79.setFont(new Font("Tahoma", 0, 18)); 
        jLabel79.setForeground(new Color(59, 98, 114));
        jLabel79.setText("Phone No.");
        jPanel5.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 90, 50));

        jLabel80.setFont(new Font("Tahoma", 0, 18)); 
        jLabel80.setForeground(new Color(59, 98, 114));
        jLabel80.setText("Joining Date");
        jPanel5.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 120, 50));
        jPanel5.add(jTextField44, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 260, 30));
        jPanel5.add(jTextField45, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 630, 40));

        jLabel81.setFont(new Font("Tahoma", 0, 18)); 
        jLabel81.setForeground(new Color(59, 98, 114));
        jLabel81.setText("Address");
        jPanel5.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 90, 50));

        jLabel82.setFont(new Font("Tahoma", 0, 18)); 
        jLabel82.setForeground(new Color(59, 98, 114));
        jLabel82.setText("City");
        jPanel5.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 90, 50));
        jPanel5.add(jTextField46, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 260, 30));
        jPanel5.add(jTextField47, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 260, 30));

        jLabel83.setFont(new Font("Tahoma", 0, 18)); 
        jLabel83.setForeground(new Color(59, 98, 114));
        jLabel83.setText("State");
        jPanel5.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 90, 50));

        jLabel84.setFont(new Font("Tahoma", 0, 18)); 
        jLabel84.setForeground(new Color(59, 98, 114));
        jLabel84.setText("Pin");
        jPanel5.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 90, 50));
        jPanel5.add(jTextField48, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 260, 30));

        jLabel86.setFont(new Font("Tahoma", 0, 18)); 
        jLabel86.setForeground(new Color(59, 98, 114));
        jLabel86.setText("Staff Type");
        jPanel5.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 100, 50));

        jLabel89.setBorder(BorderFactory.createLineBorder(new Color(59, 98, 114)));
        jPanel5.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 260, 200, 200));

        jPanel17.setBackground(new Color(59, 98, 114));
        jPanel17.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                jPanel17MousePressed(evt);
            }
        });

        jLabel91.setFont(new Font("Tahoma", 0, 24)); 
        jLabel91.setForeground(new Color(255, 255, 255));
        jLabel91.setText("Search");

        GroupLayout jPanel17Layout = new GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel91)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel91)
                .addContainerGap())
        );

        jPanel5.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, -1, 50));

        jComboBox7.setModel(new DefaultComboBoxModel<>(new String[] { "Select", "House Staff", "Nurse", "Patient Advocate", "Patient Care", "Social Worker" }));
        jPanel5.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, 260, 30));

        jComboBox8.setModel(new DefaultComboBoxModel<>(new String[] { "", "Male", "Female", "Other" }));
        jPanel5.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 260, 30));

        jTabbedPane1.addTab("Search Employee", jPanel5);

        jPanel4.setBackground(new Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new Color(59, 98, 114));

        jLabel66.setFont(new Font("Tahoma", 0, 36)); 
        jLabel66.setForeground(new Color(255, 255, 255));
        jLabel66.setText("View Employee");

        jLabel67.setIcon(new ImageIcon("C:\\javaProgram\\Hospital\\src\\main\\resources\\home.png")); 
        jLabel67.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                jLabel67MousePressed(evt);
            }
        });

        jLabel68.setIcon(new ImageIcon("C:\\javaProgram\\Hospital\\src\\main\\resources\\logout.png")); 
        jLabel68.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                jLabel68MousePressed(evt);
            }
        });

        GroupLayout jPanel15Layout = new GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel66)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 859, Short.MAX_VALUE)
                .addComponent(jLabel67)
                .addGap(31, 31, 31)
                .addComponent(jLabel68)
                .addGap(26, 26, 26))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel68)
                    .addComponent(jLabel66)
                    .addComponent(jLabel67))
                .addGap(26, 26, 26))
        );

        jPanel4.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 1230, 70));

        jLabel69.setIcon(new ImageIcon("C:\\javaProgram\\Hospital\\src\\main\\resources\\staff.png")); 
        jPanel4.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 130));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff ID", "Joining  Date", "First Name", "Last Name", "Age", "Gender", "Phone number", "Address", "Pin", "Staff Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1360, 500));

        jTabbedPane1.addTab("View Employee", jPanel4);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }                        

 private void jLabel3MousePressed(MouseEvent evt) {                                     
        AdminPortal AP = new AdminPortal();
        AP.setVisible(true);
        this.dispose();
    }                                    

    private void jLabel4MousePressed(MouseEvent evt) {                                     
        AdminLogin AL = new AdminLogin();
        AL.setVisible(true);
        this.dispose();
    }                                    

    private void jPanel7MousePressed(MouseEvent evt) {                                     
       
    }                                    

    private void jLabel23MousePressed(MouseEvent evt) {                                      
        AdminPortal AP = new AdminPortal();
        AP.setVisible(true);
        this.dispose();
    }                                     

    private void jLabel24MousePressed(MouseEvent evt) {                                      
       AdminLogin AL = new AdminLogin();
        AL.setVisible(true);
        this.dispose();
    }                                     

    private void jPanel10MousePressed(MouseEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void jPanel11MousePressed(MouseEvent evt) {                                      
       
    }                                                                          

    private void jLabel45MousePressed(MouseEvent evt) {                                      
         AdminPortal AP = new AdminPortal();
        AP.setVisible(true);
        this.dispose();
    }                                     

    private void jLabel46MousePressed(MouseEvent evt) {                                      
       AdminLogin AL = new AdminLogin();
        AL.setVisible(true);
        this.dispose();
    }                                     

    private void jPanel13MousePressed(MouseEvent evt) {                                      
        
    }                                     

    private void jPanel14MousePressed(MouseEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void jLabel67MousePressed(MouseEvent evt) {                                      
         AdminPortal AP = new AdminPortal();
        AP.setVisible(true);
        this.dispose();
    }                                     

    private void jLabel68MousePressed(MouseEvent evt) {                                      
       AdminLogin AL = new AdminLogin();
        AL.setVisible(true);
        this.dispose();
    }                                     

    private void jLabel71MousePressed(MouseEvent evt) {                                      
         AdminPortal AP = new AdminPortal();
        AP.setVisible(true);
        this.dispose();
    }                                     

    private void jLabel72MousePressed(MouseEvent evt) {                                      
        AdminLogin AL = new AdminLogin();
        AL.setVisible(true);
        this.dispose();
    }                                     

    private void jPanel17MousePressed(MouseEvent evt) {                                      
       
    }                                     
                                  

    public static void main(String args[]) {
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSD().setVisible(true);
            }
        });
    }

    
}
