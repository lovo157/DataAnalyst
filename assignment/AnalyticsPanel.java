import javax.swing.*;
import java.awt.*;

class AnalyticsPanel extends SwitchablePanel {
    
    public AnalyticsPanel(MainAppFrame frame) {
        super(frame);
        addSpecificFeatures(); 
    }

    @Override
    protected void addSpecificFeatures() {
        // Specific features for AnalyticsPanel
        JPanel contentPanel = new JPanel(new BorderLayout());

        // Add title to the titlePanel we've established in the parent
        JLabel label = new JLabel("AnalyticsPanel", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 32));
        titlePanel.add(label);  // Add the label to the titlePanel

        // Button displaying username
        JButton usernameButton = new JButton("username");
        topPanel.add(usernameButton, BorderLayout.EAST);  // Place usernameButton on the far right

        // If you have other components specific to AnalyticsPanel, you can add them to contentPanel
        // Example: contentPanel.add(someComponent);

        add(contentPanel, BorderLayout.CENTER);
    }
}
