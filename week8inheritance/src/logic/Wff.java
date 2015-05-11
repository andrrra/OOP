package logic;

public abstract class Wff {

    public abstract boolean eval(Valuation val);

    @Override
    public abstract String toString();

}