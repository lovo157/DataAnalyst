import java.awt.*;
import java.awt.event.ItemEvent;
import javax.swing.*;

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

        // This JPanel will keep the JComboBox on the top left corner
        JPanel comboPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        comboPanel.add(optionsComboBox);
        add(comboPanel, BorderLayout.NORTH);
    }

    protected abstract void addSpecificFeatures();
}