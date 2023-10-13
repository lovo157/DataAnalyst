package assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class HomePanelLoggedIN extends SwitchablePanel {
   private JPanel westPanel;
   private JComboBox<String> optionsComboBox;
    
    public HomePanelLoggedIN(MainAppFrame frame) {
        super(frame);
        addSpecificFeatures();
    }

    @Override
    protected void addSpecificFeatures() {
        // Specific features for ProfilePanel
        // JLabel label = new JLabel("Profile Page");
        // add(label, BorderLayout.CENTER);
    }


}
