// This class is a dummy class, which just provides
// some default methods to make testing and marking easier.
// Don't rely on anything in it.
public abstract class Shape {
    public double getX() { throw new UnsupportedOperationException(); }
    public double getY() { throw new UnsupportedOperationException(); }
    public double getZ() { throw new UnsupportedOperationException(); }
    public void translate(double xx, double yy, double zz) {
	throw new UnsupportedOperationException();
    }
    public Point centre() { throw new UnsupportedOperationException(); }
    public Point[] getVertices() { throw new UnsupportedOperationException(); }
}
