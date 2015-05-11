public class Polygon extends Shape {
    private Point[] vertices;
    
    // public constructor just takes an array of points
    public Polygon(Point[] vertices) { this.vertices = vertices; }

    public String toString() { return vertices.toString(); }

    // accessor method
    // get all the vertices as an array
    public Point[] getVertices() { return vertices; }

    //<<1b Implement your translate method here
    
    public void translate(double xx, double yy, double zz){
    	for (Point v:vertices)
    		v.translate(xx, yy, zz);
    }

    //>>1b

    //<<1c Implement your centre method here
    
    public Point centre (Point[] vertices){
    	double x=0,y=0,z=0, i=0;
    	for (Point v:vertices) {
    		x+=v.getX();
    		y+=v.getY();
    		z+=v.getZ();
    		i++;
    	}
    	x/=i;
    	y/=i;
    	z/=i;
    	return (x,y,z);
    	
    }

    //>>1c
}
