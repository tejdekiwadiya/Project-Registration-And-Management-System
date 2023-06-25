package PRMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class Search extends javax.swing.JFrame {

    Option Parent;

    public Search(Option L) {
        Parent = L;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtngGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        Enrollment = new javax.swing.JTextField();
        lName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lEnrollment = new javax.swing.JLabel();
        txtEnrollment = new javax.swing.JTextField();
        lSemester = new javax.swing.JLabel();
        CSemester = new javax.swing.JComboBox<>();
        LGender = new javax.swing.JLabel();
        RbtnMale = new javax.swing.JRadioButton();
        RbtnFemale = new javax.swing.JRadioButton();
        RbtnOther = new javax.swing.JRadioButton();
        lBirthDate = new javax.swing.JLabel();
        lProTitle = new javax.swing.JLabel();
        txtProTitle = new javax.swing.JTextField();
        lProDes = new javax.swing.JLabel();
        txtfProDes = new javax.swing.JScrollPane();
        txtProDes = new javax.swing.JTextArea();
        lProTec = new javax.swing.JLabel();
        ChkConsole = new javax.swing.JCheckBox();
        ChkSwing = new javax.swing.JCheckBox();
        ChkDatabase = new javax.swing.JCheckBox();
        ChkWeb = new javax.swing.JCheckBox();
        lDivision = new javax.swing.JLabel();
        CDivision = new javax.swing.JComboBox<>();
        btnClear = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtDate = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        title.setBackground(new java.awt.Color(51, 51, 51));
        title.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Enrollment");

        Enrollment.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        Enrollment.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Enrollment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnrollmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Enrollment, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addComponent(Enrollment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lName.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        lName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lName.setText("Name:");

        txtName.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lEnrollment.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        lEnrollment.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lEnrollment.setText("Enrollment:");

        txtEnrollment.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        lSemester.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        lSemester.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lSemester.setText("Semester:");

        CSemester.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        CSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        CSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSemesterActionPerformed(evt);
            }
        });

        LGender.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        LGender.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        LGender.setText("Gender:");

        rbtngGender.add(RbtnMale);
        RbtnMale.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        RbtnMale.setText("Male");
        RbtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtnMaleActionPerformed(evt);
            }
        });

        rbtngGender.add(RbtnFemale);
        RbtnFemale.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        RbtnFemale.setText("Female");

        rbtngGender.add(RbtnOther);
        RbtnOther.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        RbtnOther.setText("Other");

        lBirthDate.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        lBirthDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lBirthDate.setText("Birth Date");

        lProTitle.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        lProTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lProTitle.setText("Project Title:");

        txtProTitle.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        txtProTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProTitleActionPerformed(evt);
            }
        });

        lProDes.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        lProDes.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lProDes.setText("Project Descripsion:");

        txtProDes.setColumns(20);
        txtProDes.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        txtProDes.setRows(5);
        txtProDes.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtfProDes.setViewportView(txtProDes);

        lProTec.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        lProTec.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lProTec.setText("Project Technology:");

        ChkConsole.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        ChkConsole.setText("Console");
        ChkConsole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkConsoleActionPerformed(evt);
            }
        });

        ChkSwing.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        ChkSwing.setText("Swing");
        ChkSwing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkSwingActionPerformed(evt);
            }
        });

        ChkDatabase.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        ChkDatabase.setText("Database");
        ChkDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkDatabaseActionPerformed(evt);
            }
        });

        ChkWeb.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        ChkWeb.setText("Web");
        ChkWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkWebActionPerformed(evt);
            }
        });

        lDivision.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        lDivision.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lDivision.setText("Division:");

        CDivision.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        CDivision.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TC1", "TC2", "TC3", "TC4", "TC5", "TC6", "TC7" }));
        CDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDivisionActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(204, 204, 204));
        btnClear.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 153, 153));
        btnSearch.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 204, 204));
        btnCancel.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelMousePressed(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtDate.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 153, 153));
        btnUpdate.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lProDes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtfProDes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
                                    .addComponent(txtProTitle, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEnrollment, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnUpdate)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSearch)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCancel)
                                        .addGap(1, 1, 1)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lProTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(lBirthDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LGender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lSemester, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lEnrollment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(RbtnMale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RbtnFemale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RbtnOther))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lProTec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ChkConsole)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ChkSwing)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ChkDatabase)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ChkWeb)))
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEnrollment)
                    .addComponent(txtEnrollment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSemester)
                    .addComponent(CSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lDivision)
                    .addComponent(CDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LGender)
                    .addComponent(RbtnMale)
                    .addComponent(RbtnFemale)
                    .addComponent(RbtnOther))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBirthDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lProTitle)
                    .addComponent(txtProTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfProDes, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lProDes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lProTec)
                    .addComponent(ChkConsole)
                    .addComponent(ChkDatabase)
                    .addComponent(ChkWeb)
                    .addComponent(ChkSwing, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnSearch)
                    .addComponent(btnCancel)
                    .addComponent(btnUpdate))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProTitleActionPerformed

    private void ChkConsoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkConsoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkConsoleActionPerformed

    private void ChkSwingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkSwingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkSwingActionPerformed

    private void ChkDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkDatabaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkDatabaseActionPerformed

    private void ChkWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkWebActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkWebActionPerformed

    private void RbtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbtnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbtnMaleActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtName.setText("");
        txtEnrollment.setText("");
        txtProTitle.setText("");
        txtProDes.setText("");
        rbtngGender.clearSelection();
        ChkConsole.setSelected(false);
        ChkSwing.setSelected(false);
        ChkDatabase.setSelected(false);
        ChkWeb.setSelected(false);
        CSemester.setSelectedIndex(0);
        CDivision.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String select1 = "Console, Swing, Database, Web";
        String select2 = "Console";
        String select3 = "Swing";
        String select4 = "Database";
        String select5 = "Web";
        String select6 = "Console, Swing";
        String select7 = "Console, Database";
        String select8 = "Console, Web";
        String select9 = "Swing, Database";
        String select10 = "Swing, Web";
        String select11 = "Database, Web";
        String select12 = "Console, Swing, Database";
        String select13 = "Console, Swing, Web";
        String select14 = "Console, Database, Web";
        String select15 = "Swing, Database, Web";
        String name, enrollment_db, title, descripsion, date;
        String enrollment = Enrollment.getText();
        try {

            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/projects", "root", "");
            PreparedStatement pst = con.prepareStatement("select * from registration_form where enrollment=?");
            pst.setString(1, enrollment);
            ResultSet ps = pst.executeQuery();
            if (ps.next()) {
                name = ps.getString("name");
                enrollment_db = ps.getString("enrollment");
                title = ps.getString("Project Title");
                descripsion = ps.getString("Project Descripsion");
                txtName.setText(name);
                txtEnrollment.setText(enrollment_db);
                String sem1 = "1", sem2 = "2", sem3 = "3", sem4 = "4", sem5 = "5", sem6 = "6", sem7 = "7", sem8 = "8";

                if (sem1.equals(ps.getString("semester"))) {
                    CSemester.setSelectedIndex(0);
                }
                if (sem2.equals(ps.getString("semester"))) {
                    CSemester.setSelectedIndex(1);
                }
                if (sem3.equals(ps.getString("semester"))) {
                    CSemester.setSelectedIndex(2);
                }
                if (sem4.equals(ps.getString("semester"))) {
                    CSemester.setSelectedIndex(3);
                }
                if (sem5.equals(ps.getString("semester"))) {
                    CSemester.setSelectedIndex(4);
                }
                if (sem6.equals(ps.getString("semester"))) {
                    CSemester.setSelectedIndex(5);
                }
                if (sem7.equals(ps.getString("semester"))) {
                    CSemester.setSelectedIndex(6);
                }
                if (sem8.equals(ps.getString("semester"))) {
                    CSemester.setSelectedIndex(7);
                }

                String div1 = "TC1", div2 = "TC2", div3 = "TC3", div4 = "TC4", div5 = "TC5", div6 = "TC6", div7 = "TC7";
                if (div1.equals("division")) {
                    CDivision.setSelectedIndex(0);
                }
                if (div2.equals("division")) {
                    CDivision.setSelectedIndex(1);
                }
                if (div3.equals("division")) {
                    CDivision.setSelectedIndex(2);
                }
                if (div4.equals("division")) {
                    CDivision.setSelectedIndex(3);
                }
                if (div5.equals("division")) {
                    CDivision.setSelectedIndex(4);
                }
                if (div6.equals("division")) {
                    CDivision.setSelectedIndex(5);
                }
                if (div7.equals("division")) {
                    CDivision.setSelectedIndex(6);
                }

                txtProTitle.setText(title);
                txtProDes.setText(descripsion);

                date = ps.getString("dob");
                txtDate.setText(date);

                if (select1.equals(ps.getString("Project Technology"))) {
                    ChkConsole.setSelected(true);
                    ChkSwing.setSelected(true);
                    ChkDatabase.setSelected(true);
                    ChkWeb.setSelected(true);
                }
                if (select2.equals(ps.getString("Project Technology"))) {
                    ChkConsole.setSelected(true);

                }
                if (select3.equals(ps.getString("Project Technology"))) {
                    ChkSwing.setSelected(true);

                }
                if (select4.equals(ps.getString("Project Technology"))) {

                    ChkDatabase.setSelected(true);

                }
                if (select5.equals(ps.getString("Project Technology"))) {

                    ChkWeb.setSelected(true);
                }
                if (select6.equals(ps.getString("Project Technology"))) {
                    ChkConsole.setSelected(true);
                    ChkSwing.setSelected(true);

                }
                if (select7.equals(ps.getString("Project Technology"))) {
                    ChkConsole.setSelected(true);
                    ChkDatabase.setSelected(true);
                }
                if (select8.equals(ps.getString("Project Technology"))) {
                    ChkConsole.setSelected(true);
                    ChkWeb.setSelected(true);
                }
                if (select9.equals(ps.getString("Project Technology"))) {
                    ChkSwing.setSelected(true);
                    ChkDatabase.setSelected(true);
                }
                if (select10.equals(ps.getString("Project Technology"))) {
                    ChkSwing.setSelected(true);
                    ChkWeb.setSelected(true);
                }
                if (select11.equals(ps.getString("Project Technology"))) {
                    ChkDatabase.setSelected(true);
                    ChkWeb.setSelected(true);
                }
                if (select12.equals(ps.getString("Project Technology"))) {
                    ChkConsole.setSelected(true);
                    ChkSwing.setSelected(true);
                    ChkDatabase.setSelected(true);
                }
                if (select13.equals(ps.getString("Project Technology"))) {
                    ChkConsole.setSelected(true);
                    ChkSwing.setSelected(true);
                    ChkWeb.setSelected(true);
                }
                if (select14.equals(ps.getString("Project Technology"))) {
                    ChkConsole.setSelected(true);
                    ChkDatabase.setSelected(true);
                    ChkWeb.setSelected(true);
                }
                if (select15.equals(ps.getString("Project Technology"))) {
                    ChkSwing.setSelected(true);
                    ChkDatabase.setSelected(true);
                    ChkWeb.setSelected(true);
                }

                String male = "Male", female = "Female", other = "Other";

                if (male.equals(ps.getString("gender"))) {
                    RbtnMale.setSelected(true);
                }
                if (female.equals(ps.getString("gender"))) {
                    RbtnFemale.setSelected(true);
                }
                if (other.equals(ps.getString("gender"))) {
                    RbtnOther.setSelected(true);
                }

            } else {
                JOptionPane.showMessageDialog(btnSearch, "Data Not Found");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.toBack();
        this.setVisible(false);
        Parent.setVisible(true);
        Parent.toFront();


    }//GEN-LAST:event_btnCancelActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void CSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSemesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CSemesterActionPerformed

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMousePressed


    }//GEN-LAST:event_btnCancelMousePressed

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchMouseClicked

    private void CDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDivisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CDivisionActionPerformed

    private void EnrollmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnrollmentActionPerformed

    }//GEN-LAST:event_EnrollmentActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String male = "Male";
        String female = "Female";
        String other = "Other";
        String console = "Console";
        String swing = "Swing";
        String database = "Database";
        String web = "Web";
        String select1 = console + ", " + swing + ", " + database + ", " + web;
        String select2 = console;
        String select3 = swing;
        String select4 = database;
        String select5 = web;
        String select6 = console + ", " + swing;
        String select7 = console + ", " + database;
        String select8 = console + ", " + web;
        String select9 = swing + ", " + database;
        String select10 = swing + ", " + web;
        String select11 = database + ", " + web;
        String select12 = console + ", " + swing + ", " + database;
        String select13 = console + ", " + swing + ", " + web;
        String select14 = console + ", " + database + ", " + web;
        String select15 = swing + ", " + database + ", " + web;

        String name = txtName.getText();
        String enrollment = txtEnrollment.getText();
        String semester = CSemester.getSelectedItem().toString();
        String division = CDivision.getSelectedItem().toString();
        String date = txtDate.getText();
        String title = txtProTitle.getText();
        String dec = txtProDes.getText();
        if (txtName.getText().isEmpty() || txtEnrollment.getText().isEmpty() || CSemester.getSelectedItem().equals(0) || CDivision.getSelectedItem().equals(0) || txtDate.getText().isEmpty() || txtProTitle.getText().isEmpty() || txtProDes.getText().isEmpty()) {
            JOptionPane.showMessageDialog(txtName, "Please Fill Empty Filled Or Select Option");
        } else {
            try {

                Class.forName("com.mysql.jdbc.Driver");

                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/projects", "root", "");
                PreparedStatement pst = con.prepareStatement("update registration_form set name=?, "
                        + " semester=?, division=?, gender=?, dob=?, `Project Title`=?, `Project Descripsion`=?, `Project Technology`=? "
                        + "where enrollment=?");
                pst.setString(1, name);

                pst.setString(2, semester);
                pst.setString(3, division);
                if (RbtnMale.isSelected()) {
                    pst.setString(4, male);
                } else if (RbtnFemale.isSelected()) {
                    pst.setString(4, female);
                } else {
                    pst.setString(4, other);
                }
                pst.setString(5, date);
                pst.setString(6, title);
                pst.setString(7, dec);
                if (ChkConsole.isSelected()) {
                    pst.setString(8, select2);
                }
                if (ChkSwing.isSelected()) {
                    pst.setString(8, select3);
                }
                if (ChkDatabase.isSelected()) {
                    pst.setString(8, select4);
                }
                if (ChkWeb.isSelected()) {
                    pst.setString(8, select5);
                }
                if (ChkConsole.isSelected() && ChkSwing.isSelected()) {
                    pst.setString(8, select6);
                }
                if (ChkConsole.isSelected() && ChkDatabase.isSelected()) {
                    pst.setString(8, select7);
                }
                if (ChkConsole.isSelected() && ChkWeb.isSelected()) {
                    pst.setString(8, select8);
                }
                if (ChkSwing.isSelected() && ChkDatabase.isSelected()) {
                    pst.setString(8, select9);
                }
                if (ChkSwing.isSelected() && ChkWeb.isSelected()) {
                    pst.setString(8, select10);
                }
                if (ChkDatabase.isSelected() && ChkWeb.isSelected()) {
                    pst.setString(8, select11);
                }
                if (ChkConsole.isSelected() && ChkSwing.isSelected() && ChkDatabase.isSelected()) {
                    pst.setString(8, select12);
                }
                if (ChkConsole.isSelected() && ChkSwing.isSelected() && ChkWeb.isSelected()) {
                    pst.setString(8, select13);
                }
                if (ChkConsole.isSelected() && ChkDatabase.isSelected() && ChkWeb.isSelected()) {
                    pst.setString(8, select14);
                }
                if (ChkSwing.isSelected() && ChkDatabase.isSelected() && ChkWeb.isSelected()) {
                    pst.setString(8, select15);
                }
                if (ChkConsole.isSelected() && ChkSwing.isSelected() && ChkDatabase.isSelected() && ChkWeb.isSelected()) {
                    pst.setString(8, select1);
                }
                pst.setString(9, enrollment);
                int result = pst.executeUpdate();
                System.out.print("Record inserted Successfully: " + result);
                JOptionPane.showMessageDialog(btnUpdate, "Data Successfuly Stored");

                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Registration().setVisible(true);
//            }
//        });

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Registration().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CDivision;
    private javax.swing.JComboBox<String> CSemester;
    private javax.swing.JCheckBox ChkConsole;
    private javax.swing.JCheckBox ChkDatabase;
    private javax.swing.JCheckBox ChkSwing;
    private javax.swing.JCheckBox ChkWeb;
    private javax.swing.JTextField Enrollment;
    private javax.swing.JLabel LGender;
    private javax.swing.JRadioButton RbtnFemale;
    private javax.swing.JRadioButton RbtnMale;
    private javax.swing.JRadioButton RbtnOther;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lBirthDate;
    private javax.swing.JLabel lDivision;
    private javax.swing.JLabel lEnrollment;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel lProDes;
    private javax.swing.JLabel lProTec;
    private javax.swing.JLabel lProTitle;
    private javax.swing.JLabel lSemester;
    private javax.swing.ButtonGroup rbtngGender;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEnrollment;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtProDes;
    private javax.swing.JTextField txtProTitle;
    private javax.swing.JScrollPane txtfProDes;
    // End of variables declaration//GEN-END:variables
}
