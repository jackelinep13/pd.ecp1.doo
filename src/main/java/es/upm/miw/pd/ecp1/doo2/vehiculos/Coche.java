package es.upm.miw.pd.ecp1.doo2.vehiculos;

public class Coche extends Vehiculo{
	private Categoria cat;
	
	public Coche(int id, String descripcion, Categoria categoria){	
		super(id, descripcion);
		this.cat=categoria;		
	}

	@Override
	public double precio(int dias) {
		double precio=0, base=0;
		if(this.cat==Categoria.A) base = 10;
		if(this.cat==Categoria.B) base = 15;
		if(this.cat==Categoria.C) base = 20;
		
		if(dias <= 3) precio=base*dias;
		else if(dias <= 7) precio=base*3+(base*0.8*(dias-3));
		else precio=base*3+(base*0.8*4)+(base*0.5*(dias-7));
		
		return precio;
	}
	
	

}

