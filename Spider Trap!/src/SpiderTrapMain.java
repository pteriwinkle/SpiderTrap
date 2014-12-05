    import java.awt.Color;

    import javax.swing.JFrame;

public class SpiderTrapMain {

        public static void main(String[] args) {
//            JFrame window = new JFrame("Spider Trap!");
//            window.setSize(600, 400);
//            window.setLocation(100, 200);
//            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            SpiderTrapModel model = new SpiderTrapModel(); 
            SpiderTrapPanel panel = new SpiderTrapPanel(model); 
            SpiderTrapView view = new SpiderTrapView(panel); 
            SpiderTrapController controller = new SpiderTrapController(model, view);
            panel.addMouseMotionListener(controller);
            panel.addMouseListener(controller);
            view.setVisible(true);
            view.requestFocus();

        }
    

}
