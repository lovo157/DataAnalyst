import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
class ProfilePanel extends SwitchablePanel {
    private JTextField firstnameField;
    private JTextField lastnameField;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton editChangesButton;
    private JButton saveChangesButton;

    public ProfilePanel(MainAppFrame frame) {
        super(frame);
        addSpecificFeatures();
    }

    protected void addSpecificFeatures() {
        JPanel contentPanel = new JPanel(new BorderLayout());
       

        JLabel label = new JLabel("Profile Page", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 32));
        contentPanel.add(label, BorderLayout.NORTH); 

        Font customFont = new Font("Arial", Font.PLAIN, 24);

        // Create a panel for user input fields
        JPanel inputPanel = new JPanel(new GridLayout(4, 2,10,10));
        int top = 30;
        int left = 10;
        int bottom = 30;
        int right = 10;
        inputPanel.setBorder(new EmptyBorder(top, left, bottom, right));

        addComponent(inputPanel, "First Name:", firstnameField = new JTextField(20), customFont);
        addComponent(inputPanel, "Last Name:", lastnameField = new JTextField(20), customFont);
        addComponent(inputPanel, "Username:", usernameField = new JTextField(20), customFont);
        addComponent(inputPanel, "Password:", passwordField = new JPasswordField(20), customFont);
        
        contentPanel.add(inputPanel, BorderLayout.CENTER); 

        // Create a panel for buttons
        JPanel buttonPanel = new JPanel();
        editChangesButton = new JButton("Edit Changes");
        saveChangesButton = new JButton("Save Changes");
        buttonPanel.add(editChangesButton);
        buttonPanel.add(saveChangesButton);
        
        contentPanel.add(buttonPanel, BorderLayout.SOUTH); 

        add(contentPanel, BorderLayout.CENTER); // Add contentPanel to the CENTER region of ProfilePanel
    }

    private void addComponent(JPanel panel, String labelText, JComponent component, Font customFont) {
        JLabel label = new JLabel(labelText);
        label.setFont(customFont);
        panel.add(label);
        
        component.setFont(customFont);
        panel.add(component);
    }
}

class ProfilePanel extends SwitchablePanel {
    private JTextField firstnameField;
    private JTextField lastnameField;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton editChangesButton;
    private JButton saveChangesButton;

    public ProfilePanel(MainAppFrame frame) {
        super(frame);
        addSpecificFeatures();
    }

    protected void addSpecificFeatures() {
        JPanel contentPanel = new JPanel(new BorderLayout());

        JLabel label = new JLabel("Profile", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 32));
        contentPanel.add(label, BorderLayout.NORTH); 

        Font customFont = new Font("Arial", Font.PLAIN, 24);

        // Create a panel for user input fields
        JPanel inputPanel = new JPanel(new GridLayout(4, 1));
        addComponent(inputPanel, "First Name:", firstnameField = new JTextField(20), customFont);
        addComponent(inputPanel, "Last Name:", lastnameField = new JTextField(20), customFont);
        addComponent(inputPanel, "Username:", usernameField = new JTextField(20), customFont);
        addComponent(inputPanel, "Password:", passwordField = new JPasswordField(20), customFont);
        
        contentPanel.add(inputPanel, BorderLayout.CENTER); 

        // Create a panel for buttons
        JPanel buttonPanel = new JPanel();
        editChangesButton = new JButton("Edit Changes");
        saveChangesButton = new JButton("Save Changes");
        buttonPanel.add(editChangesButton);
        buttonPanel.add(saveChangesButton);
        
        contentPanel.add(buttonPanel, BorderLayout.SOUTH); 

        add(contentPanel, BorderLayout.CENTER); // Add contentPanel to the CENTER region of ProfilePanel
    }

    private void addComponent(JPanel panel, String labelText, JComponent component, Font customFont) {
        JLabel label = new JLabel(labelText);
        label.setFont(customFont);
        panel.add(label);
        
        component.setFont(customFont);
        panel.add(component);
    }
}
