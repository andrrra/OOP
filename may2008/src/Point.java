public class Point extends Shape implements Comparable {
    // the three coordinates of the point.
    private double x;
	private double y;
	private double z;

    // public accessor methods
    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }

    // two points are equal if their coordinates are equal
    public boolean equals(Point p) { 
        return x == p.x && y == p.y && z == p.z;
    }

    // allows points to be used in the Java Collections framework
    // sorted set implementations.
    public int compareTo(Object o) {
        Point p = (Point) o;
        if ( this.x < p.x ) return -1;
        else if ( this.x > p.x ) return 1;
        else if ( this.y < p.y ) return -1;
        else if ( this.y > p.y ) return 1;
        else if ( this.z < p.z ) return -1;
        else if ( this.z > p.z ) return 1;
        else return 0;
    }

    // in case you want to print points
    public String toString() { return "(" + x + "," + y + "," + z + ")"; }

    // public constructor - must specify the coordinates
    public Point(double x, double y, double z) {
        this.x = x; this.y = y; this.z = z;
    }

    //<<1a Implement your translate method here
    public void translate (double xx, double yy, double zz){
    	x+=xx;
    	y+=yy;
    	z+=zz;    
    }    
    //>>1a
}
