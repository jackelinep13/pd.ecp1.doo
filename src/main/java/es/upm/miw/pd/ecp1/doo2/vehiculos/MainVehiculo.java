package es.upm.miw.pd.ecp1.doo2.vehiculos;

import upm.jbb.IO;

public class MainVehiculo {
	private int dias, id;
	private double precio=0;
	private Coche coche;
	private Moto moto;
	private Bicicleta bici;
	private VehiculoHandler vh = new VehiculoHandler();
	
    public void moto() {    	
    	moto = (Moto) IO.in.read(Moto.class,"mensaje"); 
    	vh.add(moto);
    }
   
    public void bicicleta() {
    	bici = (Bicicleta) IO.in.read(Bicicleta.class,"mensaje"); 
    	vh.add(bici);
    	
    }
    
    public void Coche() {
    	coche = (Coche) IO.in.read(Coche.class,"mensaje");  
    	vh.add(coche);
    }
    
    public void mostrarVehiculos(){		
		String vehiculosTotales="";
		vehiculosTotales = vh.imprimirVehiculos();
		IO.out.println(" " + vehiculosTotales);
	}
	
	public void verPrecio(){	
		this.id = (int) IO.in.readInt("Id: ");
		this.dias = (int) IO.in.readInt("Dias: ");
		precio = vh.precioVehiculo(id, dias);
		IO.out.println("Precio: " + precio);
	}

    public static void main(String[] args) {     	
        IO.in.addController(new MainVehiculo());
    }
}