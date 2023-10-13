// package assignment;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class HomePanel extends JFrame {

//     private JLabel userLabel;
//     private JTextField userText;
//     private JLabel passwordLabel;
//     private JPasswordField passwordText;
//     private JButton loginButton;
//     private JLabel success;
//     private JButton popupLoginButton;
//     private JButton logout;
//     private MainAppFrame mainAppFrame;
    
//     public HomePanel(MainAppFrame frame) {
//         this.mainAppFrame = frame;
//         setTitle("App");
//         setSize(500, 500);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new BorderLayout());

//         initializeGUI();
//         setVisible(true);
//     }

//     private void initializeGUI() {
//         JPanel topPanel = new JPanel(new BorderLayout());
//         JPanel buttonPanel = new JPanel();

//         popupLoginButton = new JButton("Login");
//         popupLoginButton.addActionListener(e -> showLoginDialog());
//         buttonPanel.add(popupLoginButton);

//         logout = new JButton("Logout");
//         logout.setVisible(false);
//         buttonPanel.add(logout);

//         topPanel.add(buttonPanel, BorderLayout.EAST);
//         topPanel.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 15));
//         add(topPanel, BorderLayout.NORTH);
//     }

//     private void showLoginDialog() {
//         JDialog loginDialog = new JDialog(this, "Login Prompt", true);
//         loginDialog.setSize(300, 200);
//         loginDialog.setLayout(null);

//         userLabel = new JLabel("user");
//         userLabel.setBounds(10, 20, 80, 25);
//         loginDialog.add(userLabel);

//         userText = new JTextField(20);
//         userText.setBounds(100, 20, 165, 25);
//         loginDialog.add(userText);

//         passwordLabel = new JLabel("password");
//         passwordLabel.setBounds(10, 50, 80, 25);
//         loginDialog.add(passwordLabel);

//         passwordText = new JPasswordField();
//         passwordText.setBounds(100, 50, 165, 25);
//         loginDialog.add(passwordText);

//         loginButton = new JButton("login");
//         loginButton.setBounds(10, 80, 80, 25);
//         loginButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 handleLogin();
//             }
//         });
//         loginDialog.add(loginButton);

//         success = new JLabel("");
//         success.setBounds(10, 110, 260, 25);
//         loginDialog.add(success);

//         loginDialog.setVisible(true);
//     }

//     private void handleLogin() {
//         String user = userText.getText();
//         String password = new String(passwordText.getPassword());

//         if ("1".equals(user) && "1".equals(password)) {
//             success.setText("login successful!");
//             // System.out.println("attempting to switch to card" + cardName);
//             popupLoginButton.setVisible(false);
//             logout.setVisible(true);
            
//             mainAppFrame.switchCard("LOGGEDIN");
 
//             //switch to Logged in pannel
            
//         } else {
//             success.setText("login failed!");
//         }
//     }

//     // public static void main(String[] args) {
//     //     SwingUtilities.invokeLater(() -> new HomePanel());
//     // }
// }
