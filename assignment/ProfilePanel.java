// package assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ProfilePanel extends SwitchablePanel {


	public ProfilePanel(MainAppFrame frame) {
        super(frame);
        addSpecificFeatures();
    }

    @Override
    protected void addSpecificFeatures() {
        // Specific features for ProfilePanel
        JLabel label = new JLabel("Profile Page");
        add(label, BorderLayout.CENTER);
    }
}