package assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LogoutPanel extends SwitchablePanel {


    public LogoutPanel(MainAppFrame frame) {
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
