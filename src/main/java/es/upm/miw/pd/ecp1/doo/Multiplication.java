package es.upm.miw.pd.ecp1.doo;

public class Multiplication extends Operations{
	
    private final int operator1, operator2;

    public Multiplication(final int operator1, final int operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    public int getOperator1() {
        return operator1;
    }

    public int getOperator2() {
        return operator2;
    }

    @Override
    public int calculo() {
        return this.operator1 * this.operator2;
    }

    @Override
    public String toString2() {
        return "[" + operator1 + "*" + operator2 + "]";
    }


	
	
}