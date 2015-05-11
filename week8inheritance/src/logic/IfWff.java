package logic;

/**
 * Created by Andra on 12.03.2015.
 */
public class IfWff extends BinaryWff{
    public IfWff(Wff left, Wff right){
        super(left,right);
        setOp(Operator.IF);
    }
    @Override
    public boolean eval(Valuation val) {
        return (!(getLeft().eval(val)) || getRight().eval(val));
    }
}
