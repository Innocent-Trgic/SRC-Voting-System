package src_voting_system;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;

public class Main {
     public static void main(String[] args) {
         
         UIManager.put("OptionPane.messageFont", new Font("Segoe UI", Font.BOLD, 14));
         UIManager.put("OptionPane.messageForeground", new Color(20, 73, 145));
         UIManager.put("OptionPane.background", Color.WHITE);
         UIManager.put("Panel.background", Color.WHITE);
       
         SwingUtilities.invokeLater(() -> {
             WelcomeFrame welcome = new WelcomeFrame();
             
             welcome.setLocationRelativeTo(null);
             welcome.setVisible(true);
         });
        
    }
}
