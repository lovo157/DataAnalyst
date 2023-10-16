// package assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class HomePanelLoggedIN extends SwitchablePanel {
   private JPanel westPanel;
   private JComboBox<String> optionsComboBox;
      private JPanel northPanel;
    
    public HomePanelLoggedIN(MainAppFrame frame) {
        super(frame);
        addSpecificFeatures(); 
    }


    protected void addSpecificFeatures() {
        
        // JLabel label1 = new JLabel("LOGGEDIN");
        // label1.setFont(new Font("Verdana", Font.PLAIN, 25));
        // label1.add(label1, BorderLayout.WEST);
        // // northPanel.add(optionsComboBox, BorderLayout.NORTH);

       
    }


}
