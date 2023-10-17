import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class AnalyticsPanel extends SwitchablePanel {
    
    private List<Post> posts;
    protected JComboBox<String> sortComboBox;
    protected JList<Post> postsList;

    public AnalyticsPanel(MainAppFrame frame) {
        super(frame);
        addSpecificFeatures();
    }

    protected void addSpecificFeatures() {
        posts = loadPostsFromCSV("post.csv");
        updatePostsDisplay();

        // Title setup
        JLabel label = new JLabel("AnalyticsPanel", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 32));
        titlePanel.add(la bel);

        // Sort options
        String[] options = {"Content A-Z", "Author", "#likes", "#shares", "#Date old-recent"};
        sortComboBox = new JComboBox<>(options);
        sortComboBox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                sortPosts((String) e.getItem());
                updatePostsDisplay();
            }
        });
        topPanel.add(sortComboBox, BorderLayout.EAST); 
    }

    private void sortPosts(String criteria) {
        // Sort posts based on the selected criteria
        posts.sort((a, b) -> {
            switch (criteria) {
                case "Content A-Z": return a.getContent().compareTo(b.getContent());
                case "Author": return a.getAuthor().compareTo(b.getAuthor());
                case "#likes": return Integer.compare(b.getLikes(), a.getLikes());
                case "#shares": return Integer.compare(b.getShares(), a.getShares());
                case "#Date old-recent": return a.getDateTime().compareTo(b.getDateTime());
                default: return 0;
            }
        });
    }

    private void updatePostsDisplay() {
        if (postsList == null) {
            postsList = new JList<>(posts.toArray(new Post[0]));
            JScrollPane scrollPosts = new JScrollPane(postsList, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
            scrollPosts.setBorder(new TitledBorder("List of posts"));
            add(scrollPosts, BorderLayout.CENTER);
        } else {
            postsList.setListData(posts.toArray(new Post[0]));
        }
    }
    private List<Post> loadPostsFromCSV(String filename) {
        List<Post> loadedPosts = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            br.readLine(); // skip header
    
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                
                if (values.length != 6) continue;
                
                try {
                    loadedPosts.add(new Post(
                        Integer.parseInt(values[0].trim().replace("\"", "")),
                        values[1].trim().replace("\"", ""),
                        values[2].trim().replace("\"", ""),
                        Integer.parseInt(values[3].trim().replace("\"", "")),
                        Integer.parseInt(values[4].trim().replace("\"", "")),
                        values[5].trim().replace("\"", "")
                    ));
                } catch (NumberFormatException ignored) {
                    System.err.println("Error parsing line: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        return loadedPosts;
    }
}
