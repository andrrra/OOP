/**
 * Created by Andra on 24.02.2015.
 */
public class Vector3D {

    private double x,y,z;

    public Vector3D(double x, double y, double z) {
        //class constructor
        this.x=x;
        this.y=y;
        this.z=z;
    }


    public double getR() {
        return Math.sqrt(x*x+y*y+z*z);
    }

    public double getTheta(){
        return Math.acos(z/getR());
    }

    public double getPhi(){
        return Math.atan2(y,x);
    }

    public static Vector3D add(Vector3D lhs, Vector3D rhs){
        return new Vector3D(lhs.x+rhs.x, lhs.y+rhs.y, lhs.z+rhs.z);
    }

    public static Vector3D subtract(Vector3D lhs, Vector3D rhs){
        return new Vector3D(lhs.x-rhs.x, lhs.y-rhs.y, lhs.z-rhs.z);
    }
    public static Vector3D scale( Vector3D v, double scaleFactor){
        return new Vector3D(v.x*scaleFactor,v.y*scaleFactor, v.z*scaleFactor );
    }

}
