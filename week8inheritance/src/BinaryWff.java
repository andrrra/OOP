/**
 * Created by Andra on 12.03.2015.
 */
public class BinaryWff {

    private Operator op = null;
    private PropVar left;
    private PropVar right;


    public BinaryWff(PropVar left, PropVar right){
        this.left=left;
        this.right=right;
    }
    public void setOp(Operator op){
        this.op=op;
    }
    public Operator getOp(){
        return op;
    }
    public PropVar getLeft(){
        return left;
    }
    public PropVar getRight(){
        return right;
    }
    public String toString() {
        //Return a string of the form (<left> <op> <right>).
        String s = String.format("(%s %s %s)", left, op, right);
        return s;
    }
}
