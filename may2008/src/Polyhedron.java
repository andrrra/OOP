// needed for recommended approach to part d
import java.util.*;

public class Polyhedron extends Shape {
    private Polygon[] faces;
    public Polyhedron(Polygon[] faces) { this.faces = faces; }
    public int numFaces() { return faces.length; }
    public Polygon getFace(int i) { return faces[i]; }
    public String toString() { return faces.toString(); }

    //<<1d Implement your getVertices method here

    //>>1d
}
