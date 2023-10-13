package assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton loginButton;
    private static JLabel success;
    private static JButton popupLoginButton;
    private static JFrame frame;
    private static JPanel topPanel;
    private static JButton logout;

    public static void main(String[] args) {

        frame = new JFrame();
        frame.setTitle("App");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Panel for holding the buttons
        topPanel = new JPanel(new BorderLayout());
        
        JPanel buttonPanel = new JPanel(); // New panel to hold both buttons

        // Main GUI button to pop up the login prompt
        popupLoginButton = new JButton("Login");
        popupLoginButton.addActionListener(e -> showLoginDialog());
        buttonPanel.add(popupLoginButton);

        // Initialize the logout button and add to the buttonPanel
        logout = new JButton("Logout");
        logout.setVisible(false); // Hide initially
        buttonPanel.add(logout);

        topPanel.add(buttonPanel, BorderLayout.EAST); // Add buttonPanel to EAST of topPanel

        // Empty border for top panel to position the buttons 15 pixels away from the edges
        topPanel.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 15));
        frame.add(topPanel, BorderLayout.NORTH);
        
        frame.setVisible(true);
    }
    private static void showLoginDialog() {
        JDialog loginDialog = new JDialog();
        loginDialog.setTitle("Login Prompt");
        loginDialog.setSize(300, 200);
        loginDialog.setLayout(null);

        userLabel = new JLabel("user");
        userLabel.setBounds(10, 20, 80, 25);
        loginDialog.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        loginDialog.add(userText);

        passwordLabel = new JLabel("password");
        passwordLabel.setBounds(10, 50, 80, 25);
        loginDialog.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        loginDialog.add(passwordText);

        loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.addActionListener(new GUI());
        loginDialog.add(loginButton);

        success = new JLabel("");
        success.setBounds(10, 110, 260, 25);
        loginDialog.add(success);

        loginDialog.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = new String(passwordText.getPassword());

        if ("Alex".equals(user) && "lovo123".equals(password)) {
            success.setText("login successful!");
            popupLoginButton.setVisible(false); // Hide login button
            logout.setVisible(true); // Show logout button
        } else {
            success.setText("login failed!");
        }
    }
}
