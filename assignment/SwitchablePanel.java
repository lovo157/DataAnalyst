package assignment;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;

import javax.swing.JComboBox;
import javax.swing.JPanel;

abstract class SwitchablePanel extends JPanel {
    protected JComboBox<String> optionsComboBox;
    protected MainAppFrame frame;

    public SwitchablePanel(MainAppFrame frame) {
        this.frame = frame;

        setLayout(new BorderLayout());

        // Common features (like the JComboBox for switching panels)
        String[] options = {"LOGGEDIN", "PROFILE", "ANALYTICS", "UPGRADE", "logout"};
        optionsComboBox = new JComboBox<>(options);
        optionsComboBox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                String selectedOption = (String) e.getItem();
                frame.switchCard(selectedOption);
            }
        });
        add(optionsComboBox, BorderLayout.SOUTH);
    }

    

    // Abstract method that subclasses MUST implement.
    // This method can be used to add specific features to the panel.
    protected abstract void addSpecificFeatures();
}
