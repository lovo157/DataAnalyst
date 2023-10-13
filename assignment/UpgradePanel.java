package assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class UpgradePanel extends SwitchablePanel {

    public UpgradePanel(MainAppFrame frame) {
        super(frame);
        addSpecificFeatures();
    }

    @Override
    protected void addSpecificFeatures() {
        // Specific features for ProfilePanel
        JLabel label = new JLabel("Profile Page");
        add(label, BorderLayout.CENTER);
    }
   
   
   
   
    // public UpgradePanel() {
    //     setLayout(new BorderLayout());
    //     JLabel upgradeLabel = new JLabel("Upgrade your account!", SwingConstants.CENTER);
    //     JButton upgradeButton = new JButton("Upgrade Now");
    //     // Add ActionListener to the button for upgrade logic
    //     add(upgradeLabel, BorderLayout.CENTER);
    //     add(upgradeButton, BorderLayout.SOUTH);
    // }
}
