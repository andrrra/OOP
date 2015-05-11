package logic;

/**
 * Created by Andra on 12.03.2015.
 */
public class AndWff extends BinaryWff{
    public AndWff(Wff left, Wff right){
        super(left,right);
        setOp(Operator.AND);
    }
    @Override
    public boolean eval(Valuation val) {
        return (getLeft().eval(val) && getRight().eval(val));
    }

}

