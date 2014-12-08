import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;

import javax.swing.JPanel;

 public class SpiderTrapPanel extends JPanel {
     
        SpiderTrapModel model; 
         
        public SpiderTrapPanel(SpiderTrapModel model) {
            this.model = model; 
        }
        
        public void paintComponent(Graphics g) {
            int borderWidth = 50; 
            g.setColor(Color.gray);
            g.fillRect(0, 0, this.getWidth(), borderWidth);
            g.fillRect(this.getWidth() - borderWidth, 0, borderWidth, this.getHeight());
            g.fillRect(0, 0, borderWidth, this.getHeight());
            g.fillRect(0, this.getHeight() - borderWidth, this.getWidth(), borderWidth);
            if (model == null) 
                return; 
            for (int i = 0; i < model.getWeb().size(); i++) { //draw strings
                g.setColor(Color.black);
                int[] startPoint; 
                int[] endPoint; 
                startPoint = model.getWeb().get(i).getStartPoint();
                endPoint = model.getWeb().get(i).getEndPoint();
                g.drawLine(startPoint[0], startPoint[1], endPoint[0], endPoint[1]);
            }
            g.setColor(model.getPlayer().getColor());
            g.fillOval(model.getPlayer().getX()-model.getPlayer().getRadius()/2, model.getPlayer().getY()-model.getPlayer().getRadius()/2, model.getPlayer().getRadius(),
                    model.getPlayer().getRadius());
        }
        
//        public void panelDisplay(Graphics g, String str) {
//            g.drawString(str, Panel.WIDTH/2, Panel.HEIGHT/2);
//        }

    }