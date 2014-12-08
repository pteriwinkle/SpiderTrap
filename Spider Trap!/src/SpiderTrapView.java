import java.awt.*;

import javax.swing.*;

import java.awt.Graphics; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpiderTrapView extends JFrame implements ActionListener {
    private static final String PAUSE_COMMAND = "pause", RESUME_COMMAND = "resume",
            NEW_GAME_COMMAND = "new game"; 
    //responsible for drawing - reference to objects?
    //controller passes objects to view
    SpiderTrapPanel panel; 
    SpiderTrapModel model; 
    
    public SpiderTrapView(SpiderTrapPanel panel, SpiderTrapModel model) {
        this.model = model; 
        
        this.setSize(600, 600); //HOW TO MAKE THIS A CONSTANT ACCESIBLE IN ANY CLASS
        this.setLocation(100, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        
        this.panel = panel; 
        mainPanel.add(this.panel, BorderLayout.CENTER); 
        
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1, 2));
        
        JPanel leftBottomPanel = new JPanel(); 
        JButton pauseButton = new JButton(PAUSE_COMMAND);
        leftBottomPanel.add(pauseButton);
        //pauseButton.addActionListener(this);
        JButton resumeButton = new JButton(RESUME_COMMAND);
        leftBottomPanel.add(resumeButton);
        //resumeButton.addActionListener(this);
        JButton newGameButton = new JButton(NEW_GAME_COMMAND);
        leftBottomPanel.add(newGameButton);
        newGameButton.addActionListener(this); 
        bottomPanel.add(leftBottomPanel); 
        JLabel score = new JLabel("Score " + model.getScore());
        bottomPanel.add(score); 
        
        JPanel rightBottomPanel = new JPanel(); 
        JButton tempButton = new JButton("There will be things here!");
        rightBottomPanel.add(tempButton);
        bottomPanel.add(rightBottomPanel); 
        
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
        
        this.setContentPane(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand(); 
        System.out.println("YES WE CAN!"); 
        if (command.equals(NEW_GAME_COMMAND)){
            for (int i = 0; i < model.getWeb().size(); i++) {
                model.getWeb().remove(i); 
            }
            panel.repaint(); 
        }
    }

    
    
    
    //paint component for flies, spider - draws them all 
    //paint component: called when controller says view.repaint

}
