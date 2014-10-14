package es.upm.miw.pd.ecp1.doo2.vehiculos;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class VehiculoTest {
	VehiculoHandler vh = new VehiculoHandler();
	
	@Before
    public void before() {
		Categoria catA, catB, catC;
		catA = Categoria.A;
		catB = Categoria.B;
		catC = Categoria.C;		
		
        vh.add(new Coche(1,"Coche1A", catA));
        vh.add(new Coche(2,"Coche2B", catB));
        vh.add(new Coche(3,"Coche3C", catC));
        vh.add(new Moto(4,"Moto4"));
        vh.add(new Bicicleta(5,"Moto5"));      		
    }
	
	@Test
    public void testPrecioCoche() {		
		assertEquals(10,vh.precioVehiculo(1,1), 0);
		assertEquals(38,vh.precioVehiculo(1,4), 0);
    }	
	
	
	@Test
    public void testPrecioMoto() {
		assertEquals(8,vh.precioVehiculo(4,1), 0);
		assertEquals(63,vh.precioVehiculo(4,9), 0);
    }
	
	@Test
    public void testPrecioBicicleta() {
		assertEquals(6,vh.precioVehiculo(5,2), 0);
		assertEquals(10,vh.precioVehiculo(5,4), 0);
    }
	
	@Test
    public void testImprimirVehiculos() {
		String veh1=" VEHICULO: Id. 1 Desc. Coche1A ";
		String veh2="VEHICULO: Id. 2 Desc. Coche2B ";
		String veh3="VEHICULO: Id. 3 Desc. Coche3C ";
		String veh4="VEHICULO: Id. 4 Desc. Moto4 ";
		String veh5="VEHICULO: Id. 5 Desc. Moto5";
		assertEquals(veh1+veh2+veh3+veh4+veh5,vh.imprimirVehiculos());
    }
	
}
