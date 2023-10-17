import java.awt.*;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextArea;

class PostPanel extends SwitchablePanel {
    private JTextArea postContent;
    private JButton submitButton;

    public PostPanel(MainAppFrame frame) {
        super(frame);
        addSpecificFeatures(); 
    }

    @Override
    protected void addSpecificFeatures() {
        // Add a title
        JLabel label = new JLabel("Post Panel", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 32));
        titlePanel.add(label);

        postContent = new JTextArea();
        postContent.setWrapStyleWord(true);
        postContent.setLineWrap(true);
        postContent.setBorder(BorderFactory.createTitledBorder("Enter your post"));

        submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> handlePostSubmit());

        add(new JScrollPane(postContent), BorderLayout.CENTER);
        add(submitButton, BorderLayout.SOUTH);
    }

    private void handlePostSubmit() {
        // Logic to handle the post submission
        String content = postContent.getText();
        System.out.println("Submitted post: " + content);
        // ... other logic like saving the post to a database or refreshing other UI elements
    }
}
