package logic;

public class BinaryWff extends Wff {

    private Operator op = null;
    private Wff left;
    private Wff right;

    public BinaryWff(Wff left, Wff right) {
        this.left = left;
        this.right = right;
    }

    public void setOp(Operator op) {
        this.op = op;
    }

    public Operator getOp() {
        return op;
    }

    public Wff getLeft() {
        return left;
    }

    public Wff getRight() {
        return right;
    }

    @Override
    public boolean eval(Valuation val) {
        return false;
    }

    @Override
    public String toString() {
        String s = String.format("(%s %s %s)", left, op, right);
        return s;
    }
}