package logic;

/**
 * Created by Andra on 12.03.2015.
 */
public class NotWff extends Wff {
    private Wff wff;
    private Operator op;

    public NotWff(Wff prop) {
        this.wff = prop;
        this.op = Operator.NEG;
    }

    public boolean eval(Valuation val) {
        return !(wff.eval(val));
    }

    public String toString() {
        String s = String.format("%s%s", op, wff);
        return s;
    }

}
