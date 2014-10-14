package es.upm.miw.pd.ecp1.doo2.vehiculos;

public abstract class Vehiculo {
	
	private int id;
	private String descripcion;
	
	public Vehiculo(int id, String descripcion){
		this.id=id;
		this.descripcion=descripcion;
	}
		
	public int getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public abstract double precio(int dias);
	
}

