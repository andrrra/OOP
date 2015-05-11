/**
 * Created by Andra on 07.03.2015.
 */
public class Circle {
    private Point2DDouble centre;
    private double radius;
    public Circle(Point2DDouble centre, double radius){
        this.centre=centre;
        this.radius=radius;
    }
    //Class constructor.
    public Circle(){
        this(new Point2DDouble(0, 0), 1);
    }
    //Class constructor. The centre is a point at (0, 0) and the radius is 1.
    public boolean isPointInside(Point2DDouble pt){
        double distance = Point2DDouble.distance(centre, pt);
        return distance<radius;
    }
    //Returns true if the circle contains the point pt. You can compute this by calculating the distance between the pt and
    // the circle’s centre, and seeing if this is smaller than the radius.
}
