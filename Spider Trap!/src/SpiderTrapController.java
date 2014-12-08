import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class SpiderTrapController implements MouseListener, MouseMotionListener{
    
    private SpiderTrapView view; 
    private SpiderTrapModel model; 
    int x, y; 
    private Line previouslyDrawnLine = null; 
	//timer in controller: tell model to update positions, give new positions
	//controller --> model --> view 
    
    public SpiderTrapController(SpiderTrapModel model, SpiderTrapView view) {
        this.model = model; 
        this.view = view; 
    }

	@Override
	public void mouseClicked(MouseEvent e) { 
	    model.getPlayer().setX(e.getX());
	    model.getPlayer().setY(e.getY());
	    view.repaint(); 
		//model.something
		//view.something
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	    x = e.getX(); 
	    y = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	    if (previouslyDrawnLine == null) 
	        return; 
	    double distance = Math.sqrt(Math.pow((previouslyDrawnLine.getStartPoint()[0] - previouslyDrawnLine.getEndPoint()[0]), 2) +
	            Math.pow((previouslyDrawnLine.getStartPoint()[1] - previouslyDrawnLine.getEndPoint()[1]), 2)); 
	    System.out.println(distance); 
	    if (distance < 10) {
	        model.removeLine(previouslyDrawnLine);
	        view.repaint();
	    }
	    previouslyDrawnLine = null; 
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

    @Override
    public void mouseDragged(MouseEvent e) { 
        if (previouslyDrawnLine != null) {
            model.removeLine(previouslyDrawnLine);
        }
        model.createLine(x, y, e.getX(), e.getY());
        previouslyDrawnLine = model.getWeb().get(model.getWeb().size()-1); 
        view.repaint();  
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

}
