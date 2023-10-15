// package assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainAppFrame extends JFrame {
    private CardLayout cardLayout = new CardLayout();
    private JPanel cards = new JPanel(cardLayout);
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton loginButton;
    private JLabel success;
    private JButton popupLoginButton;
    private JButton logout;
    private JLabel labelWithText; 
    // private JPanel homePanel;
   

    public MainAppFrame() {
        setTitle("App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create instances of your panels and add them to the CardLayout
        JPanel homePanel = createHomePanel();
        cards.add("logout", homePanel);  // HomePanel is assumed to follow the same structure as the other panels
        //   cards.add("HOME", new HomePanel(this));
        
        cards.add("PROFILE", new ProfilePanel(this));
        cards.add("LOGGEDIN", new HomePanelLoggedIN(this));
        cards.add("ANALYTICS", new AnalyticsPanel(this));
        cards.add("UPGRADE", new UpgradePanel(this));
        // cards.add("logout", new LogoutPanel(this));

        setLayout(new BorderLayout());
        add(cards, BorderLayout.CENTER);
        
        setSize(500, 500);
        setVisible(true);
    }
    private JPanel createHomePanel() {
        JPanel panel = new JPanel(new BorderLayout());
        
        // Top Panel with Heading and Buttons
        JPanel topPanel = new JPanel(new BorderLayout());
        JPanel buttonPanel = new JPanel();
        JPanel placeholder = new JPanel(new BorderLayout());
        
        
    
        // Heading
        JLabel label1 = new JLabel("Data Analyze Hub");
        label1.setFont(new Font("Verdana", Font.PLAIN, 25));
        topPanel.add(label1, BorderLayout.WEST);
    
        // Buttons
        JButton popupLoginButton1 = new JButton("Create Account");
        buttonPanel.add(popupLoginButton1);
        JButton popupLoginButton = new JButton("Login");
        popupLoginButton.addActionListener(e -> showLoginDialog());
        buttonPanel.add(popupLoginButton);
        JButton logout = new JButton("Logout");
        logout.setVisible(false);
        buttonPanel.add(logout);
        topPanel.add(buttonPanel, BorderLayout.EAST);
        topPanel.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 15));
        panel.add(topPanel, BorderLayout.NORTH);
    
        // Center Panel with Text
        JPanel centerPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        JLabel labelWithText = new JLabel("<html>Our Data Analyze Hub is designed to transform how you perceive social media. Dive deep into post insights and discover patterns, sentiments, and trends. Navigate the digital landscape effectively. Plus, our premium feature takes your analysis to the next level, offering unparalleled depth and clarity. Unlock the potential of data now.</html>");
        labelWithText.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 2;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        centerPanel.add(labelWithText, gbc);
        panel.add(centerPanel, BorderLayout.CENTER);

        // adding the images 
        ImageIcon imageIconNorth = new ImageIcon("Pictures/Data1.jpg");
        JLabel imageLabelNorth = new JLabel(imageIconNorth);
        placeholder.add(imageLabelNorth, BorderLayout.NORTH);
        // Image at the bottom (South)
        ImageIcon imageIconSouth = new ImageIcon("Pictures/Data2.jpg");
        JLabel imageLabelSouth = new JLabel(imageIconSouth);
        placeholder.add(imageLabelSouth, BorderLayout.SOUTH);
        gbc.gridx = 1;
        gbc.weightx = 1;
        centerPanel.add(placeholder, gbc);
   
        return panel;
    }
    

    private void showLoginDialog() {
        JDialog loginDialog = new JDialog(this, "Login Prompt", true);
        loginDialog.setSize(300, 200);
        loginDialog.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        loginDialog.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        loginDialog.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        loginDialog.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        loginDialog.add(passwordText);

        loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.addActionListener(e -> handleLogin());
        loginDialog.add(loginButton);

        success = new JLabel("");
        success.setBounds(10, 110, 260, 25);
        loginDialog.add(success);

        loginDialog.setVisible(true);
    }

    private void handleLogin() {
        String user = userText.getText();
        String password = new String(passwordText.getPassword());

        if ("1".equals(user) && "1".equals(password)) {
            success.setText("Login successful!");
            popupLoginButton.setVisible(false);
            logout.setVisible(true);
            switchCard("LOGGEDIN");
        } else {
            success.setText("Login failed!");
        }
    }

    

    public void switchCard(String cardName) {
        System.out.println("Attempting to switch to card: " + cardName);
        cardLayout.show(cards, cardName);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainAppFrame());
    }
}