package src_voting_system;

import javax.swing.JOptionPane;

public class CandidateFrame extends javax.swing.JFrame {
    
    final private java.util.HashMap<String, javax.swing.ButtonGroup> positionGroups = new java.util.HashMap<>();
    
    final private java.util.HashMap<String, Candidate> selectedCandidates = new java.util.HashMap<>();

    private boolean voteSubmitted = false;
    
    public CandidateFrame() {
        initComponents();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        styleButton(btnBack, new java.awt.Color(90, 110, 130));
        styleButton(btnReview, new java.awt.Color(20, 73, 145));
        
        lblHeading.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 24));
        lblHeading.setForeground(new java.awt.Color(20 , 73, 145));
        lblReview.setFont(new java.awt.Font("segoe UI",java.awt.Font.PLAIN, 16));
        lblReview.setForeground(new java.awt.Color(55, 70, 85));
        
        displayCandidates();
    }
    
    private void styleButton(javax.swing.JButton button, java.awt.Color color){
        button.setBackground(color);
        button.setForeground(java.awt.Color.WHITE);
        button.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 15));
        button.setFocusPainted(false);
        button.setOpaque(true);
        button.setBorderPainted(false);
        button.setCursor( new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); 
            
    }
    
       private String studentNumber;
       
       public CandidateFrame(String studentNumber){
           this();
           this.studentNumber = studentNumber;
       }
    
    public boolean recordVotes(){
        
        if(voteSubmitted || studentNumber == null || studentNumber.trim().isEmpty() || VoterData.hasVoted(studentNumber) || selectedCandidates.size() != positionGroups.size()){
            return false;
        }
        
        java.util.ArrayList<Candidate> candidatesToVote = new java.util.ArrayList<>(selectedCandidates.values());

        for(Candidate candidate : candidatesToVote){
            candidate.addVote();
        }
        
        if(!CandidateData.saveVotes()){
            for(Candidate candidate : candidatesToVote){
                candidate.removeVote();
            }
            CandidateData.saveVotes();
            return false;
        }
        
        if(!VoterData.recordVoter(studentNumber)){
            for(Candidate candidate : candidatesToVote){
                candidate.removeVote();
            }
            
            if(!CandidateData.saveVotes()){
                System.err.println("Could not save vote rollback.");
            }
            return false;
        }
        voteSubmitted = true;
        return true;
    }
    
    private void displayCandidates(){
   
        java.util.ArrayList<Candidate> candidates = CandidateData.getCandidates();
        
        java.util.Map<String,java.util.List<Candidate>>candidatesByPosition= new java.util.LinkedHashMap<>();
        
        for (Candidate candidate : candidates){ 
            
            candidatesByPosition.computeIfAbsent(candidate.getPosition(),key -> new java.util.ArrayList<>()).add(candidate);
        }
        
        panelCandidates.removeAll();
        
        panelCandidates.setBackground(java.awt.Color.WHITE);
        panelCandidates.setLayout(new javax.swing.BoxLayout(panelCandidates, javax.swing.BoxLayout.Y_AXIS));
        
        for(java.util.Map.Entry<String, java.util.List<Candidate>> entry : candidatesByPosition.entrySet()){
            
            String position = entry.getKey();
            java.util.List<Candidate>positionCandidates = entry.getValue();
            
            javax.swing.JLabel positionHeading = new javax.swing.JLabel(position);
            positionHeading.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 18));
            positionHeading.setForeground(new java.awt.Color(20, 73, 145));
            positionHeading.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 8, 6, 8));
            positionHeading.setOpaque(true);
            positionHeading.setBackground(new java.awt.Color(225, 238, 252));
            positionHeading.setMaximumSize(new java.awt.Dimension(Integer.MAX_VALUE, 42));
            positionHeading.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
            panelCandidates.add(positionHeading);
            
            javax.swing.JPanel row = new javax.swing.JPanel(new java.awt.GridLayout(1, positionCandidates.size(), 12, 0));
            row.setBackground(java.awt.Color.WHITE);
            row.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 8, 8, 8));
            row.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);
            
            for(Candidate candidate : positionCandidates){
                javax.swing.JPanel card = new javax.swing.JPanel();
                card.setBackground(new java.awt.Color(240, 247, 255));
                card.setLayout(new javax.swing.BoxLayout(card, javax.swing.BoxLayout.Y_AXIS));
                card.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(185, 210, 240)),
                javax.swing.BorderFactory.createEmptyBorder(12, 10, 12, 10)));
                
                String imagePath = "/src_voting_system/images/" + candidate.getCandidateId() + ".jpeg";
                java.net.URL imageUrl = getClass().getResource(imagePath);
                javax.swing.JLabel photoLabel;
                if(imageUrl != null){
                    javax.swing.ImageIcon original = new javax.swing.ImageIcon(imageUrl);
                    java.awt.Image scaled = original.getImage().getScaledInstance(96, 96, java.awt.Image.SCALE_SMOOTH);
                    photoLabel = new javax.swing.JLabel(new javax.swing.ImageIcon(scaled));
                } else{
                    photoLabel = new javax.swing.JLabel("Photo unavailable");
                }
                
                photoLabel.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
                card.add(photoLabel);
                card.add(javax.swing.Box.createVerticalStrut(8));
                javax.swing.JLabel nameLabel = new javax.swing.JLabel(candidate.getName());
                nameLabel.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
                nameLabel.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
                card.add(nameLabel);
                card.add(javax.swing.Box.createVerticalStrut(6));
                javax.swing.JLabel manifestoLabel = new javax.swing.JLabel("<html><div style='text-align:center;width:170px'>" + candidate.getManifesto() + "</div></html>");
                manifestoLabel.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
                card.add(manifestoLabel);
                card.add(javax.swing.Box.createVerticalStrut(10));
                
                if(!positionGroups.containsKey(position)){
                    positionGroups.put(position, new javax.swing.ButtonGroup());
                }
                javax.swing.JRadioButton selectButton = new javax.swing.JRadioButton("Select candidate");
                selectButton.setBackground(card.getBackground());
                selectButton.setForeground(new java.awt.Color(20, 73, 145));
                selectButton.setFocusPainted(false);
                selectButton.setOpaque(false);
                selectButton.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
                positionGroups.get(position).add(selectButton);
                selectButton.addActionListener(e -> selectedCandidates.put(position, candidate));
                card.add(selectButton);
                row.add(card);   
            }
            panelCandidates.add(row);
            panelCandidates.add(javax.swing.Box.createVerticalStrut(8));
        }
        
        panelCandidates.revalidate();
        panelCandidates.repaint();
                
    }      

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelCandidates = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnReview = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblReview = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 153));

        lblHeading.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(0, 0, 153));
        lblHeading.setText("SRC Candidates");

        panelCandidates.setBackground(new java.awt.Color(255, 255, 255));
        panelCandidates.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 153)), javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 153))));
        panelCandidates.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelCandidatesLayout = new javax.swing.GroupLayout(panelCandidates);
        panelCandidates.setLayout(panelCandidatesLayout);
        panelCandidatesLayout.setHorizontalGroup(
            panelCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1432, Short.MAX_VALUE)
        );
        panelCandidatesLayout.setVerticalGroup(
            panelCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panelCandidates);

        btnBack.setBackground(new java.awt.Color(255, 0, 0));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(this::btnBackActionPerformed);

        btnReview.setBackground(new java.awt.Color(51, 204, 0));
        btnReview.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReview.setForeground(new java.awt.Color(255, 255, 255));
        btnReview.setText("Review Ballot");
        btnReview.addActionListener(this::btnReviewActionPerformed);

        jTextField1.setBackground(new java.awt.Color(0, 0, 153));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("CPUT SRC Voting System");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\CPUT.jpeg")); // NOI18N

        lblReview.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblReview.setForeground(new java.awt.Color(0, 0, 255));
        lblReview.setText("Review Candidates Before Voting");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202)
                        .addComponent(btnReview, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(511, 511, 511))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblReview)
                        .addGap(604, 604, 604))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblHeading)
                        .addGap(649, 649, 649))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(lblHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblReview)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnReview))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void btnReviewActionPerformed(java.awt.event.ActionEvent evt) {                                          
        for(String position : positionGroups.keySet()){

            if(!selectedCandidates.containsKey(position)){
                JOptionPane.showMessageDialog(this, "Please select a candidate for: " + position, "Incomplete Ballot", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        if(selectedCandidates.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Please select at least one candidate.");
            return;
        }

        ReviewBallotFrame reviewFrame = new ReviewBallotFrame(this, selectedCandidates);

        reviewFrame.setVisible(true);
        this.setVisible(false);
    }                                         

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {                                        
        new WelcomeFrame().setVisible(true);
        this.dispose();
    }                                       

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> new CandidateFrame().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblReview;
    private javax.swing.JPanel panelCandidates;
    // End of variables declaration                   
}
