package es.upm.miw.pd.ecp1.doo2.vehiculos;

public class Moto extends Vehiculo{

	public Moto(int id, String descripcion){	
		super(id, descripcion);
	}

	@Override
	public double precio(int dias) {
		double precio=0;
		
		precio = (dias <= 7) ?  8*dias : 7*dias;
		return precio;
	}
	
}
