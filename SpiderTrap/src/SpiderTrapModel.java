 import java.util.ArrayList;

public class SpiderTrapModel {
	//tracks location, etc.

    private final int EAT_FLY_SCORE = 5, DESTROY_WEB_SCORE = -10; 
    private Spider player; 
    private ArrayList<Fly> flies = null; //nothing @ beginning
    private ArrayList<Line> web = null; //nothing @ beginning
    private int level; 
    private int score; 
    
    //start game?
    //no reference to view 
    
    public SpiderTrapModel( ) {
        //set player, level (1)
    }

    public void movePlayer( ) {
        //moves player depending on click
    }

    public void generateFlies( ) {
        //generates # of flies depending on level
    }

    public void createLine(int x1, int y1, int x2, int y2) {
    	Line line = new Line(x1, y1, x2, y2); 
    	web.add(line);
        //create string depending on mouse drag
    }
    
    public void removeLine(Line line) {
    	for (int i = 0; i < web.size(); i++) {
    		if (line == web.get(i)) {
    			web.remove(i); 
    			return; 
    		}
    	}
        //removes line from web
    }

    public boolean eatFly(Fly fly) {
        //removes a fly from flies & makes player slightly bigger
        return false;
    }

    public void changeScore(int num) {
        //increases or decreases score 
    }

    public void increaseLevel( )  {
        //++level
    }

    public void increaseWebLevel( ) {
        //adds on to amount of webs you can make
    }
    
    public void updateFlyPositions() {
    	
    }

//getters & setters

}

