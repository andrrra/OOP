/**
 * Created by Andra on 12.03.2015.
 */
public class AndWff extends BinaryWff {
    public AndWff(PropVar left, PropVar right){
        super(left, right);
        setOp(Operator.AND);
    }
    //Class constructor. This should call the constructor of its superclass, and also specify that its operator is Operator.AND.

}
