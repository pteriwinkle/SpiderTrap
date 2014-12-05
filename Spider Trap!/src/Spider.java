import java.awt.Color;


public class Spider {
    int radius = 10; 
    int x, y; //middle of circle
    Color color = Color.black; 
    
    public Spider(int x, int y) {
        this.x = x;
        this.y = y; 
    }
	
    public Spider(int x, int y, Color color) {
       //Spider(x, y); how to
       this.color = color; 
    }

    public int getX() {
        return x; 
    }
	
    public int getY() {
        return y; 
    }
    
    public void setX(int x) {
       this.x = x; 
    }
    
    public void setY(int y) {
        this.y = y; 
    }


}
