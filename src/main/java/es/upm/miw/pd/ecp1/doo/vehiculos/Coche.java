package es.upm.miw.pd.ecp1.doo.vehiculos;

public class Coche extends Vehiculo{
	
	public Coche(int id, String descripcion, Categoria categoria){	
		super(id, descripcion);		
	}

	@Override
	public double precio(int dias) {		
		return 0.0;
	}
	
	

}
