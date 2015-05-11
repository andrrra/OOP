/**
 * Created by Andra on 07.03.2015.
 */
public class Rectangle {
    private Point2DDouble topLeft, bottomRight;
    public Rectangle(Point2DDouble topLeft, Point2DDouble bottomRight){
        this.topLeft=topLeft;
        this.bottomRight=bottomRight;
    }
    //Class constructor
    public Rectangle(){
        this(new Point2DDouble(0,0),new Point2DDouble(1,1));
    }
    //Class constructor for a rectangle whose top left is at (0, 0) and whose bottom right is at (1, 1).
    public boolean isPointInside(Point2DDouble pt){
        if(topLeft.getX()>pt.getX()) return false;
        if(topLeft.getY()>pt.getY()) return false;
        if(bottomRight.getX()<pt.getX()) return false;
        if(bottomRight.getY()<pt.getY()) return false;
        return true;
    }
    //Return true if the rectangle contains the point pt. You can compute this by determining if the x coordinate of pt lies between
    // the topLeft x coordinate and the bottomRight x coordinate. If this is true, and also true for the y coordinates, then the
    // rectangle contains the point. We are assuming the origin of the coordinate system, point (0, 0), is in the top-left-most
    // position, so x increases from left to right and y increases from top to bottom.
}
