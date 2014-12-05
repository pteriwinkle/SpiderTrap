import java.awt.Color;


public class Line {
    private int[] startPoint = new int[2];  //does this work
    private int[] endPoint = new int[2]; 
    private Color color; 
    
    public Line(int x1, int y1, int x2, int y2) { 
        startPoint[0] = x1; 
        startPoint[1] = y1; 
        endPoint[0] = x2; 
        endPoint[1] = y2; 
        color = Color.black; 
    }
    
    public int[] getStartPoint() {
        return startPoint; 
    }
    
    public int[] getEndPoint() {
        return endPoint; 
    }
    
    //don't need setters for now
}
