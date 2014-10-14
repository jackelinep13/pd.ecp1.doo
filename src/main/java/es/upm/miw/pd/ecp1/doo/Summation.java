package es.upm.miw.pd.ecp1.doo;

public class Summation extends Operations{

    public Summation(final int operator1, final int operator2) {
    	super(operator1, operator2);
    }


    @Override
    public int calculo() {
        return this.operator1 + this.operator2;
    }

    @Override
    public String toString() {
        return "[" + operator1 + "+" + operator2 + "]";
    }

}
