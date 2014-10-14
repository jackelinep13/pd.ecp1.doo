package es.upm.miw.pd.ecp1.doo2.vehiculos;

public class VehiculoHandler {

	private Vehiculo[] vehiculos = new Vehiculo[10];
	
	public void add(Vehiculo vehic) {
        for (int i = 0; i < vehiculos.length; i++) {        	
            if (vehiculos[i] == null) {
            	vehiculos[i] = vehic;
            	return;
            }
        }
        return;
    }
    
    
    public double precioVehiculo(int ident, int dias) { 
    	double tot=0;
    	for (int i = 0; i < vehiculos.length; i++) {
    		if(vehiculos[i]!=null){
	        	if (ident == vehiculos[i].getId()){
	        		tot=vehiculos[i].precio(dias);
	        	}
    		}	        	
        }  
    	return tot;    	
    }
    
    public String imprimirVehiculos() {
        String resultado="";
        for (Vehiculo vehic : vehiculos) {
            if (vehic != null) {               
                resultado +=  " VEHICULO: " + "Id. " + vehic.getId() + " Desc. " + vehic.getDescripcion() ;                
            }            
        }
        return resultado;
    }
	
}

