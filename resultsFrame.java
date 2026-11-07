package src_voting_system;

public class ResultsFrame extends javax.swing.JFrame {
    
    public ResultsFrame() {
        initComponents();
        
        jTextField1.setEditable(false);
        jTextField1.setFocusable(false);
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 12, 8, 12));
        
        btnBack.setBackground(new java.awt.Color(20, 73, 145));
        btnViewAudit.setBackground(new java.awt.Color(55, 145, 210));
        btnResetElection.setBackground(new java.awt.Color(190, 55, 55));
        
        setDefaultCloseOperation(
        javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        displayResults();
    }
    
    private void displayResults(){
        
        lblHeading.setText("SRC Election Results | Ballots cast: " + VoterData.getVotedStudents().size());
        
        javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(new Object[]{"Position", "Candidate", "Votes", "Results"}, 0){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        String[] positions = {"President", "General Secretary", "Housing & Welfare"};
        
        java.util.ArrayList<Candidate> candidates = CandidateData.getCandidates();
        
        for(String position : positions){
            int highestVotes = -1;
            int secondHighestVotes = -1;
            int leaderCount = 0;
 
            for(Candidate candidate : candidates){
                if(!candidate.getPosition().equals(position)){
                    continue;
                }
                
                int votes = candidate.getVotes();
                
                if(votes > highestVotes){
                    secondHighestVotes = highestVotes;
                    highestVotes = votes;
                    leaderCount = 1;
                } else if(votes == highestVotes){
                    leaderCount++;
                } else if(votes > secondHighestVotes){
                    secondHighestVotes = votes;
                }
            }
            
            for(Candidate candidate : candidates){
                if(!candidate.getPosition().equals(position)){
                    continue;
                }
            
                String result;
                if(highestVotes == 0){
                    result = "No votes cast yet";
                } else if(candidate.getVotes() == highestVotes){
                    result = leaderCount > 1 ? "Tie" : "Winner";
                } else if(candidate.getVotes() == secondHighestVotes){
                    result = "Second";
                } else{
                    result = "Other";
                }
                
                model.addRow(new Object[]{position, candidate.getName(),candidate.getVotes(), result});
            }
        }
        
        javax.swing.JTable resultsTable = new javax.swing.JTable(model);
        resultsTable.setRowHeight(30);
        resultsTable.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));
        resultsTable.setGridColor(new java.awt.Color(220, 230, 242));
        resultsTable.setFillsViewportHeight(true);
        resultsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        resultsTable.setRowSelectionAllowed(false);
        resultsTable.setCellSelectionEnabled(false);
        resultsTable.getColumnModel().getColumn(0).setPreferredWidth(190);
        resultsTable.getColumnModel().getColumn(1).setPreferredWidth(300);
        resultsTable.getColumnModel().getColumn(2).setPreferredWidth(90);
        resultsTable.getColumnModel().getColumn(3).setPreferredWidth(120);
        
        javax.swing.table.JTableHeader tableHeader = resultsTable.getTableHeader();
        tableHeader.setBackground(new java.awt.Color(20, 73, 145));
        tableHeader.setForeground(java.awt.Color.WHITE);
        tableHeader.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        
        javax.swing.table.DefaultTableCellRenderer renderer = new javax.swing.table.DefaultTableCellRenderer(){
            @Override
            public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, Object value, boolean selected, boolean focused, int row, int column){
                super.getTableCellRendererComponent(table, value, selected, focused, row, column);
                
                int modelRow = table.convertRowIndexToModel(row);
                String position = table.getModel().getValueAt(modelRow, 0).toString();
                String result = table.getModel().getValueAt(modelRow, 3).toString();
                
                if(selected){
                    setBackground(table.getSelectionBackground());
                    setForeground(table.getSelectionForeground());
                } else{
                if( null == position){
                    setBackground(new java.awt.Color(224,246, 242));
                } else switch (position) {
                        case "President" -> setBackground(new java.awt.Color(230, 242, 255));
                        case "General Secretary" -> setBackground(new java.awt.Color(210, 235, 250));
                        default -> setBackground(new java.awt.Color(224,246, 242));
                    }
              
                if(column == 3){
                    if(null == result){
                        setForeground(new java.awt.Color(190, 40, 40));
                    } else switch (result) {
                        case "Winner", "Tie" -> setForeground(new java.awt.Color(0, 140, 60));
                        case "Second" -> setForeground(new java.awt.Color(220, 120, 0));
                        default -> setForeground(new java.awt.Color(190, 40, 40));
                    } 
                } else{
                    setForeground(table.getForeground());
                }
                
                if(row > 0){
                    int previousModelRow = table.convertRowIndexToModel(row - 1);
                    String previousPosition = table.getModel().getValueAt(previousModelRow, 0).toString();
                    
                    if(!position.equals(previousPosition)){
                        setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(20, 73, 145)));
                    } else{
                        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(220, 230, 242)));
                    }
                }
            } 
                
                setHorizontalAlignment(column == 2 || column == 3 ? javax.swing.SwingConstants.CENTER : javax.swing.SwingConstants.LEFT);
                
                setFont(new java.awt.Font("Segoe UI", column == 3 ? java.awt.Font.BOLD : java.awt.Font.PLAIN, 14));
                
                return this;
            }
        };
        
        for(int column = 0; column < resultsTable.getColumnCount(); column++){
            resultsTable.getColumnModel().getColumn(column).setCellRenderer(renderer);
        }
        
        jScrollPane1.setViewportView(resultsTable);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResults = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        btnResetElection = new javax.swing.JButton();
        btnViewAudit = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblHeading.setBackground(new java.awt.Color(0, 102, 255));
        lblHeading.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(0, 51, 153));
        lblHeading.setText("SRC Election Results");

        txtResults.setEditable(false);
        txtResults.setBackground(new java.awt.Color(255, 255, 255));
        txtResults.setColumns(20);
        txtResults.setForeground(new java.awt.Color(0, 0, 0));
        txtResults.setRows(5);
        txtResults.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 153)), javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 153))));
        jScrollPane1.setViewportView(txtResults);

        btnBack.setBackground(new java.awt.Color(0, 0, 153));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back to Welcome");
        btnBack.addActionListener(this::btnBackActionPerformed);

        btnResetElection.setBackground(new java.awt.Color(255, 0, 0));
        btnResetElection.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnResetElection.setForeground(new java.awt.Color(255, 255, 255));
        btnResetElection.setText("Reset Election");
        btnResetElection.addActionListener(this::btnResetElectionActionPerformed);

        btnViewAudit.setBackground(new java.awt.Color(0, 204, 0));
        btnViewAudit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnViewAudit.setForeground(new java.awt.Color(255, 255, 255));
        btnViewAudit.setText("View Audit");
        btnViewAudit.addActionListener(this::btnViewAuditActionPerformed);

        jTextField1.setBackground(new java.awt.Color(0, 0, 153));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("CPUT SRC Voting System");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\CPUT.jpeg")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jTextField1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
                .addComponent(btnViewAudit, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(303, 303, 303)
                .addComponent(btnResetElection, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(593, 593, 593)
                .addComponent(lblHeading)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(lblHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnViewAudit)
                    .addComponent(btnResetElection))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {                                        
        new WelcomeFrame().setVisible(true);
        this.dispose();
    }                                       

    private void btnResetElectionActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        int choice = javax.swing.JOptionPane.showConfirmDialog(this, "Are you sure you want to reset all election results?", "Confirmation Election Reset", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.WARNING_MESSAGE);
        
        if(choice == javax.swing.JOptionPane.YES_OPTION){
            
        boolean votesCleared = CandidateData.resetAllVotes();
        VoterData.resetVoters();
        displayResults();
        
        if(votesCleared){
            javax.swing.JOptionPane.showMessageDialog(this, "Election results have been reset successfully.");
        } else{
            javax.swing.JOptionPane.showMessageDialog(this, "Votes were cleared in memory, but votes.txt could not be deleted.", "Reset Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
        }

      }
    }                                                

    private void btnViewAuditActionPerformed(java.awt.event.ActionEvent evt) {                                             
        VoterAuditFrame auditFrame = new VoterAuditFrame();
        auditFrame.setLocationRelativeTo(null);
        auditFrame.setVisible(true);
        
        this.dispose();
    }                                            


    // Variables declaration - do not modify                     
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnResetElection;
    private javax.swing.JButton btnViewAudit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JTextArea txtResults;
    // End of variables declaration                   
}
