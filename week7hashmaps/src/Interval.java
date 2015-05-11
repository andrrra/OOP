/**
 * Created by Andra on 05.03.2015.
 */
public class Interval {

    private double left, right;

    public Interval(double left, double right) {
//    Class constructor. The values of left and right are the two endpoints of the interval.
        this.left=left;
        this.right=right;
    }

    public boolean doesContain(double x) {
        if (isEmpty())  return false ;
        else return (left < x && x < right);
//    Returns true if and only if x lies between left and right, and the interval is not empty (i.e. left < right).
    }
    public boolean isEmpty(){
//    Returns true if and only if left is larger than right.
        return (left>right);
    }
    public boolean intersects(Interval b) {
//    Returns true if and only if the Interval b intersects with this interval. Note that empty intervals can’t intersect with other
// intervals.
        if (isEmpty() || b.isEmpty()) return false;
        if (left > b.right) {
            return false;
        }
        if (right < b.left) {
            return false;
        }
        return true;
    }
    public String toString(){
//    Returns a string summarising the Interval; for example "Interval: [2.5, 5.0]" or "Interval: (EMPTY)".
        if (isEmpty()) {
            return "Interval: (EMPTY)";
        }
        return "Interval: [" + left + ", " + right + "]";
    }
}
