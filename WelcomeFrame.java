package src_voting_system;

public class WelcomeFrame extends javax.swing.JFrame {
    
    public WelcomeFrame() {
        initComponents();
        
        /*setTitle("CPUT SRC Voting System");
        setSize(780, 700);
        setLocationRelativeTo(null);
        
        jPanel2.setBackground(java.awt.Color.WHITE);
        styleButton(btbStart, new java.awt.Color(20, 73, 145));
        styleButton(btbShowResults, new java.awt.Color(55, 145, 210));
        styleButton(jButton3, new java.awt.Color(90, 110, 130));*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btbStart = new javax.swing.JButton();
        btbShowResults = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        btbStart.setBackground(new java.awt.Color(0, 0, 153));
        btbStart.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btbStart.setForeground(new java.awt.Color(255, 255, 255));
        btbStart.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\Vote.jpeg")); // NOI18N
        btbStart.setText("Start voting");
        btbStart.addActionListener(this::btbStartActionPerformed);

        btbShowResults.setBackground(new java.awt.Color(0, 204, 255));
        btbShowResults.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btbShowResults.setForeground(new java.awt.Color(255, 255, 255));
        btbShowResults.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\Results.jpeg")); // NOI18N
        btbShowResults.setText("View Results");
        btbShowResults.addActionListener(this::btbShowResultsActionPerformed);

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\Exit.jpeg")); // NOI18N
        jButton3.setText("Exit                ");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("SRC ELECTION");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Automated Voting System");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 204, 255));
        jLabel3.setText("\"Your Vote, Our Future.\"");

        jTextField1.setBackground(new java.awt.Color(0, 51, 153));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("CPUT SRC Voting System");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\CPUT.jpeg")); // NOI18N

        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1454, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(599, 599, 599)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btbShowResults, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btbStart, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3))
                            .addGap(33, 33, 33))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(btbStart)
                .addGap(28, 28, 28)
                .addComponent(btbShowResults)
                .addGap(31, 31, 31)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    
    /*private void styleButton(javax.swing.JButton button, java.awt.Color color){
        button.setBackground(color);
        
        button.setForeground(java.awt.Color.WHITE);
        button.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 18));
        button.setFocusPainted(false);
        button.setOpaque(true);
        
        button.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 22, 12, 22));
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }*/
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.exit(0);
    }                                        

    private void btbShowResultsActionPerformed(java.awt.event.ActionEvent evt) {                                               
        AdminLoginFrame loginFrame = new AdminLoginFrame();
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
        this.dispose();
    }                                              

    private void btbStartActionPerformed(java.awt.event.ActionEvent evt) {                                         
        StudentLoginFrame loginFrame = new StudentLoginFrame();
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
        this.dispose();
    }                                        


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new WelcomeFrame().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btbShowResults;
    private javax.swing.JButton btbStart;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}
