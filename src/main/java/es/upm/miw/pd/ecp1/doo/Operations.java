package es.upm.miw.pd.ecp1.doo;

public abstract class Operations {
    
	protected int operator1, operator2;
	
	public Operations(int operator1, int operator2) {
		this.operator1 = operator1;
		this.operator2 = operator2;
    }
	
	public abstract int calculo();
    public abstract String toString();
    
    

}
