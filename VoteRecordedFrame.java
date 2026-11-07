package src_voting_system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Map;
import javax.swing.*;

public class VoteRecordedFrame extends JFrame{
    
    public VoteRecordedFrame(Map<String, Candidate> selections){
        setTitle("CPUT SRC Voting System");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480, 560);setLocationRelativeTo(null);
        
        Color navy = new Color(20, 73, 145);
        Color paleBlue = new Color(225, 240, 252);
        
        JPanel main = new JPanel(new BorderLayout(12, 12));
        main.setBackground(Color.WHITE);
        main.setBorder(BorderFactory.createEmptyBorder(16, 20, 20, 20));
        
        JLabel header = new JLabel("CPUT SRC Voting System", SwingConstants.CENTER);
        header.setOpaque(true);
        header.setBackground(navy);
        header.setForeground(Color.WHITE);
        header.setFont(new Font("Segoe UI", Font.BOLD, 18));
        header.setBorder(BorderFactory.createEmptyBorder(12, 8, 12, 8));
        main.add(header, BorderLayout.NORTH);
        
        JPanel content = new JPanel();
        content.setBackground(Color.WHITE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        java.net.URL iconUrl = getClass().getResource("/src_voting_system/images/validicon.png");
        
        if(iconUrl != null){
            ImageIcon original = new ImageIcon(iconUrl);
            Image scaled = original.getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
            JLabel icon = new JLabel(new ImageIcon(scaled));
            icon.setAlignmentX(CENTER_ALIGNMENT);
            content.add(Box.createVerticalStrut(12));
            content.add(icon);
        }
        
        JLabel title = new JLabel("Vote Recorded!");
        title.setFont(new Font("Segoe UI", Font.BOLD, 26));
        title.setForeground(navy);
        title.setAlignmentX(CENTER_ALIGNMENT);
        content.add(Box.createVerticalStrut(8));
        content.add(title);
        
        JLabel message = new JLabel("Your vote has been successfully recorded.");
        message.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        message.setAlignmentX(CENTER_ALIGNMENT);
        content.add(Box.createVerticalStrut(6));
        content.add(message);
        content.add(Box.createVerticalStrut(18));
        
        JPanel selectionsPanel = new JPanel();
        selectionsPanel.setBackground(paleBlue);
        selectionsPanel.setLayout(new BoxLayout(selectionsPanel, BoxLayout.Y_AXIS));
        selectionsPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(185, 210, 240)), 
                BorderFactory.createEmptyBorder(12, 16, 12, 16)));
        
        JLabel selectedHeading = new JLabel("Your selections:");
        selectedHeading.setFont(new Font("Segoe UI", Font.BOLD, 15));
        selectedHeading.setForeground(navy);
        selectionsPanel.add(selectedHeading);
        selectionsPanel.add(Box.createVerticalStrut(8));
        
        for(Map.Entry<String, Candidate> entry : selections.entrySet()){
            Candidate candidate = entry.getValue();
             JPanel selectionRow = new JPanel(new BorderLayout(12, 0));
             selectionRow.setOpaque(false);
             
             JLabel photo = new JLabel();
             photo.setHorizontalAlignment(SwingConstants.CENTER);
             photo.setPreferredSize(new java.awt.Dimension(56, 56));
             
             java.net.URL photoUrl = getClass().getResource("/src_voting_system/images/" + candidate.getCandidateId() + ".jpeg");
             
             if(photoUrl != null){
                 ImageIcon original = new ImageIcon(photoUrl);
                 Image scaled = original.getImage().getScaledInstance(56, 56, Image.SCALE_SMOOTH);
                 photo.setIcon(new ImageIcon(scaled));
             } else{
                 photo.setText("No photo");
             }
             
             JLabel selected = new JLabel("<html><b>" + entry.getKey() + "</b><br>" + candidate.getName() + "</html>");
             selected.setFont(new Font("Segoe UI", Font.PLAIN, 14));
             selectionRow.add(photo, BorderLayout.WEST);
             selectionRow.add(selected, BorderLayout.CENTER);
             
             selectionsPanel.add(selectionRow);
             selectionsPanel.add(Box.createVerticalStrut(8));
        }  
        
        JScrollPane selectionsScroll = new JScrollPane(selectionsPanel);
        selectionsScroll.setBorder(BorderFactory.createEmptyBorder());
        selectionsScroll.setPreferredSize(new java.awt.Dimension(400, 170));
        
        content.add(selectionsScroll);
        content.add(Box.createVerticalStrut(18));
        
        JButton continueButton = new JButton("Continue");
        continueButton.setFont(new Font("Segoe UI", Font.BOLD, 15));
        continueButton.setBackground(navy);
        continueButton.setForeground(Color.WHITE);
        continueButton.setFocusPainted(false);
        continueButton.setAlignmentX(CENTER_ALIGNMENT);
        
        continueButton.addActionListener(e -> {
            WelcomeFrame welcome = new WelcomeFrame();
            welcome.setLocationRelativeTo(null);
            welcome.setVisible(true);
            dispose();
        });
        
        content.add(continueButton);
        main.add(content, BorderLayout.CENTER);
        setContentPane(main);
    }
}
