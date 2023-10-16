import javax.swing.*;
import java.awt.*;

class HomePanelLoggedIN extends SwitchablePanel {
    private JPanel westPanel;
    private JComboBox<String> optionsComboBox;
    private JPanel northPanel;
    
    public HomePanelLoggedIN(MainAppFrame frame) {
        super(frame);
        addSpecificFeatures(); 
    }

    @Override
    protected void addSpecificFeatures() {
        // layout setup
        JPanel contentPanel = new JPanel(new BorderLayout());

        // title
        JLabel label = new JLabel("Home Page", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 32));
        titlePanel.add(label);
        
        add(contentPanel, BorderLayout.CENTER);

        // panel to hold the username button, positioned to the top-right


        JButton usernameButton = new JButton("username");

        // Get the comboPanel from the parent class and add the usernameButton to its EAST
        JPanel topPanel = (JPanel) getComponent(0); // Assuming it's the first component in the parent's layout
        topPanel.add(usernameButton, BorderLayout.EAST);
        
        add(contentPanel, BorderLayout.CENTER);

        // panel to display the images with titles
        JPanel imagePanel = new JPanel(new GridLayout(4, 1, 5, 5));  // 4 rows, 1 column, 5px gaps

        // assuming the images are stored in a folder named 'images' and have names like 'image1.jpg', 'image2.jpg', etc.
        String[] imageTitles = {"Title 1", "Title 2", "Title 3", "Title 4"};
        for (int i = 0; i < 4; i++) {
            ImageIcon imageIcon = new ImageIcon("Pictures/Data1.jpg");
            JLabel imageLabel = new JLabel(imageIcon, SwingConstants.CENTER);
            JLabel titleLabel = new JLabel(imageTitles[i], SwingConstants.CENTER);
            JPanel singleImagePanel = new JPanel(new BorderLayout());
            singleImagePanel.add(imageLabel, BorderLayout.CENTER);
            singleImagePanel.add(titleLabel, BorderLayout.SOUTH);
            imagePanel.add(singleImagePanel);
        }

        contentPanel.add(imagePanel, BorderLayout.CENTER);
    }
}
