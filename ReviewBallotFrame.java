package src_voting_system;

public class ReviewBallotFrame extends javax.swing.JFrame {
    
    private final CandidateFrame parentFrame;
    private final java.util.HashMap<String, Candidate> selectedCandidates;
    
    public ReviewBallotFrame(CandidateFrame parentFrame, java.util.HashMap<String, Candidate> selectedCandidates) {
        
        initComponents();
        
        this.parentFrame = parentFrame;
        this.selectedCandidates = selectedCandidates;
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        
        addWindowListener(new java.awt.event.WindowAdapter(){
            @Override
            public void windowClosing(java.awt.event.WindowEvent e){
                if(parentFrame != null){
                    parentFrame.setVisible(true);
                }
                dispose();
            }
        });
        
        setLocationRelativeTo(null);
        
        displayBallot();
    }
    
    private void displayBallot(){
        String ballot = "";
        
        for(java.util.Map.Entry<String, Candidate> entry : selectedCandidates.entrySet()){
            ballot += entry.getKey() + "\n";
            ballot += "Candidate: " + entry.getValue().getName() + "\n";
            ballot += "----------------------------\n\n";
        }
        
        txtBallot.setText(ballot);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        lblInstructions = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBallot = new javax.swing.JTextArea();
        btnConfirmVote = new javax.swing.JButton();
        btnBackToEdit = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblHeading.setBackground(new java.awt.Color(0, 102, 255));
        lblHeading.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(0, 0, 153));
        lblHeading.setText("Review Your Ballot");

        lblInstructions.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblInstructions.setForeground(new java.awt.Color(0, 0, 153));
        lblInstructions.setText("Check your selections before confirming");

        txtBallot.setEditable(false);
        txtBallot.setBackground(new java.awt.Color(255, 255, 255));
        txtBallot.setColumns(20);
        txtBallot.setForeground(new java.awt.Color(0, 0, 0));
        txtBallot.setRows(5);
        txtBallot.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 153)), javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 153))));
        jScrollPane1.setViewportView(txtBallot);

        btnConfirmVote.setBackground(new java.awt.Color(0, 153, 255));
        btnConfirmVote.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfirmVote.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmVote.setText("Confirm Vote");
        btnConfirmVote.addActionListener(this::btnConfirmVoteActionPerformed);

        btnBackToEdit.setBackground(new java.awt.Color(255, 0, 0));
        btnBackToEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBackToEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnBackToEdit.setText("Back to Edit");
        btnBackToEdit.addActionListener(this::btnBackToEditActionPerformed);

        jTextField1.setBackground(new java.awt.Color(0, 0, 153));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("CPUT SRC Voting System");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\CPUT.jpeg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeading)
                .addGap(590, 590, 590))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(502, 502, 502)
                        .addComponent(btnBackToEdit)
                        .addGap(221, 221, 221)
                        .addComponent(btnConfirmVote))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(532, 532, 532)
                        .addComponent(lblInstructions)))
                .addContainerGap(496, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(lblHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblInstructions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackToEdit)
                    .addComponent(btnConfirmVote))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void btnBackToEditActionPerformed(java.awt.event.ActionEvent evt) {                                              
        parentFrame.setVisible(true);
        this.dispose();
    }                                             

    private void btnConfirmVoteActionPerformed(java.awt.event.ActionEvent evt) {                                               
       int answer = javax.swing.JOptionPane.showConfirmDialog(this, "Are you sure you want to confirm your ballot?", "Confirm Vote", javax.swing.JOptionPane.YES_NO_OPTION);
       
       if(answer != javax.swing.JOptionPane.YES_OPTION){
           return;
       }
           boolean recorded = parentFrame.recordVotes();
           
           if(recorded){
               parentFrame.dispose();
               dispose();
               
               new VoteRecordedFrame(selectedCandidates).setVisible(true);
           } else{
               javax.swing.JOptionPane.showMessageDialog(this, "This ballot could not be recorded. Please try again.", "Vote Not Recorded", javax.swing.JOptionPane.ERROR_MESSAGE);
           }
       
    }                                              


    // Variables declaration - do not modify                     
    private javax.swing.JButton btnBackToEdit;
    private javax.swing.JButton btnConfirmVote;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblInstructions;
    private javax.swing.JTextArea txtBallot;
    // End of variables declaration                   
}
