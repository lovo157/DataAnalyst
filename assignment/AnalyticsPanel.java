// package ASSIGNMENT;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class AnalyticsPanel extends SwitchablePanel {
    public AnalyticsPanel(MainAppFrame frame) {
        super(frame);
        addSpecificFeatures();
    }

    @Override
    protected void addSpecificFeatures() {
        // Specific features for AnalyticsPanel
        JLabel label = new JLabel("Analytics Page");
        add(label, BorderLayout.CENTER);
    }

}