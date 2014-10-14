package es.upm.miw.pd.ecp1.doo2.vehiculos;

public class Bicicleta extends Vehiculo{

	public Bicicleta(int id, String descripcion){	
		super(id, descripcion);
	}

	@Override
	public double precio(int dias) {
		double precio=0;
		
		precio = (dias <= 2) ?  3*dias : (3*2 + (2*(dias-2)));
		return precio;
		
	}
	
}

