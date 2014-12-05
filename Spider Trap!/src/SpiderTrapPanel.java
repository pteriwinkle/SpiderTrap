import java.awt.Graphics;

import javax.swing.JPanel;

 public class SpiderTrapPanel extends JPanel {
     
        SpiderTrapModel model; 
         
        public SpiderTrapPanel(SpiderTrapModel model) {
            this.model = model; 
        }
        
        public void paintComponent(Graphics g) {
            if (model == null) 
                return; 
            for (int i = 0; i < model.getWeb().size(); i++) {
                int[] startPoint; 
                int[] endPoint; 
                startPoint = model.getWeb().get(i).getStartPoint();
                endPoint = model.getWeb().get(i).getEndPoint();
                g.drawLine(startPoint[0], startPoint[1], endPoint[0], endPoint[1]);
            }
        }

    }