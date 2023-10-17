import java.awt.*;
import java.awt.event.ItemEvent;
import javax.swing.*;

abstract class SwitchablePanel extends JPanel {
    protected JComboBox<String> optionsComboBox;
    protected MainAppFrame frame;
    protected JPanel topPanel;  // Top-level panel for BorderLayout.NORTH of the main panel
    protected JPanel titlePanel;  // Center panel for titles and other elements

    public SwitchablePanel(MainAppFrame frame) {
        this.frame = frame;

        setLayout(new BorderLayout());

        // Common features (like the JComboBox for switching panels)
        String[] options = {"LOGGEDIN", "PROFILE", "ANALYTICS", "UPGRADE", "logout", "POST"};
        optionsComboBox = new JComboBox<>(options);
        optionsComboBox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                String selectedOption = (String) e.getItem();
                frame.switchCard(selectedOption);
            }
        });

        JPanel comboPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        comboPanel.add(optionsComboBox);

        titlePanel = new JPanel(new BorderLayout());

        topPanel = new JPanel(new BorderLayout());
        topPanel.add(comboPanel, BorderLayout.WEST);  // Place comboPanel on the far left
        topPanel.add(titlePanel, BorderLayout.CENTER);  // Leave room in the center for specific titles

        add(topPanel, BorderLayout.NORTH);
    }

    protected abstract void addSpecificFeatures();
}
