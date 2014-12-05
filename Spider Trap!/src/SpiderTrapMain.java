    import java.awt.Color;

    import javax.swing.JFrame;

public class SpiderTrapMain {

        public static void main(String[] args) {
//            JFrame window = new JFrame("Spider Trap!");
//            window.setSize(600, 400);
//            window.setLocation(100, 200);
//            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            SpiderTrapView gamePanel = new SpiderTrapView(600, 600);
            gamePanel.setVisible(true);
            gamePanel.requestFocus();
        }
    

}
