import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SpiderTrapView extends JFrame {
    private static final String PAUSE_COMMAND = "pause", RESUME_COMMAND = "resume",
            NEW_GAME_COMMAND = "new game"; 
    //responsible for drawing - reference to objects?
    //controller passes objects to view
    
    public SpiderTrapView(int width, int height) {
        this.setSize(width, height);
        this.setLocation(100, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        //add spider game panel here
        
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1, 2));
        
        JPanel leftBottomPanel = new JPanel(); 
        JButton pauseButton = new JButton(PAUSE_COMMAND);
        leftBottomPanel.add(pauseButton);
        JButton resumeButton = new JButton(RESUME_COMMAND);
        leftBottomPanel.add(resumeButton);
        JButton newGameButton = new JButton(NEW_GAME_COMMAND);
        leftBottomPanel.add(newGameButton);
        bottomPanel.add(leftBottomPanel); 
        
        JPanel rightBottomPanel = new JPanel(); 
        JButton tempButton = new JButton("There will be things here!");
        rightBottomPanel.add(tempButton);
        bottomPanel.add(rightBottomPanel); 
        
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
        
        this.setContentPane(mainPanel);
    }
    
    //paint component for flies, spider - draws them all 
    //paint component: called when controller says view.repaint

}
