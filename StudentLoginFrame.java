package src_voting_system;

public class StudentLoginFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(StudentLoginFrame.class.getName());
 
   public StudentLoginFrame() {
    initComponents();
    
    java.net.URL loginIconUrl = getClass().getResource("/src_voting_system/images/login1.jpg");
        
        if(loginIconUrl != null){
            javax.swing.ImageIcon originalIcon = new javax.swing.ImageIcon(loginIconUrl);
            java.awt.Image scaledImage = originalIcon.getImage().getScaledInstance(84, 80, java.awt.Image.SCALE_SMOOTH);
            logIcon.setIcon(new javax.swing.ImageIcon(scaledImage));
            logIcon.setText("");
        }
            

    setTitle("CPUT SRC Voting System");
    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);

    jPanel2.setBackground(java.awt.Color.WHITE);

    jTextField1.setText("CPUT SRC Voting System");
    jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    jTextField1.setEditable(false);
    jTextField1.setFocusable(false);
    jTextField1.setBorder(
        javax.swing.BorderFactory.createEmptyBorder(10, 12, 10, 12)
    );

    jLabel1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
    jLabel1.setForeground(new java.awt.Color(20, 73, 145));
    jLabel2.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
    jLabel2.setForeground(new java.awt.Color(20, 73, 145));

    styleInput(txtStudentNumber);
    styleInput(txtPassword);

    styleButton(jButton1, new java.awt.Color(20, 73, 145));
    styleButton(jButton2, new java.awt.Color(90, 110, 130));
}

private void styleInput(javax.swing.JTextField field) {
    field.setBackground(java.awt.Color.WHITE);
    field.setForeground(new java.awt.Color(35, 45, 60));
    field.setBorder(javax.swing.BorderFactory.createCompoundBorder(
        javax.swing.BorderFactory.createLineBorder(
            new java.awt.Color(55, 145, 210), 1
        ),
        javax.swing.BorderFactory.createEmptyBorder(6, 8, 6, 8)
    ));
}

private void styleButton(javax.swing.JButton button, java.awt.Color color) {
    button.setBackground(color);
    button.setForeground(java.awt.Color.WHITE);
    button.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 15));
    button.setFocusPainted(false);
    button.setOpaque(true);
    button.setBorderPainted(false);
    button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtStudentNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        logIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setBackground(new java.awt.Color(0, 0, 153));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("CPUT SRC Voting System");

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Student Number");

        txtStudentNumber.setBackground(new java.awt.Color(255, 255, 255));
        txtStudentNumber.setForeground(new java.awt.Color(0, 0, 0));
        txtStudentNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 153)));
        txtStudentNumber.addActionListener(this::txtStudentNumberActionPerformed);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password");

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 153)));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\CPUT.jpeg")); // NOI18N

        logIcon.setText("jLabel5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(653, 653, 653))
            .addComponent(jTextField1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(507, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton1)
                        .addGap(50, 50, 50)
                        .addComponent(jButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(512, 512, 512))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(logIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(214, 214, 214))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(108, 108, 108))
        );

        pack();
    }// </editor-fold>                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        WelcomeFrame welcomeFrame = new WelcomeFrame();
        welcomeFrame.setLocationRelativeTo(null);
        welcomeFrame.setVisible(true);

        this.dispose();
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String studentNumber = txtStudentNumber.getText().trim();
        String password = new String(txtPassword.getPassword());

        if(studentNumber.isEmpty() || password.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter your student number and password.", "Missing Fields", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if(!studentNumber.matches("\\d{9}")){
            javax.swing.JOptionPane.showMessageDialog(this, "Student number must be exactly 9 digits.", "Invalid Format", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        String lastFiveDigits = studentNumber.substring(4);

        boolean validPasswordStructure = password.matches("[A-Z][a-zA-Z]{2}" + lastFiveDigits + "$");

        if(!validPasswordStructure){
            java.net.URL iconUrl = getClass().getResource("/src_voting_system/images/invalidicon.jpg");
        
        if(iconUrl != null){
            javax.swing.ImageIcon originalIcon = new javax.swing.ImageIcon(iconUrl);
            java.awt.Image scaledImage = originalIcon.getImage().getScaledInstance(48, 48, java.awt.Image.SCALE_SMOOTH);
            javax.swing.ImageIcon errorIcon = new javax.swing.ImageIcon(scaledImage);
            javax.swing.JOptionPane.showMessageDialog(this, "Incorrect password format.\n" +  "Use 3 letters (first capitalized), followed by " + "the last 5 digits of your student number.", "Login Failed", javax.swing.JOptionPane.PLAIN_MESSAGE, errorIcon);
        } else{
            javax.swing.JOptionPane.showMessageDialog(this, "Incorrect password format. ", "Login failed", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
            txtPassword.setText("");
            return;
        }

        if(VoterData.hasVoted(studentNumber)){
            javax.swing.JOptionPane.showMessageDialog(this, "Student Number (" + studentNumber + ") has already voted.", "Voting Not Allowed", javax.swing.JOptionPane.WARNING_MESSAGE);
            txtStudentNumber.setText("");
            txtPassword.setText("");
            return;
        }

        java.net.URL iconUrl1 = getClass().getResource("/src_voting_system/images/validicon.png");
        
        if(iconUrl1 != null){
            javax.swing.ImageIcon originalIcon = new javax.swing.ImageIcon(iconUrl1);
            java.awt.Image scaledImage = originalIcon.getImage().getScaledInstance(48, 48, java.awt.Image.SCALE_SMOOTH);
            javax.swing.ImageIcon successIcon = new javax.swing.ImageIcon(scaledImage);
            javax.swing.JOptionPane.showMessageDialog(this, "Login successful! Proceeding to the ballot.", "Login Successful", javax.swing.JOptionPane.PLAIN_MESSAGE, successIcon);
        } else{
            javax.swing.JOptionPane.showMessageDialog(this, "Login successful! Proceeding to the ballot", "Login Successful", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

        CandidateFrame candidateFrame = new CandidateFrame(studentNumber);
        candidateFrame.setLocationRelativeTo(null);
        candidateFrame.setVisible(true);

        this.dispose();
    }                                        

    private void txtStudentNumberActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    public static void main(String args[]) {
       
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> new StudentLoginFrame().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel logIcon;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtStudentNumber;
    // End of variables declaration                   
}
