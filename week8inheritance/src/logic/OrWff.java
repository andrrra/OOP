package logic;

/**
 * Created by Andra on 12.03.2015.
 */
public class OrWff extends BinaryWff{
    public OrWff(Wff left, Wff right){
        super(left,right);
        setOp(Operator.OR);
    }
    @Override
    public boolean eval(Valuation val) {
        return (getLeft().eval(val) || getRight().eval(val));
    }
}
